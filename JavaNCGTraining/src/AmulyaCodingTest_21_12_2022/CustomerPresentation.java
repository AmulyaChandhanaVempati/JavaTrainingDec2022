package AmulyaCodingTest_21_12_2022;

import java.util.Scanner;


public class CustomerPresentation {

		static Scanner sc = new Scanner(System.in);
		static CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();

		public static void main(String[] args) {

			int option, customerId;
			while (true) {
				option = mainMenu();
				switch (option) {
				case 1:
					System.out.println(customerServiceImpl.addCustomer(addCustomerUI()));
					break;
				case 2:
					customerId = getCustomerIdUI("Update ");
					System.out.println(customerServiceImpl.updateCustomer(updateCustomerUI(customerId)));
					break;
				case 3:
					customerId = getCustomerIdUI("Delete ");
					System.out.println(customerServiceImpl.deleteCustomer(customerId));
					break;
				case 4:
					customerId = getCustomerIdUI("Display ");
					displayCustomerDetails(customerServiceImpl.findCustomerById(customerId));
					break;
				case 5:
					displayAllCustomersUI(customerServiceImpl.getAllCustomers());
					break;
				case 6:
					System.exit(1);
				default:
					System.out.println("Invalid Option .....Please Enter valid option");
				}

			}

		}

		public static int mainMenu() {
			System.out.println("\n");
			System.out.println("1. Add Customer ");
			System.out.println("2. Update Customer");
			System.out.println("3. Delete Customer");
			System.out.println("4. Find Customer By ID");
			System.out.println("5. Display All Customers");
			System.out.println("6. E X I T ");
			System.out.print("Enter your option........");
			int option = sc.nextInt();
			sc.nextLine();
			return option;
		}

		private static Customer addCustomerUI() {
			System.out.print("Enter Customer Id ");
			int customerid = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Customer Name: ");
			String customerName = sc.nextLine();
			System.out.print("Enter Customer Mobile Number: ");
			Long customerMobileNo = sc.nextLong();
			sc.nextLine();
			System.out.print("Enter Customer Email ID: ");
			String customerEmailId = sc.nextLine();
			
			System.out.println("\n");
			return new Customer(customerid,customerName,customerMobileNo,customerEmailId);
		}

		public static int getCustomerIdUI(String purpose) {
			System.out.print("Enter Customer Id to " + purpose + "  ");
			int customerid = sc.nextInt();
			sc.nextLine();
			return customerid;
		}

		public static Customer updateCustomerUI(int customerid) {
			System.out.print("Enter Customer Name: ");
			String customerName = sc.nextLine();
			System.out.print("Enter Customer Mobile Number: ");
			Long customerMobileNo = sc.nextLong();
			sc.nextLine();
			System.out.print("Enter Customer Email ID: ");
			String customerEmailId = sc.nextLine();
			System.out.println("\n");
			return new Customer(customerid,customerName,customerMobileNo,customerEmailId);
		}

		public static void displayAllCustomersUI(Customer[] customerArray) {
			System.out.println("\n");
			for (Customer b : customerArray)
				if (b != null)
					System.out.println(b.getCustomerId() + " " + b.getCustomerName() + " " + b.getCustomerModileNo() + " "
							+ b.getCustomerEmailId() );
			System.out.println("\n");
		}

		public static void displayCustomerDetails(Customer customer) {
			System.out.println();
			if (customer != null) {
				System.out.println("Customer Id:       " + customer.getCustomerId());
				System.out.println("Customer Name:       " + customer.getCustomerName());
				System.out.println("Customer MobileNo:       " + customer.getCustomerModileNo());
				System.out.println("Customer Email ID:    " + customer.getCustomerEmailId());
			} else
				System.out.println("Customer Does Not Exist\n");
		}

}
