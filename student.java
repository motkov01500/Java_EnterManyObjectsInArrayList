public class Student {
	protected String name = new String();
	protected String fnum = "10101010";
	protected int EGN;
	protected int age;
	public Student(String name,String fnum,int EGN,int age) {
		this.name = name;
		this.fnum = fnum;
		this.EGN = EGN;
		this.age = age;
	}
	public Student() {
	}
	protected int getAge() {
		return age;
	}
	public void print() {
		System.out.println(this.name + ',');
		System.out.println(this.fnum + ',');
		System.out.println(this.EGN + ',');
		System.out.println(this.age + '\n');
	}
}
