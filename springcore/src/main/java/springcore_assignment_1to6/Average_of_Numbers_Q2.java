package springcore_assignment_1to6;
import javax.annotation.*;

public class Average_of_Numbers_Q2 {
	int n1;
	int n2;
	int n3;
	int n4;
	int n5;
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int getN3() {
		return n3;
	}
	public void setN3(int n3) {
		this.n3 = n3;
	}
	public int getN4() {
		return n4;
	}
	public void setN4(int n4) {
		this.n4 = n4;
	}
	public int getN5() {
		return n5;
	}
	public void setN5(int n5) {
		this.n5 = n5;
	}

	public void sum() {
		int avg=(n1+n2+n3+n4+n5)/5;

		System.out.println("Average of Numbers"+avg);
	}
	@PostConstruct
	public void sum2() {
	Average_of_Numbers_Q2 obj1=new Average_of_Numbers_Q2();
	}

}
