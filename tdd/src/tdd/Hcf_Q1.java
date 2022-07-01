package tdd;

public class Hcf_Q1 {
	public static int HCf(int a,int b) {
		int hcf=0;
		for (int i = 1; i < a||i<=b; i++) {
			if (a % i == 0 && b % i==0)
			hcf=i;
		}
		return hcf;
	}

}
