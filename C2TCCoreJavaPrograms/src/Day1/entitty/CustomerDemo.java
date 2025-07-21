package Day1.entitty;
import java.util.*;
public class CustomerDemo 
{

	public static void main(String[] args) 
	{
		int m,n;
		m=100;
		// Customer 1
		Customer c1=new Customer ();
		c1.setCid(101);
		c1.setCname("raja");
		c1.setCity("puducherry");
		System.out.println(c1);
		//Customer 2
		Customer c2=new Customer ();
		c2.setCid(102);
		c2.setCname("priya");
		c2.setCity("puducherry");
		System.out.println(c1);

	}

}
