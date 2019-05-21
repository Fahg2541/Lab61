import java.util.ArrayList;
public class Order {
	ArrayList<OrderLine> lines;
	String customerName;
	
	public Order() {
		this.lines = new ArrayList<OrderLine>();
	}
	
	public void setName(String name) {
		customerName = name;
	}
	
	public String getName() {
		return customerName;
	}
	
	public void addOrderLine(Product product, int q) {
		OrderLine line = new OrderLine();
		line.setProduct(product);
		line.setQuantity(q);
		
		if(lines.isEmpty()) {
			lines = new ArrayList<OrderLine>();
		}
		lines.add(line);
	}
	

}
