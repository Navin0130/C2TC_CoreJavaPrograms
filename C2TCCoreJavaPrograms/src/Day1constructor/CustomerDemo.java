package Day1constructor;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
		System.out.println(c1);
		
		Customer c2=new Customer(102,"jagan","chennai");
		System.out.println(c2);
		
		Customer c3=new Customer(103,"raja","chennai");
		System.out.println(c3);

	}

}