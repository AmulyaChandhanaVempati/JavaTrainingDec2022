package com.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.pms.model.Product;
import com.pms.unit.DbConnection;

public class ProductDAOImpl implements ProductDAO{

	@Override
	public String addProduct(Product product) throws SQLException, ClassNotFoundException {
		Connection con= DbConnection.getConnection();
		PreparedStatement pst=con.prepareStatement("insert into product values(?,?,?,?)");
		pst.setInt(1,product.getId());
		pst.setString(2,product.getName());
		pst.setDouble(3,product.getQty());
		pst.setDouble(4,product.getPrice());
		pst.execute();
		return "success";
	}

	@Override
	public List<Product> listAllProducts() throws SQLException, ClassNotFoundException {
		List<Product> plist=new ArrayList<>();
		Connection con=DbConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from product");
		while(rs.next()) {
			Product p=new Product();
			p.setId(rs.getInt(1));
			p.setName(rs.getString(2));
			p.setQty(rs.getDouble(3));
			p.setPrice(rs.getDouble(4));
			plist.add(p);
		}
		return plist;
	}

	@Override
	public String deleteProduct(int productId) throws SQLException, ClassNotFoundException {
		Connection con = DbConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("delete from Product where id=?");
		ps.setInt(1, productId);
		ps.execute();
		return "success";
	}

	@Override
	public String update(Product product) throws SQLException, ClassNotFoundException {
		Connection con = DbConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("update Product set name =?,qty=?,price=? where id=?");
		ps.setString(1, product.getName());
		ps.setDouble(2, product.getQty());
		ps.setDouble(3, product.getPrice());
		ps.setInt(4, product.getId());
		ps.executeUpdate();
		return "success";
	}

}
