import java.util.ArrayList;
import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		ArrayList<Teacher> teachers = new ArrayList<Teacher>();
		ArrayList<Student> students = new ArrayList<Student>();
		String stop = "asd";
		String stopp = "asdf";
		Scanner key = new Scanner(System.in);
		int count = 0,i = 0;
		while (stop != "") {
			System.out.println("ENTER TEACHER DATA");
			Teacher teacher = new Teacher();
			System.out.print("Enter name:");
			teacher.name = key.nextLine();
			System.out.print("Enter katedra:");
			teacher.katedra = key.nextLine();
			System.out.print("Eneter EGN:");
			teacher.EGN = key.nextInt();
			System.out.print("Enter Workyears:");
			teacher.WorkYears = key.nextInt();
			key.nextLine();
			teachers.add(teacher);
			System.out.println("If you want to stop skip this!");
			stop = key.nextLine();
		}
		while (stopp != "") {
			System.out.println("ENTER STUDENT DATA");
			Student studen = new Student();
			System.out.print("Enter name:");
			studen.name = key.nextLine();
			System.out.print("Enter EGN:");
			studen.EGN = key.nextInt();
			System.out.print("Enter age:");
			studen.age = key.nextInt();
			System.out.print("Enter Fak.num:");
			studen.fnum = key.nextLine();
			key.nextLine();
			students.add(studen);
			System.out.println("If you want to stop skip this!");
			stopp = key.nextLine();
		}
		
		
		for(i = 0;i<teachers.size();i++) {
			if(teachers.get(i).getWorkYears() > 30) {
			  count++;
			}
		}
		System.out.println("Teachers with up from 30 years experience are:" + count);
		
		
		
		count = 0;
		for(i = 0;i<students.size();i++) {
			if(students.get(i).getAge() < 25) {}
			count++;
		}
		System.out.println("Students down to 25 age are:" + count);
		
		
		for (i = 0;i<teachers.size();i++) {
			System.out.print("The  " + i  + "  teacher is:" + '\t');
			teachers.get(i).print();
		}
		
		
		System.out.println("----------------------------------------");
		
		
		for(i = 0;i<students.size();i++) {
			System.out.println("The  " + i + "   student is  " + '\t');
			students.get(i).print();
		}
	}
}
