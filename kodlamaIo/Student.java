package kodlamaIo;

public class Student extends User {
	private String school;

	public Student() {
		
	}
	
	public Student(String school) {
		this.school=school;
	}
	

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
}