package kodlamaIo;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setId(1);
		student.setFirstName("Nida");
		student.setLastName("Arslan");
		student.seteMail("miinidars@gmail.com");
		student.setPassword("nidArs123");
		student.setAddress("Samsun");
		student.setSchool("D�zce �niversitesi");
		
		System.out.println(student.getFirstName());
		
		
		Instructr instructr = new Instructr();
		instructr.setId(2);
		instructr.setFirstName("Engin");
		instructr.setLastName("Demiro�");
		instructr.seteMail("engindemirog@gmail.com");
		instructr.setPassword("12345");
		instructr.setAddress("�stanbul");
		instructr.setCourses("Java+React");
		
		StudentManager studentManager = new StudentManager();
		studentManager.courseOperations();
		
		
		InstructrManager instructrManager = new InstructrManager();
		instructrManager.edit();
		
	}

}
