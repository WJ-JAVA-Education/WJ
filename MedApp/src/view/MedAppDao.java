package view;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.CSingelton;
import model.DBConnect;
import model.Medicine;

public class MedAppDao {

	private static Connection con;
	private PreparedStatement pstmt;
	private ObservableList<Medicine> data;

	CSingelton Singelton = CSingelton.getInstance();

	public MedAppDao() {
		DBConnect connect = new DBConnect();
		if (con == null) {
			con = connect.getConnection();
		}
	}

	public ObservableList<Medicine> getData() {
		try {
			pstmt = con.prepareStatement("select * from Medicine");

			data = FXCollections.observableArrayList();
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				Medicine medicine = new Medicine(rs.getString("name"),
						rs.getString("character"), rs.getString("effct"),
						rs.getString("effct"), rs.getString("warning"),
						rs.getString("company"),
						Date.valueOf(rs.getString("expiration")),
						Integer.parseInt(rs.getString("price")),
						Integer.parseInt(rs.getString("stock")));

				data.add(medicine);
			}
		}

		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Dao.getData():Error on Building Data");
			return null;

		}
		return data;
	}

	public ObservableList<Medicine> searchByName(String name) {

		String sql = "select * from Medicine where name like ? OR effect like ?";

		String effect = name;
		name = "%" + name + "%";
		effect = "%" + effect + "%";

		try {

			data = FXCollections.observableArrayList();

			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, name);
			pstmt.setString(2, effect);

			ResultSet rs = pstmt.executeQuery();
			Singelton.AryList.clear();

			while (rs.next()) {
				String str = rs.getString("expiration");
				String strCut = str.substring(0, 11);

				Singelton.AryList.add(rs.getString("image"));

				Medicine medicine = new Medicine(rs.getString("name"),
						rs.getString("image"), rs.getString("character"),
						rs.getString("effect"), rs.getString("warning"),
						rs.getString("company"), strCut,
						Integer.parseInt(rs.getString("price")),
						Integer.parseInt(rs.getString("stock")));

				data.add(medicine);
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Dao.getData():Error on Building Data");
			return null;

		}
		return data;
	}
}
