public class Teacher {
	protected String name = new String();
	protected String katedra = new String();
	protected int EGN;
	protected int WorkYears;
	public Teacher(String name,String katedra,int EGN,int WorkYears) {
		this.name = name;
		this.katedra = katedra;
		this.EGN = EGN;
		this.WorkYears = WorkYears;
	}
	public Teacher() {
	}
	public void print() {
		System.out.print(this.name + ",");
		System.out.print(this.katedra + ",");
		System.out.print(this.EGN + ",");
		System.out.print(this.WorkYears + '\n');
	}
	public int getWorkYears() {
		return WorkYears;
	}
}
