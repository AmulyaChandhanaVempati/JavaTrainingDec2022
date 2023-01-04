package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import com.exception.EmployeeNotFoundException;
import com.exception.InvalidEmployeeNameException;
import com.model.Employee;
import com.util.DataBaseConnection;
import com.validations.EmployeeValidations;


public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public String addEmployee(Employee employee) throws SQLException, ClassNotFoundException, InvalidEmployeeNameException {
		EmployeeValidations ev = new EmployeeValidations();
		if(ev.validateEmployee(employee)=="success") {
			Connection connection = DataBaseConnection.getConnection();
			PreparedStatement ps = connection.prepareStatement("insert into EmployeeData values (?,?,?,?,?,?)");
			ps.setInt(1, employee.getEmpId());
			ps.setString(2, employee.getEmpName());
			ps.setDate(3,java.sql.Date.valueOf(employee.getJoiningDate()));
			ps.setInt(4, employee.getContractDuration());
			ps.setDate(5,null);
			ps.setInt(6, employee.getCommercial());
			ps.execute();
				return "success";
		}
		else {
			return ev.validateEmployee(employee);
		}
		
	}

	@Override
	public String updateAllEmployeeContractEndDate(List<Employee> employeeList) throws SQLException, ClassNotFoundException {
		LocalDate localDate,ld = null;
		PreparedStatement ps;
		Connection connection = DataBaseConnection.getConnection();
		for(int i=0;i<employeeList.size();i++) {
			ld=  employeeList.get(i).getJoiningDate();
			localDate = ld.plusMonths(employeeList.get(i).getContractDuration());
			ps = connection.prepareStatement("update EmployeeData set contractEndDate=? where empId=?");
			ps.setDate(1, java.sql.Date.valueOf(localDate));
			ps.setInt(2, employeeList.get(i).getEmpId());
			ps.execute();
		}
			return "success";
		
	}

	@Override
	public String updateEmployeeById(Employee employee)
			throws SQLException, ClassNotFoundException, EmployeeNotFoundException {
		Connection connection = DataBaseConnection.getConnection();
		PreparedStatement ps = connection.prepareStatement("update EmployeeData set empName=?,joiningDate=?,contractDuration=?,commercial=? where empId=? ");
		ps.setString(1, employee.getEmpName());
		ps.setDate(2, java.sql.Date.valueOf(employee.getJoiningDate()));
		ps.setInt(3, employee.getContractDuration());
		ps.setInt(4, employee.getCommercial());
		ps.setInt(5, employee.getEmpId());
		ps.execute();
		return "success";
	}

	@Override
	public String deleteEmployeebyContractDate(List<Employee> employeeList) throws SQLException, ClassNotFoundException,EmployeeNotFoundException {
		LocalDate lb = LocalDate.now();
		PreparedStatement ps;
		Connection con = DataBaseConnection.getConnection();
			ps = con.prepareStatement("delete from EmployeeData where contractEndDate<=?");
			ps.setDate(1,java.sql.Date.valueOf(lb));
			ps.execute();
			return "success";
	}

	@Override
	public List<Employee> listAllEmployees() throws SQLException, ClassNotFoundException {
		List<Employee> employeeList = new ArrayList<Employee>();
		Connection con = DataBaseConnection.getConnection();
		Statement s = con.createStatement();
		DateTimeFormatter d=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		ResultSet rs = s.executeQuery("select * from EmployeeData order by contractEndDate desc");
		while(rs.next()) {
			Employee emp = new Employee();
			emp.setEmpId(rs.getInt(1));
			emp.setEmpName(rs.getString(2));
			emp.setJoiningDate(LocalDate.parse(String.valueOf(rs.getDate(3)) , d));
			emp.setContractDuration(rs.getInt(4));
			emp.setContractEndDate(rs.getDate(5)==null?null:LocalDate.parse( String.valueOf(rs.getDate(5)), d));
			emp.setCommercial(rs.getInt(6));
			employeeList.add(emp);
		}
		return employeeList;
	}

	@Override
	public String deleteEmployeeById(Integer employeeId)
			throws SQLException, ClassNotFoundException, EmployeeNotFoundException {
		Connection con = DataBaseConnection.getConnection();
		int count=0;
		PreparedStatement ps = con.prepareStatement("select * from EmployeeData where empId=?");
		ps.setInt(1, employeeId);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			count++;
		}
		if(count==0) {
			throw new EmployeeNotFoundException("Employee Does Not Exist");
		}
		else {
			PreparedStatement ps1 = con.prepareStatement("delete from EmployeeData where empId=?");
			ps1.setInt(1, employeeId);
			ps1.execute();
		   return "success";	
		}
	}

}
