package view;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.CPage;
import model.CSingelton;
import model.DBConnect;
import model.Medicine;

public class CatalogController implements Initializable {
	@FXML
	private Label ManagerOrViewer;

	@FXML
	private TableView<Medicine> tbCatalog;
	@FXML
	private TableColumn<Medicine, String> tbname;
	@FXML
	private TableColumn<Medicine, String> tbchar;
	@FXML
	private TableColumn<Medicine, String> tbeffect;
	@FXML
	private TableColumn<Medicine, String> tbwarning;
	@FXML
	private TableColumn<Medicine, Date> tbexpirition;
	@FXML
	private TableColumn<Medicine, String> tbcompany;
	@FXML
	private TableColumn<Medicine, Integer> tbprice;
	@FXML
	private TableColumn<Medicine, Integer> tbstock;
	@FXML
	private Label CatalogManager;
	@FXML
	private ButtonBar Catalogbtnbar;
	@FXML
	private Button CDelete;
	@FXML
	private Button CExit;
	@FXML
	private Button goExpirition;

	CSingelton mov = CSingelton.getInstance();

	@FXML
	private Label label1;

	@FXML
	private ImageView imgCatal;

	@FXML
	void Exit(ActionEvent event) {
		CExit.getScene().getWindow().hide();
	}

	@FXML
	public void goExpiritionbtn(ActionEvent event) {
		Stage stage = new Stage();
		String FXMLRout = "../view/Mdate.fxml";
		try {
			CPage page = new CPage();
			page.CreatePage(stage, FXMLRout);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	DBConnect conn = new DBConnect();
	Connection connect;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		tbCatalog.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				imgCatal.setImage(new Image(mov.AryList2.get(
						tbCatalog.getSelectionModel().getSelectedIndex())));
			}
		});

		if (mov.getManagerOrViewer() == 1) {
			ManagerOrViewer.setText("로그인 정보 : 관리자");
		} else {
			ManagerOrViewer.setText("로그인 정보 : 열람자");
		}
		showMedicine();
		tbCatalog.getSelectionModel().selectedItemProperty().addListener(
				(Observable, oldValue, newValue) -> showBookDetails(newValue));
	}

	public ObservableList<Medicine> getMList() {
		connect = conn.getConnection();
		ObservableList<Medicine> medicineList = FXCollections
				.observableArrayList();
		String sql = "SELECT * FROM Medicine";

		Statement stmt;

		ResultSet rs;

		try {
			stmt = connect.createStatement();

			rs = stmt.executeQuery(sql);
			mov.AryList2.clear();
			Medicine medicine;
			while (rs.next()) {
				mov.AryList2.add(rs.getString("image"));
				medicine = new Medicine(rs.getString("name"),
						rs.getString("image"), rs.getString("character"),
						rs.getString("effect"), rs.getString("warning"),
						rs.getString("company"), rs.getDate("expiration"),
						rs.getInt("price"), rs.getInt("stock"));
				medicineList.add(medicine);
			}

		} catch (Exception e) {
			System.out.println("DB에서 SQL문을 실행 불가" + e);
		}
		return medicineList;
	}

	public void showMedicine() {
		ObservableList<Medicine> list = getMList();
		tbCatalog.setItems(list);
		tbname.setCellValueFactory(
				new PropertyValueFactory<Medicine, String>("name"));
		tbchar.setCellValueFactory(
				new PropertyValueFactory<Medicine, String>("character"));
		tbeffect.setCellValueFactory(
				new PropertyValueFactory<Medicine, String>("effect"));
		tbwarning.setCellValueFactory(
				new PropertyValueFactory<Medicine, String>("warning"));
		tbcompany.setCellValueFactory(
				new PropertyValueFactory<Medicine, String>("company"));
		tbexpirition.setCellValueFactory(
				new PropertyValueFactory<Medicine, Date>("expiration"));
		tbprice.setCellValueFactory(
				new PropertyValueFactory<Medicine, Integer>("price"));
		tbstock.setCellValueFactory(
				new PropertyValueFactory<Medicine, Integer>("stock"));
	}

	@FXML
	void OMPon(MouseEvent event) {

	}

	private void showBookDetails(Medicine medicine) { // <== newValue 는 books 의
														// 객체
		if (medicine != null) {
			label1.setText(medicine.getName());
		} else {
			label1.setText("");
		}
	}

	@FXML
	void DeleteTuple(ActionEvent event) {
		deleteRow();
		showMedicine();
	}
	public void deleteRow() {
		String sql = "DELETE Medicine where name= ?";
		String test = label1.getText();
		Connection connect = conn.getConnection();
		PreparedStatement pstmt;

		try {
			pstmt = connect.prepareStatement(sql);

			pstmt.setNString(1, label1.getText());

			pstmt.executeUpdate();
			connect.commit();
		} catch (Exception e) {
			System.out.println("업데이트 중  에러발생!");
		}
	}
}
