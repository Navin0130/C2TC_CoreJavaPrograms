package association.hasa.isa;

public class IsADemo {
	public static void main(String[] args) {
		Employee employee = new Employee("Navin", 101, "IT");
		Manager manager = new Manager("Priyadharshini", 201, "Hr", 8);

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);

	}


}
