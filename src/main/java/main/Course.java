package main;

public class Course implements PrintInfo {
    private String name;
    private String id;
    private int max_number_of_students;
    public Course (String _name, String _id, int _max_number_of_students) {
        name = _name;
        id = _id;
        max_number_of_students = _max_number_of_students;
    }
    public String getInformation() {
        return id + " " + name;
    }
}
