package view;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import application.Message;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.CSingelton;
import model.DBConnect;

public class LoginController {

	@FXML
	private AnchorPane anPane;

	@FXML
	private JFXTextField tfEmail;

	@FXML
	private JFXPasswordField tfPass;

	@FXML
	private JFXButton btnRegister;

	@FXML
	private JFXButton btnLogin;

	Message msg = new Message();
	DBConnect connect = new DBConnect();
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	@FXML
	void createLogin(ActionEvent event) throws SQLException, IOException {
		CSingelton mov = CSingelton.getInstance();
		String sql = "SELECT*FROM userdata WHERE id=? AND password=?";
		pstmt = mov.getDBConnect().prepareStatement(sql);
		pstmt.setNString(1, tfEmail.getText());
		pstmt.setNString(2, tfPass.getText());

		rs = pstmt.executeQuery();

		boolean LoginSucess = false;
		if (rs.next()) {
			if (tfEmail.getText().equals(rs.getNString("id"))
					&& tfPass.getText().equals(rs.getNString("PASSWORD"))) {
				if (rs.getNString("permit").equals("관리자")) {
					mov.setManagerOrViewer(1);
				}
				LoginSucess = true;
			}
			if (LoginSucess == true) {
				btnLogin.getScene().getWindow().hide();
				Stage home = new Stage();
				Parent root = FXMLLoader.load(
						getClass().getResource("../view/Main_KimtaeHeon.fxml"));
				Scene scene = new Scene(root);
				home.setScene(scene);
				home.show();
				msg.setMessage("Success!");
			}
		} else {
			msg.setMessage("아이디와 비밀번호가 잘못되었습니다.");

		}
	}

	@FXML
	void createregister(ActionEvent event) throws IOException {
		btnRegister.getScene().getWindow().hide();

		Stage signup = new Stage();
		Parent root = FXMLLoader
				.load(getClass().getResource("../view/SignUp.fxml"));
		Scene scene = new Scene(root);
		signup.setScene(scene);
		signup.show();
	}

}
