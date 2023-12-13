public class Faculty {

	public String name;
	public Institute[] institutes;
	public Dean dean;
	public Faculty(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Institute[] getInstitutes() {
		return institutes;
	}

	public void setInstitutes(Institute[] institutes) {
		this.institutes = institutes;
	}

	public Dean getDean() {
		return dean;
	}

	public void setDean(Dean dean) {
		this.dean = dean;
	}
}