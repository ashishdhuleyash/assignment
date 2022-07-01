package tdd;
import java.io.*;

public class Pythagoras_Q5 {


	public static boolean Pythagoras(int a, int b, int c) {
		 if(a*a==b*b+c*c)
	      {
			 System.out.println("pair from pythgoras theorem satisfying : "+a+" "+b+" "+c);
				
	          return true;
	      }
	      else
	    	  System.out.println("pair from pythgoras theorem not satisfying : "+a+" "+b+" "+c);
			
	      return false;

	}
	public static void main(String[] args) {
		Pythagoras_Q5.Pythagoras(5,3,4);
	}
}


