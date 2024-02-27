package main;

public class Student implements PrintInfo {
    private String name;
    private String id;
    public Student (String _name, String _id) {
        name = _name;
        id = _id;
    }
    public String getInformation() {
        return id + " " + name;
    }
}
