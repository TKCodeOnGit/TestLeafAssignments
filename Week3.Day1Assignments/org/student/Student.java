package org.student;

import org.department.Department;

public class Student extends Department {

	public static void main(String[] args) {

		Student studentDetail = new Student();

		studentDetail.collegeName("University of Madras");
		studentDetail.collegeCode("AICTUNRC35");
		studentDetail.collegeRank(1);
		studentDetail.deptName("Computer Science");
		studentDetail.studentName("Kavitha");
		studentDetail.studentId(65421);
		studentDetail.studentDept("MCA (Computer Science)");			

	}


	public void studentName(String name)
	{
		System.out.println("The Student Name is " + name);
	}

	public void studentDept(String department)
	{
		System.out.println("The Student Department is " + department);
	}

	public void studentId(int id)
	{
		System.out.println("The Student ID is " + id);
	}


}
