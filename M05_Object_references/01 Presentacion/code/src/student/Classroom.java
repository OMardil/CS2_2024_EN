package student;

public class Classroom {

	private Student[] studentList;
	private int studentListIndex;
	private int roomNumber;
	
	public Classroom(int studentCount, int roomNumber) {
		if (studentCount <= 0 || roomNumber < 0) {
			System.out.println("Error, invalid student count.");
			System.exit(0);
		}
		
		this.studentList = new Student[studentCount];
		this.studentListIndex = 0;
		this.roomNumber = roomNumber;
	}
	
	public void addStudent(String name, int studentNumber) {
		//only insert students into the list if it has space
		if (this.studentListIndex < this.studentList.length) {
			this.studentList[this.studentListIndex++] = new Student(name, studentNumber);
			System.out.println(name + " has been enrolled on the course!");			
		} else {
			System.out.println("No space for " + name + "!");
		}
	}
	
}


