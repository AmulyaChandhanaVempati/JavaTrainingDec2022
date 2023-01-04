package JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ProductDAO productDao=new ProductDAO();
		boolean flag = true;
		while(flag) {
			System.out.println("Enter your choice");
			System.out.println("1. Add Product Details 2.Update Product Details 3.Delete Product Details 4.Display All Details  5.Exit");
			int choice = input.nextInt();
			int productId=0;
			String productName="";
			switch(choice) {		
			case 1:  System.out.println("Enter Product Details");
					 System.out.println("Enter Product Id: ");   
			         productId = input.nextInt();
			         input.nextLine();
			         System.out.println("Enter Product Name: ");
			         productName = input.nextLine();
			         if(!productDao.addProduct(new  Product(productId ,productName))){
			        	 System.out.println("Product details added successfully");
			         }
			         else {
			        	 System.out.println("Something went wrong");
			         }
			         break;
			case 2: System.out.println("Enter product id :");
					productId = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter product name :");
                    productName = input.nextLine();
                    if(productDao.updateProductDetails(new Product(productId,productName))) {
                	      System.out.println("Product details modified successfully");
                    }
                    else {
                       	System.out.println("product details are not modified");
                    }
                    break;
			case 3: System.out.println("Enter product id");
					productId = input.nextInt();
			        if(!productDao.deleteProduct(productId)) {
			        	System.out.println("Product is successfully deleted.");
			        }
			        else {
			        	System.out.println("Product details is not deleted.");
			        }
			        break;
			case 4:System.out.println("Displaying Product Details");
			       ResultSet rs = productDao.displayProductDetails();
			       for(int i=1;i<=rs.getMetaData().getColumnCount();i++) {
		    		   System.out.print(rs.getMetaData().getColumnName(i)+"     ");
		    	   }
			       System.out.println();
			       while(rs.next()) {
			    	   for(int i=1;i<=rs.getMetaData().getColumnCount();i++) {
			    		   System.out.print(rs.getObject(i)+"   ");
			    	   }
			    	   System.out.println();
			       }
			       rs.close();
			       break;
			case 5:flag = false;
			       break;  
			default: System.out.println("Please choose correct option.");
			}
		}

	}
}
