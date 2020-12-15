package view;

import java.net.URL;
import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.CSingelton;
import model.DBConnect;
import model.Mask;

public class MaskController implements Initializable {

	CSingelton mov = CSingelton.getInstance();
	DBConnect conn = new DBConnect();
	Connection connect;

	    @FXML
	    private Label ManagerOrViewer1;

	    @FXML
	    private TableView<Mask> tv_Mask;

	    @FXML
	    private TableColumn<Mask, String> tb_mType;

	    @FXML
	    private TableColumn<Mask, Integer> tb_mStock;

	    @FXML
	    private JFXPasswordField RrnField2;

	    @FXML
	    private JFXTextField RrnField1;

	    @FXML
	    private JFXComboBox<String> MaskTypeComboBox;

	    @FXML
	    private JFXButton MaskExit;

	    @FXML
	    private Label CantryMask;

	    @FXML
	    private JFXButton tvMask_Search;


	@FXML
	void MaskExitbtn(ActionEvent event) {
		MaskExit.getScene().getWindow().hide();
	}

	@FXML
    void MaskTypeComboBoxbtn(ActionEvent event) {
		DBConnect conn = new DBConnect();
		Connection connect;
		
	
    }
    
	
	@FXML
	void tvMask_SearchBtn(ActionEvent event) {

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		CSingelton mov = CSingelton.getInstance();
		DBConnect conn = new DBConnect();
		Connection connect;
		ResultSet rs;
		
		ObservableList<String> mList = FXCollections.observableArrayList("KF-94","KF-90","KF-80","KF-AD");
		showMaskList();
		getMaskList();
		MaskTypeComboBox.setItems(mList);
		if (mov.getManagerOrViewer() == 1) {
			ManagerOrViewer1.setText("�α��� ���� : ������");
		} else {
			ManagerOrViewer1.setText("�α��� ���� : ������");
		}
		
	}

	public ObservableList<Mask> getMaskList() { // ���̺� �信 ����ũ���̺��� �ִ� �ż���
		connect = conn.getConnection();
		ObservableList<Mask> MaskList = FXCollections.observableArrayList();
		String sql = "SELECT * FROM Mask";

		Statement stmt; // DB�� ���� ���� ��ü. => SQL ���� DB�� ����. (��ü ����)
		ResultSet rs; // DB���� �޾ƿ��� ���. (��ü ����)

		try {
			stmt = connect.createStatement(); // ���� ��ü ����. CONN ���� ���Ḹ �� createStatement ���� �������� �� //
			rs = stmt.executeQuery(sql); // ���� �� DB���� ������ �����ϰ� ����� ���� //

			while (rs.next()) {
				Mask mask = new Mask(
						rs.getString("KFType"), 
						rs.getInt("Stock"),
						rs.getString("RRnumber"), 
						rs.getInt("count"));
				
				MaskList.add(mask);
			}

		} catch (Exception e) {
			// ���� �߻� ��
			System.out.println("DB���� SQL���� ���� �Ұ�" + e);
		}
		return MaskList;
	}

	public void showMaskList() {
		ObservableList<Mask> Mask = getMaskList();
		// ���̺�信 ����Ʈ�� �ְ�
		tv_Mask.setItems(Mask);
		// ������ ���� �����͸� �ҷ����� �ڵ带 �ۼ�
		tb_mType.setCellValueFactory(new PropertyValueFactory<Mask, String>("KFType"));
		tb_mStock.setCellValueFactory(new PropertyValueFactory<Mask, Integer>("Stock"));

	}

}
