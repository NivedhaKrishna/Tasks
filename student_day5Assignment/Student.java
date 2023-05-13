package org.student_day5Assignment;

import org.department_day5Assignment.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student Class -->studentName method ");
	}
	public void studentDept() {
		System.out.println("Student Class -->studentDept method");
	}
	public void studentId() {
		System.out.println("Student Class -->studentId method");
	}
public static void main(String[] args) {
	Student s = new Student();
	s.collegeCode();
	s.collegeName();
	s.collegeRank();
	s.deptName();
	s.studentName();
	s.studentDept();
	s.studentId();
	
}
}
