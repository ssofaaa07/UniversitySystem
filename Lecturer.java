public class Lecturer extends ResearchEmployee {

	public Course[] courses;
	public Lecturer(String name, int ssNo, String email, int numberOfEmployers) {
		super(name, ssNo, email, numberOfEmployers);
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	public void teach() {
		// TODO - implement Lecturer.teach
		throw new UnsupportedOperationException();
	}

	public void getStudentsMarks() {
		// TODO - implement Lecturer.getStudentsMarks
		throw new UnsupportedOperationException();
	}

}