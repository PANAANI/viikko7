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
    public Course getCourse(int id) {
        return courses.get(id);
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void listStudents() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(i + ") " + students.get(i).getInformation());
        }
    }
    public Student getStudent(int id) {
        return students.get(id);
    }
    public void enrollStudent(Student student, Course course) {
        Enrollment enrollment = new Enrollment(student, course);
        enrollments.add(enrollment);       
    }
    public ArrayList<Enrollment> getEnrollments(Course course) {
        ArrayList<Enrollment> course_enrollments = new ArrayList<>();
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getCourse() == course) {
                course_enrollments.add(enrollment);
            }
        }
        return course_enrollments;
    }
    public ArrayList<Enrollment> getEnrollments(Student student) {
        ArrayList<Enrollment> student_enrollments = new ArrayList<>();
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getStudent() == student) {
                student_enrollments.add(enrollment);
            }
        }
        return student_enrollments;
    }
}
