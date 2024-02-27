package main;

public class Enrollment {
    private int grade = -1;
    private Student student;
    private Course course;
    public void gradeCourse(int given_grade, Student _student, Course _course) {
        grade = given_grade;
        student = _student;
        course = _course;
    }
    public int getGrade() {
        return grade;
    }
    public Student getStudent() {
        return student;
    }
    public Course getCourse() {
        return course;
    }
}
