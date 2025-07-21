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
		c1.cid=101;
		c1.cname="raja";
		c1.city="puducherry";
		System.out.println("Customer id:"+c1.cid);	
		System.out.println("Customer Name:"+c1.cname);		
		System.out.println("Customer city:"+c1.city);		
		
		//Customer 2
		Customer c2=new Customer ();
		c2.cid=102;
		c2.cname="priya";
		c2.city="puducherry";
		System.out.println("Customer id:"+c2.cid);	
		System.out.println("Customer Name:"+c2.cname);		
		System.out.println("Customer city:"+c2.city);		
		

	}

}
