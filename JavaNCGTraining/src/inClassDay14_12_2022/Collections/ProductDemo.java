package inClassDay14_12_2022.Collections;

import java.util.TreeSet;

public class ProductDemo {

	public static void main(String[] args) {
		TreeSet<Product> p = new TreeSet<>();
		p.add(new Product(107, "p1", 123, 90));
		p.add(new Product(101, "p2", 125, 5));
		p.add(new Product(1067, "p3", 1798, 67));
		p.add(new Product(100, "p4", 1245, 23));
		p.add(new Product(104, "p5", 1245, 29));
		System.out.println(p);

	}

}
//class IdComparator implements Comparator<Product>{
//	
//	
//}

class Product implements Comparable {
	private int id;
	private String name;
	private int price;
	private int qty;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, int price, int qty) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Product p = (Product) o;
		if (this.qty > p.qty) {
			return 1;
		} else if (this.qty < p.qty) {
			return -1;
		}
		return 0;
	}

}
