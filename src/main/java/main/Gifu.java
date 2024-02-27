package main;

import java.util.ArrayList;

public class Gifu {
    private String university;
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Enrollment> enrollments = new ArrayList<>();
    public Gifu(String _university) {
        university = _university;
    }
    public void addCourse(Course course) {
        courses.add(course);
    }
    public void listCourses() {
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(i + ") " + courses.get(i).getInformation());
        }
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void listStudents() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(i + ") " + students.get(i).getInformation());
        }
    }
}
