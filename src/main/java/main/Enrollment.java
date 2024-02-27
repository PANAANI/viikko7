package main;

public class Enrollment {
    private int grade = -1;
    private Student student;
    private Course course;
    public Enrollment(Student _student, Course _course) {
        student = _student;
        course = _course;
    }
    public void gradeCourse(int given_grade) {
        grade = given_grade;
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
