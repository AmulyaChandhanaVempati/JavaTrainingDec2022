package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.exception.ProductNotFoundException;
import com.model.Product;
import com.util.DbConn;

public class ProductDAOImpl implements ProductDAO{

	@Override
	public String addProduct(Product product) throws SQLException, ClassNotFoundException {
		Connection con = DbConn.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into productData values (?,?,?,?)");
		ps.setInt(1, product.getId());
		ps.setString(2, product.getName());
		ps.setDouble(3, product.getQty());
		ps.setDouble(4, product.getPrice());
		ps.execute();
		return "success";
	}

	
	public Product readProduct(int productId) throws SQLException, ClassNotFoundException {
		Connection con = DbConn.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from productData where id =?");
		ps.setInt(1, productId);
		ResultSet rs= ps.executeQuery();
		Product p = new Product();
		while(rs.next()) {
			p.setId(rs.getInt(1));
			p.setName(rs.getString(2));
			p.setPrice(rs.getDouble(3));
			p.setQty(rs.getDouble(4));
		}
		return p;
	}

	@Override
	public String deleteProduct(int productId) throws SQLException, ClassNotFoundException, ProductNotFoundException {
		Connection con = DbConn.getConnection();
		PreparedStatement ps1 = con.prepareStatement("select * from productData where id =?");
		ps1.setInt(1, productId);
		ResultSet rs = ps1.executeQuery();
		int count=0;
		while(rs.next()) {
			count++;
		}
		if(count==0){
			throw new ProductNotFoundException("Product Not fount");
		}
		else {
			PreparedStatement ps = con.prepareStatement("delete from productData where id=?");
			ps.setInt(1, productId);
			ps.execute();
			return "success";
		}

	}

	@Override
	public String updateProduct(Product product) throws SQLException, ClassNotFoundException, ProductNotFoundException {
		Connection con = DbConn.getConnection();
		PreparedStatement ps = con.prepareStatement("update productData set name=?,qty=?,price=? where id=?");
		
		ps.setString(1, product.getName());
		ps.setDouble(2, product.getQty());
		ps.setDouble(3, product.getPrice());
		ps.setInt(4, product.getId());
		ps.execute();
		return "success";
	}

	@Override
	public List<Product> listAllProducts() throws SQLException, ClassNotFoundException {
		List<Product> plist=new ArrayList<>();
		Connection con=DbConn.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from productData");
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

	
}
