package AmulyaCodingTest_21_12_2022;

import com.Assignments.day02_12_2022.BookMenu.BookStore;

public class CustomerServiceImpl implements CustomerService {
	
	private Customer[] customers= new Customer[2];
	private int count = 0;

	public CustomerServiceImpl() {
		super();

	}
	
	@Override
	public String addCustomer(Customer customer) {
		String message = "Customer Could Not Be Added";
		if (count < customers.length) {
			customers[count] = new Customer(customer.getCustomerId(), customer.getCustomerName(), customer.getCustomerModileNo(),
					customer.getCustomerEmailId());
			count++;
			message = "Customer Added Successfully";;
		}
		
		return message;
	}

	@Override
	public String updateCustomer(Customer customer) {
		String message = "Customer Could Not be Updated";
		for (Customer c : customers) {
			if (c != null && c.getCustomerId() == customer.getCustomerId()) {
				c.setCustomerName(customer.getCustomerName());
				c.setCustomerModileNo(customer.getCustomerModileNo());
				c.setCustomerEmailId(customer.getCustomerEmailId());
				message = "Customer Updated Successfully";
			}
		}
		return message;
	}

	@Override
	public String deleteCustomer(int customerId) {
		String message = "Book Could Not be Deleted";
		for (int i = 0; i < count; i++) {
			if (customers[i].getCustomerId() == customerId) {
				for (int j = i; j < count - 1; j++)
					customers[j] = customers[j + 1];
				count--;
				message = "Customer Deleted Successfully";
			}
		}
		return message;
	}
	@Override
	public Customer findCustomerById(int customerId) {
		for (int i = 0; i < count; i++) {
			if (customers[i].getCustomerId() == customerId) {
				return customers[i];
			}
		}
		return null;
	}

	@Override
	public Customer[] getAllCustomers() {
		return java.util.Arrays.copyOfRange(customers, 0, count);
	}


}
