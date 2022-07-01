package tdd;

public class Student_Q12 implements Cloneable {
	int id;
	String name;
	
	public Student_Q12(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public static boolean checkClone(Student_Q12 s,Student_Q12 s1) {
		if(s.id==s1.id && s.name==s1.name)
			return true;
		else
			return false;
	}

}
