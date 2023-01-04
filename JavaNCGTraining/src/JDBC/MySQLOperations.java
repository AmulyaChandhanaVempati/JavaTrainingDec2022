package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLOperations {
	Connection con = null;
	Statement st = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

public MySQLOperations() throws SQLException, ClassNotFoundException {
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbProject", "root", "Amulya@4149");
	st = connection.createStatement();
//	Class.forName("oracle.jdbc.driver.OracleDriver");
//	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@mnipdcvempati:1521:mnpdb19c.modeln.com","MNFALL2022HT","MNFALL2022HT");
//	//st = con.createStatement();
}

	public boolean addProject(Project p) throws SQLException {
		ps = con.prepareStatement("insert into project values(?,?,?)");
		ps.setInt(1, p.getProjectId());
		ps.setString(2, p.getProjectName());
		ps.setInt(3, p.getProjectDuration());
		return ps.execute();

	}

	public boolean updateProjectName(Integer id, String name) throws SQLException {
		ps = con.prepareStatement("Update project set name = ? where id = ?");
		ps.setString(1, name);
		ps.setInt(2, id);
		int p = ps.executeUpdate();
		ps.close();
		if (p == 1) {
			return true;
		}
		return false;
	}

	public boolean updateProjectDuration(Integer id, Integer duration) throws SQLException {
		ps = con.prepareStatement("Update project set duartion = ? where id = ?");
		ps.setInt(1, duration);
		ps.setInt(2, id);
		int p = ps.executeUpdate();
		ps.close();
		if (p == 1) {
			return true;
		}
		return false;
	}

	public boolean updateProjectNameDuration(Project p) throws SQLException {
		ps = con.prepareStatement("Update project set name = ?, duartion = ? where id = ?");
		ps.setString(1, p.getProjectName());
		ps.setInt(2, p.getProjectDuration());
		ps.setInt(3, p.getProjectId());
		int t = ps.executeUpdate();
		ps.close();
		if (t == 1) {
			return true;
		}
		return false;
	}

	public boolean deleteRow(Integer id) throws SQLException {
		ps = con.prepareStatement("delete from project where id = ?");
		ps.setInt(1, id);
		return ps.execute();
	}

	public ResultSet printAllRows() throws SQLException {
		st = con.createStatement();
		rs = st.executeQuery("select * from project");
		return rs;
	}

}
