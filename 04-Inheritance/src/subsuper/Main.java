package subsuper;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Person> people = new ArrayList<>();
		
		Staff staff = new Staff("staff_name", 100, null);
		Student student = new Student("student_name", 200, new ArrayList<Session>());
		Faculty faculty = new Faculty("faculty_name", 300, new ArrayList<Session>());
		
		Person p1 = (Person) staff;
		Person p2 = (Person) student;
		Person p3 = (Person) faculty;
		
		people.add(staff);
		people.add(student);
		people.add(faculty);
		
		for (Person p : people) {
			System.out.println(String.format("Class->%s", p.getClass()));
			
			System.out.println(String.format("Person->%s", p instanceof Person));
			System.out.println(String.format("Staff->%s", p instanceof Staff));
			System.out.println(String.format("Student->%s", p instanceof Student));
			System.out.println(String.format("Faculty->%s", p instanceof Faculty));
			
			System.out.println(p.printVersion());
			
			System.out.println();
		}
		
	}

}
