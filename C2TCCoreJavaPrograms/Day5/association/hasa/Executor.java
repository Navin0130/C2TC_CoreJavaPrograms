package association.hasa;

public class Executor {
	public static void main(String[] args) {
		Address address = new Address("405 Main Road ", "Nashik", "Puducherry", "605501");
		Person person = new Person("Navin", address);
		person.displayInfo();

	}


}
