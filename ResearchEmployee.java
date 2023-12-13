public class ResearchEmployee extends Employee {

	public Project[] projects;
	public Institute institute;
	public String researchArea;

	public ResearchEmployee(String name, int ssNo, String email, int numberOfEmployers) {
		super(name, ssNo, email, numberOfEmployers);
	}

	public Project[] getProjects() {
		return projects;
	}

	public void setProjects(Project[] projects) {
		this.projects = projects;
	}

	public Institute getInstitute() {
		return institute;
	}

	public void setInstitute(Institute institute) {
		this.institute = institute;
	}

	public String getResearchArea() {
		return researchArea;
	}

	public void setResearchArea(String researchArea) {
		this.researchArea = researchArea;
	}

	public void doResearchWork() {
		// TODO - implement ResearchEmployee.doResearchWork
		throw new UnsupportedOperationException();
	}

}