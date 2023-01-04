package com.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Employee {
	private Integer empId;
	private String empName;
	private LocalDate joiningDate;
	private Integer contractDuration;
	private LocalDate contractEndDate;
    private Integer commercial;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empId, String empName, LocalDate joiningDate, Integer contractDuration,
			LocalDate contractEndDate, Integer commercial) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.joiningDate = joiningDate;
		this.contractDuration = contractDuration;
		this.contractEndDate = contractEndDate;
		this.commercial = commercial;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	public Integer getContractDuration() {
		return contractDuration;
	}
	public void setContractDuration(Integer contractDuration) {
		this.contractDuration = contractDuration;
	}
	public LocalDate getContractEndDate() {
		return contractEndDate;
	}
	public void setContractEndDate(LocalDate contractEndDate) {
		this.contractEndDate = contractEndDate;
	}
	public Integer getCommercial() {
		return commercial;
	}
	public void setCommercial(Integer commercial) {
		this.commercial = commercial;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", joiningDate=" + joiningDate
				+ ", contractDuration=" + contractDuration + ", contractEndDate=" + contractEndDate + ", commercial="
				+ commercial + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(commercial, contractDuration, contractEndDate, empId, empName, joiningDate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(commercial, other.commercial) && Objects.equals(contractDuration, other.contractDuration)
				&& Objects.equals(contractEndDate, other.contractEndDate) && Objects.equals(empId, other.empId)
				&& Objects.equals(empName, other.empName) && Objects.equals(joiningDate, other.joiningDate);
	}
	
}
