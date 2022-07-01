package tdd;

public class Palindrome_Q2 {
   static int MAX_CHAR=26;
   static String stringpalindrome(String A,String B) {
	   int [] countA=new int [MAX_CHAR];
	   int [] countB=new int [MAX_CHAR];
	   
	   int l1=A.length();
	   int l2=B.length();
	   
	   for (int i=0;i<l1;i++)
		   countA[A.charAt(i)-'a']++;
	   
	   for (int i=0;i<l2;i++)
		   countB[B.charAt(i)- 'a']++;
	   
	   for(int i=0;i<26;i++)
		   if ((countA[i]>1 && countB[i]==0))
			   return "palin";
	   
	   return "Not palindrome";
   }
   public static void main(String[] args) {
	   String a="abcdea";
	   String b="bcdesg";
	   System.out.println(stringpalindrome(a,b));
	}
}
   