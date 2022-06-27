package java8;

import java.util.Scanner;

public class Permutation14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Alphabets");
		String str=sc.next();
		int n =str.length();
		
		 Permutation14 p=new  Permutation14();
		 p.permute(str,0,n-1);
	}

	private void permute(String str, int a, int b) {
		if (a==b)
			System.out.println(str);
		else {
			for (int k=a;k<=b;k++) {
				str=swap(str,a,b);
				permute(str,a+1,b);
			}
			
		}
	}

	private String swap(String str, int i, int j) {
		char temp;
		char[] charArray=str.toCharArray();
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
	}
}
