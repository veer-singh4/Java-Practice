package oo.hasa;

public class Product {

	private int id;

	public Product(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product[product Id="+id+"]";
	}
}
