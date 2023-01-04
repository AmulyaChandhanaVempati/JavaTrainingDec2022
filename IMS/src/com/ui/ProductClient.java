package com.ui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import com.exception.ProductNotFoundException;
import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class ProductClient {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, ProductNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ProductService ps = new ProductServiceImpl();
		boolean flag = true;
		while (flag) {
			System.out.println("Enter your choice");
			System.out.println(
					"1. Add Product Details \n 2.Update Product Details \n 3.Delete Product Details \n 4.Display All Details\n 5.Read a perticular employee  \n 6.Exit");
			int choice = input.nextInt();
			int productId = 0;
			String productName = "";
			double qty, price;
			switch (choice) {
			case 1:
				System.out.println("Enter Product Details");
				System.out.println("Enter Product Id: ");
				productId = input.nextInt();
				input.nextLine();
				System.out.println("Enter Product Name: ");
				productName = input.nextLine();
				System.out.println("Enter Product Quantity: ");
				qty = input.nextDouble();
				System.out.println("Enter Product Price: ");
				price = input.nextDouble();
				Product p = new Product(productId, productName, qty, price);
				if (ps.addProduct(p) == true) {
					System.out.println("Product details added successfully");
				} else {
					System.out.println("Something went wrong");
				}
				break;
			case 2:
				System.out.println("Enter product id :");
				productId = input.nextInt();
				input.nextLine();
				System.out.println("Enter product name :");
				productName = input.nextLine();
				System.out.println("Enter Product Quantity: ");
				qty = input.nextDouble();
				System.out.println("Enter Product Price: ");
				price = input.nextDouble();
				Product p1 = new Product(productId, productName, qty, price);
				if (ps.updateProduct(p1) == true) {
					System.out.println("Product details modified successfully");
				} else {
					System.out.println("product details are not modified");
				}
				break;
			case 3:
				System.out.println("Enter product id");
				productId = input.nextInt();
//				if (ps.deleteProduct(productId) == true) {
//					System.out.println("Product is successfully deleted.");
//				} else {
//					System.out.println("Product details is not deleted.");
//				}
//				break;
				boolean f = false;
				try {
					 f = ps.deleteProduct(productId);
				}
				catch(ProductNotFoundException ex) {
					System.out.println(ex.getMessage());
				}
				if(f) {
					System.out.println("Prodcut is deleted");
				}
				break;
			case 4:
				System.out.println("Displaying All Product Details");
				List l = ps.listAllProducts();
				System.out.println(l);
				break;
			case 5:
				System.out.println("Enter product id");
				productId = input.nextInt();
				Product p2 = ps.readProduct(productId);
				System.out.println(p2);

				break;
			case 6:
				flag = false;
				break;
			default:
				System.out.println("Please choose correct option.");
			}
		}

	}

}
