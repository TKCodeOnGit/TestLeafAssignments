package week3.day1assignments;

public class Students {
	
	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(541);
		stud.getStudentInfo(541, "Shashank");
		stud.getStudentInfo("shashank@gmail.com", 8765412345L);		
	}
	
//	Example of Overloading methods
	
	public void getStudentInfo(int id)
	{
		System.out.println("The student id is " + id);
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("The student name and id is " + name + " :" +id);
	}
	
	public void getStudentInfo(String email, long phoneNumber)
	{
		System.out.println("The student email is " + email + " and contact number is " +phoneNumber);
	}


}
