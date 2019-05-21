
public class AggregationDemo {

	public static void main(String[] args) {
		Address address = new Address();
		address.setDoorNo("201");
		address.setStreet("Gajuwaka");
		address.setCity("Visakhapatnam");
		Employee2 employee = new Employee2();
		employee.setId(112);
		employee.setName("Rahul");
		employee.setAddress(address);
		System.out.println(employee.toString());
		

	}

}
