package kodlamaIo;

public class Instructr extends User {
	
	String courses;
	
	
public Instructr() {
	
}

public Instructr(String courses) {
	this.courses=courses;
}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}
	
}
