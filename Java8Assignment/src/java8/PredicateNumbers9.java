package java8;

import java.util.function.Predicate;
public class PredicateNumbers9 {
	public static void main(String[] args) {
		int a[]= {34,33,56,57,76,77,70};
		int evennum=0;
		int  oddnum=0;

		Predicate <Integer> list=n->(n%2==0);
		for(int i=0;i<a.length;i++) {
			if (list.test(a[i])) {
				evennum++; 
			}
			else
				oddnum++;
		}
		System.out.println("total oddnum:"+oddnum);
		System.out.println("total oddnum:"+evennum);
	}
}
