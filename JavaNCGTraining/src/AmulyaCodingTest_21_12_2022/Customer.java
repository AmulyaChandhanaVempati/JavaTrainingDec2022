package AmulyaCodingTest_21_12_2022;

public class Customer {
	private int customerId;
	private String customerName;
	private long customerModileNo;
	private String customerEmailId;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, long customerModileNo, String customerEmailId) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerModileNo = customerModileNo;
		this.customerEmailId = customerEmailId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerModileNo() {
		return customerModileNo;
	}
	public void setCustomerModileNo(long customerModileNo) {
		this.customerModileNo = customerModileNo;
	}
	public String getCustomerEmailId() {
		return customerEmailId;
	}
	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerModileNo="
				+ customerModileNo + ", customerEmailId=" + customerEmailId + "]";
	}
	

}
