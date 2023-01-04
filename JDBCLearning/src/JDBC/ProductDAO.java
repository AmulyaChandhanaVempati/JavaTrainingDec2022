package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDAO {
	
	Connection connection=null;
	PreparedStatement preparedStatement=null;
	Statement statement=null;
	ResultSet rSet=null;
	
	public ProductDAO() throws SQLException {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbProject", "root", "Amulya@4149");
		statement = connection.createStatement();
	}
	
	public boolean addProduct(Product product) throws SQLException {
		preparedStatement = connection.prepareStatement("insert into product values(?,?)");
		preparedStatement.setInt(1,product.getId());
		preparedStatement.setString(2, product.getName());
		return preparedStatement.execute();
	
	}
	
	public ResultSet displayProductDetails() throws SQLException {
		statement = connection.createStatement();
		rSet=statement.executeQuery("select * from product");
		return rSet;
	}
	
	public boolean updateProductDetails(Product product) throws SQLException {
		preparedStatement = connection.prepareStatement("Update product set name = ? where id = ?");
		preparedStatement.setString(1, product.getName());
		preparedStatement.setInt(2, product.getId());
		int t = preparedStatement.executeUpdate();
		preparedStatement.close();
		if(t==1) {
			return true;
		}
		return false;
	}
	
	public boolean deleteProduct(Integer productId) throws SQLException {
		preparedStatement = connection.prepareStatement("delete from product where id = ?");
		preparedStatement.setInt(1, productId);
		return preparedStatement.execute();
	}
}
