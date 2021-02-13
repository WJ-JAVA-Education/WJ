package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.CSingelton;
import model.UserData;

public class HomePageController implements Initializable {

	@FXML
	private JFXTextField password;

	@FXML
	private JFXTextField fullname;

	@FXML
	private JFXTextField host;

	@FXML
	private TableView<UserData> tvTeam01;

	@FXML
	private TableColumn<UserData, String> colPass;
	@FXML
	private TableColumn<UserData, String> colFname;
	@FXML
	private TableColumn<UserData, String> colHost;

	@FXML
	private Button btnUpdate;
	@FXML
	private Button btnDelete;

	CSingelton Singelton = CSingelton.getInstance();

	@FXML
	public void handelButton(ActionEvent event) {

		if (event.getSource() == btnUpdate) {
			updateRow();
		} else if (event.getSource() == btnDelete) {
			deleteRow();
		}

		showTeam01();
	}
	public ObservableList<UserData> getTeam01List() {
		ObservableList<UserData> team01List = FXCollections
				.observableArrayList();
		String sql = "SELECT * FROM Userdata";
		Connection conn = Singelton.getDBConnect();
		Statement stmt;
		ResultSet rs;

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			UserData team01;
			while (rs.next()) {
				team01 = new UserData(rs.getString("name"), rs.getString("id"),
						rs.getString("password"), rs.getString("permit"));
				team01List.add(team01);
			}
		} catch (Exception e) {
			System.out.println("DB에서 sql문을 실행불가: " + e);
		}

		return team01List;
	}

	public void showTeam01() {
		ObservableList<UserData> list = getTeam01List();
		tvTeam01.setItems(list);
		colPass.setCellValueFactory(
				new PropertyValueFactory<UserData, String>("id"));
		colFname.setCellValueFactory(
				new PropertyValueFactory<UserData, String>("password"));
		colHost.setCellValueFactory(
				new PropertyValueFactory<UserData, String>("permit"));

	}

	@Override
	public void initialize(java.net.URL location, ResourceBundle resources) {
		showTeam01();
		tvTeam01.getSelectionModel().selectedItemProperty().addListener(
				(obs, oldValue, newValue) -> showTeam01Details(newValue));
	}

	private void showTeam01Details(UserData team01) {
		if (team01 != null) {
			password.setText(team01.getId());
			fullname.setText(team01.getPassword());
			host.setText(team01.getPermit());

		} else {
			password.setText("");
			fullname.setText("");
			host.setText("");

		}

	}
	private void updateRow() {
		String sql = "UPDATE UserData SET password=?, name=?, permit=? WHERE id=?";

		Connection conn = Singelton.getDBConnect();
		PreparedStatement pstmt;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, password.getText());
			pstmt.setString(2, fullname.getText());
			pstmt.setString(3, host.getText());
			pstmt.executeUpdate();
			conn.commit();
		} catch (Exception e) {
			System.out.println("업데이트중 에러발생!");
		}
	}

	private void deleteRow() {
		String sql = "DELETE FROM UserData WHERE id=?";
		Connection conn = Singelton.getDBConnect();
		PreparedStatement pstmt;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, password.getText());
			pstmt.executeUpdate();
			conn.commit();
		} catch (Exception e) {
			System.out.println("삭제중 에러발생!");
		}
	}

}
