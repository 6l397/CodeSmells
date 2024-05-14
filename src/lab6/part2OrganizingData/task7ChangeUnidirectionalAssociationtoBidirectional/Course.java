package lab6.part2OrganizingData.task7ChangeUnidirectionalAssociationtoBidirectional;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;
    private List<Student> students;

    public Course(String title) {
        this.title = title;
        this.students = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
