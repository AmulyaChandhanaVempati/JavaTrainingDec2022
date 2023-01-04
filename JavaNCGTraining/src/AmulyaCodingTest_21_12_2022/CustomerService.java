package AmulyaCodingTest_21_12_2022;

import com.Assignments.day02_12_2022.BookMenu.Book;
import com.Assignments.day02_12_2022.BookMenu.BookStore;

public interface CustomerService {

	public String addCustomer(Customer customer); 

	public String updateCustomer(Customer customer);

	public String deleteCustomer(int customerId);

	public Customer[] getAllCustomers();

	public Customer findCustomerById(int customerId);

}
