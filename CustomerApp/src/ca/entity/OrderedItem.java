package ca.entity;

public class OrderedItem {
	
	private int qty;
	
	private Item item;

	public OrderedItem(int qty, Item item) {
		super();
		this.qty = qty;
		this.item = item;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	

}
