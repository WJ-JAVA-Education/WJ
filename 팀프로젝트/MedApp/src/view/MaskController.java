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
			ManagerOrViewer1.setText("로그인 정보 : 관리자");
		} else {
			ManagerOrViewer1.setText("로그인 정보 : 열람자");
		}
		
	}

	public ObservableList<Mask> getMaskList() { // 테이블 뷰에 마스크테이블을 넣는 매서드
		connect = conn.getConnection();
		ObservableList<Mask> MaskList = FXCollections.observableArrayList();
		String sql = "SELECT * FROM Mask";

		Statement stmt; // DB에 보낼 쿼리 객체. => SQL 문을 DB에 보냄. (객체 선언만)
		ResultSet rs; // DB에서 받아오는 결과. (객체 선언만)

		try {
			stmt = connect.createStatement(); // 쿼리 객체 생성. CONN 에서 연결만 후 createStatement 에서 생성해준 후 //
			rs = stmt.executeQuery(sql); // 접속 된 DB에서 쿼리를 실행하고 결과를 리턴 //

			while (rs.next()) {
				Mask mask = new Mask(
						rs.getString("KFType"), 
						rs.getInt("Stock"),
						rs.getString("RRnumber"), 
						rs.getInt("count"));
				
				MaskList.add(mask);
			}

		} catch (Exception e) {
			// 에러 발생 시
			System.out.println("DB에서 SQL문을 실행 불가" + e);
		}
		return MaskList;
	}

	public void showMaskList() {
		ObservableList<Mask> Mask = getMaskList();
		// 테이블뷰에 리스트를 넣고
		tv_Mask.setItems(Mask);
		// 각각의 열에 데이터를 불러오는 코드를 작성
		tb_mType.setCellValueFactory(new PropertyValueFactory<Mask, String>("KFType"));
		tb_mStock.setCellValueFactory(new PropertyValueFactory<Mask, Integer>("Stock"));

	}

}
