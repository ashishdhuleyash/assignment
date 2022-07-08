package springcore_assignment.Q15;

public class Customer {
	int id;
	String custname;
	Item item;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public void display() {
		System.out.println("id is = "+id);
		System.out.println("customer name = "+custname);
		System.out.println("item id = "+item.id);
		System.out.println("item name "+item.iname);
		System.out.println("Item price = "+item.price);
		System.out.println("catagory name is = "+item.cat.catagoryname);
	}

}
