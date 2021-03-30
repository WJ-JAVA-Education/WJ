package model;

import java.sql.Connection;
import java.util.ArrayList;

import javafx.scene.image.Image;
import model.DBConnect;

public class CSingelton {
	private static CSingelton printer = null;
	private static int ManagerOrViewerstatic;
	private static Connection conn;
	private static DBConnect connect = new DBConnect();
	private static String strSearchText = "";

	public static ArrayList<String> AryList = new ArrayList<>();
	public static ArrayList<String> AryList2 = new ArrayList<>();

	public static CSingelton getInstance() {
		if (printer == null) {

			conn = connect.getConnection();
			printer = new CSingelton();
		}
		return printer;
	}

	public int getManagerOrViewer() {
		return ManagerOrViewerstatic;
	}

	public void setManagerOrViewer(int ManagerOrViewer) {
		ManagerOrViewerstatic = ManagerOrViewer;
	}

	public Connection getDBConnect() {
		return conn;
	}

	public void setSearchText(String text) {
		strSearchText = text;
	}

	public String getSearchText() {
		return strSearchText;
	}
}
