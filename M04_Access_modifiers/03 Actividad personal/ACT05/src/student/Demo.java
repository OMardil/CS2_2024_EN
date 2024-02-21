package student;

public class Demo {

	public static void main(String[] args) {

		Student s1 = new Student("Omar");
		System.out.println(s1);		
		
		s1.addGrade(100, "Computer Science");
		System.out.println(s1);
		
		s1.addGrade(70, "English");
		System.out.println(s1);
		
		s1.addGrade(65, "Math");
		System.out.println(s1);
		
		s1.addGrade(100, "Spanish");
		System.out.println(s1);

		s1.addGrade(80, "History");
		System.out.println(s1);		
	}

}
