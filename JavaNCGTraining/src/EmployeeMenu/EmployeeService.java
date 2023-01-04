package EmployeeMenu;

public class EmployeeService {
	Company c = new Company(5);

	public String addEmployee(Employee emp) {
		String message = "Employee Could Not be Added";
		if (c.addEmployee(emp))
			message = "Employee Added Successfully";
		return message;
	}

	public String modifyEmployee(Employee emp) {
		String message = "Employee Could Not be Modified";
		if (c.modifyEmployee(emp))
			message = "Employee Modified Successfully";
		return message;
	}

	public String deleteEmployee(int empid) {
		String message = "Employee Could Not be Deleted";
		if (c.deleteEmployee(empid))
			message = "Employee Deleted Successfully";
		return message;
	}

	public Employee[] getAllEmployees() {
		return c.getAllEmployees();
	}

	public Employee findEmployeeById(int empid) {
		return c.findEmployeeById(empid);
	}
}
