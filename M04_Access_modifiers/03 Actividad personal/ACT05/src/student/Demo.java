package student;

public class Demo {

	public static void main(String[] args) {

		Student s1 = new Student("Roberto");
		System.out.println(s1);
		System.out.println("--------");
		
		s1.addGrade(100, "Computer Science");
		System.out.println(s1);
		System.out.println("--------");
		
		s1.addGrade(70, "English");
		System.out.println(s1);
		System.out.println("--------");
		
		s1.setName("Roberto Carlos");
		System.out.println(s1);		
		System.out.println("--------");
		
		Student s2 = new Student("Marco");		
		s2.addGrade(65, "Math");
		System.out.println(s2);
		System.out.println("--------");
		
		s2.addGrade(100, "Spanish");
		System.out.println(s2);
		System.out.println("--------");

		s2.addGrade(80, "History");
		System.out.println(s2);		
		System.out.println("--------");
		
	}

}
