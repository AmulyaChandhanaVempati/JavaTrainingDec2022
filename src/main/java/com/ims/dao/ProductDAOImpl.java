package com.ims.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import com.ims.exception.InvalidProductNameException;
import com.ims.exception.ProductNotFoundException;
import com.ims.model.Product;
import com.ims.util.DataBaseConnection;
import com.ims.validations.ProductValidations;
import com.mysql.cj.result.LocalDateTimeValueFactory;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public String addProduct(Product product) throws SQLException, ClassNotFoundException, InvalidProductNameException {
		ProductValidations pv = new ProductValidations();
		if (pv.validateProduct(product) == "success") {
			Connection connection = DataBaseConnection.getConnection();
			PreparedStatement ps = connection.prepareStatement("insert into ProductData values (?,?,?,?,?,?)");
			ps.setInt(1, product.getProductId());
			ps.setString(2, product.getProductName());
			ps.setDate(3, java.sql.Date.valueOf(product.getProductManufacturingDate()));
			ps.setInt(4, product.getUseBeforeMonths());
			ps.setDate(5, null);
			ps.setDouble(6, product.getPrice());
			ps.execute();
			return "success";
		} else {
			return pv.validateProduct(product);
		}
	}

	@Override
	public String updateAllProductsByExpiryDate(List<Product> productList) throws SQLException, ClassNotFoundException {
		LocalDate localDate, ld = null;
		PreparedStatement ps;
		Connection connection = DataBaseConnection.getConnection();
		for (int i = 0; i < productList.size(); i++) {
			ld = productList.get(i).getProductManufacturingDate();
			localDate = ld.plusMonths(productList.get(i).getUseBeforeMonths());
			ps = connection.prepareStatement("update ProductData set expDate=? where productId=?");
			ps.setDate(1, java.sql.Date.valueOf(localDate));
			ps.setInt(2, productList.get(i).getProductId());
			ps.execute();
		}
		return "success";

	}

	@Override
	public String updateProductById(Product product)
			throws SQLException, ClassNotFoundException, ProductNotFoundException {
		Connection connection = DataBaseConnection.getConnection();
		PreparedStatement ps = connection.prepareStatement(
				"update ProductData set productName=?,manufacturingDate=?,useBeforeMonths=?,price=? where productId=? ");
		ps.setString(1, product.getProductName());
		ps.setDate(2, java.sql.Date.valueOf(product.getProductManufacturingDate()));
		ps.setInt(3, product.getUseBeforeMonths());
		ps.setDouble(4, product.getPrice());
		ps.setInt(5, product.getProductId());
		ps.execute();
		return "success";
	}

	@Override
	public String deleteProductbyExpiryDate(List<Product> productList)
			throws SQLException, ClassNotFoundException, ProductNotFoundException {
		LocalDate lb = LocalDate.now();
		PreparedStatement ps;
		Connection con = DataBaseConnection.getConnection();
		ps = con.prepareStatement("delete from ProductData where expDate<=?");
		ps.setDate(1, java.sql.Date.valueOf(lb));
		ps.execute();
		return "success";
	}

	@Override
	public String deleteProductById(Integer productId)
			throws SQLException, ClassNotFoundException, ProductNotFoundException {
		Connection con = DataBaseConnection.getConnection();
		int count = 0;
		PreparedStatement ps = con.prepareStatement("select * from ProductData where productId=?");
		ps.setInt(1, productId);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			count++;
		}
		if (count == 0) {
			throw new ProductNotFoundException("Product Does Not Exist");
		} else {
			PreparedStatement ps1 = con.prepareStatement("delete from ProductData where productId=?");
			ps1.setInt(1, productId);
			ps1.execute();
			return "success";
		}
	}

	@Override
	public List<Product> listAllProducts() throws SQLException, ClassNotFoundException {
		List<Product> productList = new ArrayList<Product>();
		Connection con = DataBaseConnection.getConnection();
		Statement s = con.createStatement();
		DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		ResultSet rs = s.executeQuery("select * from ProductData order by expDate");
		while (rs.next()) {
			Product p = new Product();
			p.setProductId(rs.getInt(1));
			p.setProductName(rs.getString(2));
			p.setProductManufacturingDate(LocalDate.parse(String.valueOf(rs.getDate(3)), d));
			p.setUseBeforeMonths(rs.getInt(4));
			p.setProductExpDate(rs.getDate(5) == null ? null : LocalDate.parse(String.valueOf(rs.getDate(5)), d));
			p.setPrice(rs.getInt(6));
			productList.add(p);
		}
		return productList;
	}

	@Override
	public String applyDiscount(List<Product> productList) throws SQLException, ClassNotFoundException {
		PreparedStatement ps;
		Connection connection = DataBaseConnection.getConnection();
		LocalDate date = LocalDate.now();
		for (int i = 0; i < productList.size(); i++) {
			ps = connection.prepareStatement("update ProductData set price=? where productId=?");
			ps.setDouble(1, productList.get(i).getPrice()*0.10);
			ps.setInt(2, productList.get(i).getProductId());
			ps.execute();
		}
		return "success";
		
	}

}
