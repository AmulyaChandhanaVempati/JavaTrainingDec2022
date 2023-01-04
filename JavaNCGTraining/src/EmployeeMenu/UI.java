package EmployeeMenu;

import java.util.Scanner;

public class UI
{
   static Scanner sc = null;
   public static void main(String[] args)
   {
        sc = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService(); 
        int opt = 0,empid;
        while(true)
        {
            opt = mainMenu();
            switch(opt) 
            {
               case 1:
                  System.out.println(employeeService.addEmployee(addEmployeeUI()));
                  break;
               case 2:
                  empid = getEmployeeIdUI("Modify "); 
                  System.out.println(employeeService.modifyEmployee(modifyEmployeeUI(empid)));
                  break;
               case 3:
                  empid = getEmployeeIdUI("Delete ");
                  System.out.println(employeeService.deleteEmployee(empid));
                  break;
               case 4:
                  empid = getEmployeeIdUI("Search ");
                  displayEmployeeDetails(employeeService.findEmployeeById(empid)); 
                  break;
               case 5:
                  displayAllEmployeesUI(employeeService.getAllEmployees());
                  break;
               case 6:
                  System.exit(1);  //even we can write return to terminate main() 
               default:
                  System.out.println("Invalid Option .....Please Enter valid option");
            }
        }
   }
   public static int mainMenu()
   {
      System.out.println("\n");
      System.out.println("1. Add Employee ");
      System.out.println("2. Modify Employee");
      System.out.println("3. Delete Employee");
      System.out.println("4. Find Employee");
      System.out.println("5. Display All Employees");
      System.out.println("6. E X I T "); 
      System.out.print("Enter your option........");
      int opt = sc.nextInt();
      sc.nextLine();
      return opt;   
   }
   public static Employee addEmployeeUI()
   {
      System.out.print("Enter Employee Id "); 
      int empid = sc.nextInt();
      sc.nextLine();
      System.out.print("Enter Employee Name ");
      String ename = sc.nextLine();
      System.out.print("Enter Employee Salary ");
      double salary = sc.nextDouble();
      System.out.print("Enter Employee Mobile No ");
      long mobileNo = sc.nextLong();
      sc.nextLine();
      System.out.print("Enter Employee Email Id ");
      String emailId = sc.nextLine();  
      System.out.println("\n");
      return new Employee(empid,ename,salary,mobileNo,emailId);    
   }
   public static Employee modifyEmployeeUI(int empid)
   {
      System.out.print("Enter Employee Name ");
      String ename = sc.nextLine();
      System.out.print("Enter Employee Salary ");
      double salary = sc.nextDouble();
      System.out.print("Enter Employee Mobile No ");
      long mobileNo = sc.nextLong();
      sc.nextLine();
      System.out.print("Enter Employee Email Id ");
      String emailId = sc.nextLine();
      return new Employee(empid,ename,salary,mobileNo,emailId);
   }
   public static int getEmployeeIdUI(String purpose)
   {
       System.out.print("Enter Employee Id to "+purpose+"  ");
       int empid = sc.nextInt();
       sc.nextLine();
       return empid;
   } 
   public static void displayAllEmployeesUI(Employee[] empArr)
   {
         System.out.println("\n");
         for(Employee e : empArr)
           if(e!=null)
             System.out.println(e.getEmpid()+" "+e.getEname()+" "+e.getSalary()+" "+e.getMobileNo()+" "+e.getEmailId());
         System.out.println("\n");
   }
   public static void displayEmployeeDetails(Employee emp)
   {
      System.out.println();
      if(emp!=null)
      {
          System.out.println("Empid        "+emp.getEmpid());
          System.out.println("EName        "+emp.getEname());
          System.out.println("Salary       "+emp.getSalary());
          System.out.println("Mobile No    "+emp.getMobileNo());
          System.out.println("Email Id     "+emp.getEmailId());
      }
      else
        System.out.println("Employee Does Not Exist\n");  
   } 
}