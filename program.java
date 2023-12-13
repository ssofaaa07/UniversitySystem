import java.util.Date;

public class program {
    public static void main(String[] args) {
        University university = new University("Some University");
        Faculty faculty = new Faculty("Some Faculty");
        Institute institute = new Institute("Some Institute", "Some Address");

        university.setFaculties(new Faculty[]{faculty});
        faculty.setInstitutes(new Institute[]{institute});

        Dean dean = new Dean("Some name Dean", 1, "some_email1@gmail.com", 1);

        faculty.setDean(dean);

        ResearchEmployee researchEmployeeFirst = new ResearchEmployee("Some name Research", 2, "some_email2@gmail.com", 2);
        ResearchEmployee researchEmployeeSecond = new ResearchEmployee("Some name Research", 2, "some_email2@gmail.com", 2);

        institute.setResearchEmployees(new ResearchEmployee[]{researchEmployeeFirst, researchEmployeeSecond});
        researchEmployeeFirst.setInstitute(institute);
        researchEmployeeSecond.setInstitute(institute);

        Project projectFirst = new Project("Some name Project 1", 120, new Date(274792), new Date(474579));
        Project projectSecond = new Project("Some name Project 2", 240, new Date(274792), new Date(474579));

        researchEmployeeFirst.setProjects(new Project[]{projectFirst, projectSecond});

        AdministrativeEmployee administrativeEmployee = new AdministrativeEmployee("Some name Research", 3, "some_email3@gmail.com", 3);

        Lecturer lecturer = new Lecturer("Some name lecturer", 4, "some_email4@gmail.com", 4);

        Course courseFirst = new Course(1, "Some course 1", 2);
        Course courseSecond = new Course(2, "Some course 2", 3);

        lecturer.setCourses(new Course[]{courseFirst, courseSecond});
    }

}
