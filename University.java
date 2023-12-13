public class University {

	public String name;

	public Faculty[] faculties;

	public University(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFaculties(Faculty[] faculties) {
		this.faculties = faculties;
	}

	public Faculty[] getFaculties() {
		return faculties;
	}

}