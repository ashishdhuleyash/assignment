package java8;

import java.util.ArrayList;
import java.util.List;

public class FindMax12 {
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		Maximum m=(int arr[]) ->{
			for (int i=1;i<arr.length;i++) {
				list.add(arr[i]);
			}
	Integer a=list.stream().max((e1 ,e2)->e1>e2?1:-1).get();
			System.out.println("Maximum Number in Array="+a);
		};
		m.maxArr(new int[] {67,89,88,998,778,889});
	}
}
