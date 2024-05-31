package com.ey.school;
import java.util.Date;

public class StudentTester
{
	public static void main(String[]args) {
		Student[] student=new Student[5];
		Student.setAdmissionCounter(10);
		student[0]=new Student("Chandrahas" ,new Date(102,6,23) ,new Integer[] {96,92,98});
		student[0].setGrade();
		student[1]=new Student("Rishi"    ,new Date(102,2,17),new Integer[] {45,72,68});
		student[1].setGrade();
		student[2]=new Student("Bhavi",new Date(103,3,10),new Integer[] {45,59,42});
		student[2].setGrade();
		student[3]=new Student("Honey",new Date(102,9,14),new Integer[] {65,45,45});
		student[3].setGrade();
		student[4]=new Student("Dummu",new Date(103,12,26),new Integer[] {76,80,87});
		student[4].setGrade();
		StudentService sc=new StudentService();
		sc.displayallStudents(student);
	}
}