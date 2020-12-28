package view;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.sun.javafx.image.impl.ByteIndexed.Getter;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import model.CSingelton;
import model.CPage;

public class Number3 implements Initializable {
	CSingelton MOrV = CSingelton.getInstance();

	@FXML
	private Label ManagerOrViewer;

	@FXML
	private ImageView add;

	@FXML
	private ImageView add1;

	@FXML
	private ImageView input;

	@FXML
	private ImageView Manage;

	@FXML
	private ImageView ShelfLife;

	@FXML
	private JFXTextField SearchBox;

	@FXML
	private JFXButton Searchbtn;

	@FXML
	private ListView<String> SearchListBox;

	private PreparedStatement pstmt;

	StringBuilder strb = new StringBuilder();

	CPage page = new CPage();

	int UpDownCnt = -1;
	
	ArrayList<String> AryList = new ArrayList<String>();
	
	@FXML
	void ClikSreachBox(ActionEvent event) {

	}

	@FXML
	void onClickSearchbtn(ActionEvent event) {
		// 원하는 실행문
		MOrV.setSearchText(SearchBox.getText());
		Stage stage = new Stage();
		String FXMLRout = "../view/DBSearch.fxml";
		try {
			page.CreatePage(stage, FXMLRout);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resoruces) {
		SearchListBox.setVisible(false);
		SearchListBox.setFocusTraversable(false);
		Searchbtn.setFocusTraversable(false);
		if (MOrV.getManagerOrViewer() == 1) {
			ManagerOrViewer.setText("로그인 정보 : 관리자");
		} else {
			ManagerOrViewer.setText("로그인 정보 : 열람자");
		}

		input.setOnMouseClicked(evnet -> {
			Stage stage = new Stage();
			String FXMLRout = "../view/DBRegister.fxml";
			try {
				page.CreatePage(stage, FXMLRout);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		Manage.setOnMouseClicked(evnet -> {
			Stage stage = new Stage();
			String FXMLRout = "../view/Catalog.fxml";
			try {
				page.CreatePage(stage, FXMLRout);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		ShelfLife.setOnMouseClicked(evnet -> {
			Stage stage = new Stage();
			String FXMLRout = "../view/Mdate.fxml";
			try {
				page.CreatePage(stage, FXMLRout);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		add.setOnMouseClicked(evnet -> {
			Stage stage = new Stage();
			String FXMLRout = "../view/SignUp.fxml";
			try {
				page.CreatePage(stage, FXMLRout);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});

		add1.setOnMouseClicked(evnet -> {
			Stage stage = new Stage();
			String FXMLRout = "../view/HomePage.fxml";
			try {
				page.CreatePage(stage, FXMLRout);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});

		SearchListBox.setOnMouseClicked((MouseEvent) -> {
			if (MouseEvent.getClickCount() == 2) {
				MOrV.setSearchText(SearchBox.getText());
				Stage stage = new Stage();
				String FXMLRout = "../view/DBSearch.fxml";
				try {
					page.CreatePage(stage, FXMLRout);
					return;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			SearchBox.setText(SearchListBox.getSelectionModel().getSelectedItem());
			UpDownCnt = SearchListBox.getSelectionModel().getSelectedIndex();
		});

		SearchBox.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {

				if(event.getCode().equals(KeyCode.DOWN) || event.getCode().equals(KeyCode.UP)) {
					
				} else {
					SearchListBox.getItems().clear();
					AryList.clear();
				}
				if (event.getCode().equals(KeyCode.ENTER)) {
					MOrV.setSearchText(SearchBox.getText());
					Stage stage = new Stage();
					String FXMLRout = "../view/DBSearch.fxml";
					try {
						page.CreatePage(stage, FXMLRout);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if(event.getCode().equals(KeyCode.DOWN)) {
					if(SearchListBox.getItems().size() == 0) 
						return;
					if(UpDownCnt == SearchListBox.getItems().size())
						return;
					++UpDownCnt;
					MultipleSelectionModel<String> mul = SearchListBox.getSelectionModel();
					SearchListBox.getSelectionModel().select(UpDownCnt);
					SearchBox.setText(AryList.get(SearchListBox.getSelectionModel().getSelectedIndex()));
					return;
				}
				if(event.getCode().equals(KeyCode.UP)) {
					if(SearchListBox.getItems().size() == 0)
						return;
					if(UpDownCnt == 0)
						return;
					--UpDownCnt;
					MultipleSelectionModel<String> mul;
					SearchListBox.getSelectionModel().select(UpDownCnt);
					SearchBox.setText(AryList.get(SearchListBox.getSelectionModel().getSelectedIndex()));
					return;
				}
				if (event.getCode().equals(KeyCode.BACK_SPACE)
						&& strb.length() != 0) {
					if (strb.length() > 0) {
						   strb.setLength(strb.length() - 1);
						}
				} else {
					if (!event.getCode().equals(KeyCode.TAB)
							|| !event.getCode().equals(KeyCode.ENTER))
						strb.append(event.getText());
				}
				if (strb.length() != 0) {
					UpDownCnt = -1;
				}
				if (strb.length() == 0) {
					SearchListBox.setVisible(false);
					UpDownCnt = -1;
					return;
				}
				String sql = "SELECT name, effect, stock FROM Medicine where name LIKE '"
						+ strb.toString() + "%'";

				try {
					pstmt = MOrV.getDBConnect().prepareStatement(sql);
					ResultSet rs = pstmt.executeQuery();

					while (rs.next()) {
						SearchListBox.setVisible(true);
						SearchListBox.getItems()
								.add(rs.getNString("NAME") + "  "
										+ rs.getString("EFFECT") + "  "
										+ rs.getString("STOCK"));
						AryList.add(rs.getNString("NAME"));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
	}
}
