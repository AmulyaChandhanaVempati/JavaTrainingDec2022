package JDBC;


import java.rmi.server.Operation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	public static void menu() {
		System.out.println("Please choose one option:");
		System.out.println("1. Add row into project table");
		System.out.println("2. Update project name by using project id");
		System.out.println("3. Update project duration by using project id");
		System.out.println("4. Update project name and duration by using project id");
		System.out.println("5. Delete row by using project id");
		System.out.println("6. Display all Projects");
		System.out.println("7. E X I T");
	}
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner input = new Scanner(System.in);
		MySQLOperations jo = new MySQLOperations();
		boolean flag = true;
		while(flag) {
			menu();
			int n = input.nextInt();
			switch(n) {
			case 1:  System.out.println("Enter Project Id: ");
			         Integer id = input.nextInt();
			         input.nextLine();
			         System.out.println("Enter Project Name: ");
			         String name = input.nextLine();
			         System.out.println("Enter Project Duration: ");
			         Integer duration = input.nextInt();
			         if(!jo.addProject(new  Project(id,name,duration))){
			        	 System.out.println("Row is inserted successfully.");
			         }
			         else {
			        	 System.out.println("Row is not inserted.");
			         }
			         break;
			case 2: System.out.println("Enter project id to update: ");
			        Integer id1 = input.nextInt();
			        input.nextLine();
			        System.out.println("Enter project name to update: ");
			        String name1 = input.nextLine();
			        if(jo.updateProjectName(id1, name1)) {
			        	System.out.println("Row with project name is successfully updated");
			        }
			        else {
			        	System.out.println("Row with project name is not updated");
			        }
			        break;
			case 3: System.out.println("Enter project id to update: ");
	                Integer id2 = input.nextInt();
	                input.nextLine();
	                System.out.println("Enter project duration to update: ");
	                Integer duration1 = input.nextInt();
	                if(jo.updateProjectDuration(id2, duration1)) {
	                    	System.out.println("Row with duration is successfully updated");
	                }
	                else {
	                   	System.out.println("Row with duration is not updated");
	                }
	                break;
			case 4: System.out.println("Enter project id to update: ");
                    Integer id3 = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter project name to update: ");
			        String name2 = input.nextLine();
                    System.out.println("Enter project duration to update: ");
                    Integer duration2 = input.nextInt();
                    if(jo.updateProjectNameDuration(new Project(id3,name2, duration2))) {
                	      System.out.println("Row with name and duration is successfully updated");
                    }
                    else {
                       	System.out.println("Row with name and duration is not updated.");
                    }
                    break;
			case 5: System.out.println("Enter project id to delete: ");
                    Integer id4 = input.nextInt();
			        if(!jo.deleteRow(id4)) {
			        	System.out.println("Row is successfully deleted.");
			        }
			        else {
			        	System.out.println("Row is not deleted.");
			        }
			        break;
			case 6:System.out.println("All rows in database: ");
			       ResultSet rs = jo.printAllRows();
			       for(int i=1;i<=rs.getMetaData().getColumnCount();i++) {
		    		   System.out.print(rs.getMetaData().getColumnName(i)+"     ");
		    	   }
			       System.out.println();
			       while(rs.next()) {
			    	   for(int i=1;i<=rs.getMetaData().getColumnCount();i++) {
			    		   System.out.print(rs.getObject(i)+"     ");
			    	   }
			    	   System.out.println();
			       }
			       rs.close();
			       break;
			case 7:System.out.println("You are successfully exited.");
			       flag = false;
			       break;
			default: System.out.println("Please choose one correct option.");
			}
			
		}
	}

}
