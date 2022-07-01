package tdd;

public class AmstrongNum_Q4 {

    public static boolean check(int input) {
        int num, temp, total = 0;
        num = input;
       while(num!=0) {
    	   temp=num%10;
    	   total=total+temp*temp*temp;
    	   num=num/10;  
        }
      if(total==input) {
    	  System.out.println(input +"Is not an amstrong Number");
    	  return true;
      }else {
    	  System.out.println(input+"is not an amstrong Number ");
    	  return false;
      }
    }

    public static void main(String[]args) {
    	AmstrongNum_Q4.check(153);
    }
}
