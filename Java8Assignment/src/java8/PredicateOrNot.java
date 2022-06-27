package java8;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateOrNot {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Number :");
		int a1=sc.nextInt();
	    Predicate<Integer> p=number->(number%2==0);	
	    
	    if (p.test(a1)) {
	    	System.out.println("Entered Number is Even:"+ a1 );	    	
	    }
	    else {
	    	System.out.println("Entered Number is Odd:"+a1 );
	    }
	}

}
