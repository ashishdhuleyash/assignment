package tdd;

public class EvenOrNot_Q8 {
     public static int count(int arr[]) {
    	 int even_count=0;
    	 int odd_count=0;
    	 
    	 for(int i=0; i<arr.length;i++) {
    		 if ((arr[i] &1)==1)
    			 odd_count++;
    		 else
    			 even_count++;
    	 }
    	 System.out.println("Number of even"+"elements= "+even_count);
    	 return even_count;
     }
}
