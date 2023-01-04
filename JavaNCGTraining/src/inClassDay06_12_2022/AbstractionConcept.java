package inClassDay06_12_2022;

public class AbstractionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Product{
	private String productId;
	private String productName;
	private String productDesc;
	private double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productId, String productName, String productDesc, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.price = price;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
