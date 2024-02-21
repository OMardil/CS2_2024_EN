package student;

import java.util.Arrays;

public class Student {
	
	private String name;
	private int subjectCount;
	private String[] subjects;
	private int[] grades;	
	private boolean approvedAllSubjects;
	
	public Student(String name) {
		this.name = name;
		this.approvedAllSubjects  = true;
		this.subjectCount = 0;
		
		this.subjects = new String[5];
		for(int i=0; i<this.subjects.length; i++) {
			this.subjects[i] = "";			
		}
		
		this.grades = new int[5];
		for(int i=0; i<this.grades.length; i++) {
			this.grades[i] = -1;
		}		
	}
	
	public String toString() {
		return "Name: " + this.name + "\n" +
			   "Subjects: " + Arrays.toString(this.subjects) + "\n" +
			   "Grades: " + Arrays.toString(this.grades) + "\n" +
			   "Approved all subjects: " + this.approvedAllSubjects;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addGrade(int grade, String subject) {
		if (this.subjectCount < this.grades.length) {
			this.grades[this.subjectCount] = grade;
			this.subjects[this.subjectCount] = subject;
			this.subjectCount++;
			
			if (grade <70) {
				this.approvedAllSubjects = false;
			}
		}
	}
	
	
}
