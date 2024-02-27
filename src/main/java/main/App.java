package main;

import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Tervetuloa Gifu-järjestelmään");
        System.out.println("Mille yliopistolle haluat ottaa järjestelmän käyttöön?");
        Scanner sc = new Scanner(System.in);
        String university = sc.nextLine();
        Gifu gifu = new Gifu(university); 
        String choice = "";
        while (!choice.equals("0")) {
            System.out.println("1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille, 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Anna kurssin nimi:"); 
                    String course_name = sc.nextLine();
                    System.out.println("Anna kurssin ID:"); 
                    String course_id = sc.nextLine();
                    System.out.println("Anna kurssin maksimi opiskelijamäärä:"); 
                    int course_max_student_number = Integer.parseInt(sc.nextLine());
                    Course new_course = new Course(course_name, course_id, course_max_student_number);
                    gifu.addCourse(new_course);
                    break;
                case "2":
                    System.out.println("Anna opiskelijan nimi:"); 
                    String student_name = sc.nextLine();
                    System.out.println("Anna opiskelijan opiskelijanumero:"); 
                    String student_id = sc.nextLine();
                    Student new_student = new Student(student_name, student_id);
                    gifu.addStudent(new_student);
                    break;
                case "3":
                    gifu.listCourses();
                    break;
                case "4":
                    gifu.listStudents();
                    break;
                case "5":
                    gifu.listCourses();
                    System.out.println("Mille kurssille haluat lisätä opiskelijan? Syötä kurssin numero:");
                    Course course_to_enroll_to = gifu.getCourse(Integer.parseInt(sc.nextLine())); 
                    gifu.listStudents();
                    System.out.println("Minkä opiskelijan haluat lisätä kurssille? Syötä opiskelijan numero:");
                    Student student_to_enroll = gifu.getStudent(Integer.parseInt(sc.nextLine()));
                    gifu.enrollStudent(student_to_enroll, course_to_enroll_to);
                    break;
                case "6":

                    gifu.listCourses();
                    System.out.println("Minkä kurssin haluat arvostella? Syötä kurssin numero:");
                    Course course_to_grade = gifu.getCourse(Integer.parseInt(sc.nextLine()));
                    ArrayList<Enrollment> course_to_grade_enrollments = gifu.getEnrollments(course_to_grade);
                    for (Enrollment enrollment : course_to_grade_enrollments) {
                        System.out.println("Anna arvosana opiskelijalle " + enrollment.getStudent().getInformation());
                        int given_grade = Integer.parseInt(sc.nextLine());
                        enrollment.gradeCourse(given_grade);
                    }
                    break;
                case "7":
                    gifu.listCourses();
                    System.out.println("Minkä kurssin opiskelijat haluat listata? Syötä kurssin numero:");
                    Course course_to_list = gifu.getCourse(Integer.parseInt(sc.nextLine()));
                    ArrayList<Enrollment> course_to_list_enrollments = gifu.getEnrollments(course_to_list);
                    for (Enrollment enrollment : course_to_list_enrollments) {
                        System.out.println(enrollment.getStudent().getInformation() + ", arvosana: " + enrollment.getGrade());
                    }
                    break;
                case "8":
                    gifu.listStudents();
                    System.out.println("Minkä opiskelijan arvosanat haluat listata? Syötä opiskelijan numero:");
                    Student student_to_list = gifu.getStudent(Integer.parseInt(sc.nextLine()));
                    ArrayList<Enrollment> student_to_list_enrollments = gifu.getEnrollments(student_to_list);
                    System.out.println("Opiskelijan " + student_to_list.getInformation() + " arvosanat:");
                    for (Enrollment enrollment : student_to_list_enrollments) {
                        System.out.println(enrollment.getCourse().getInformation() + ", arvosana: " + enrollment.getGrade());
                    }
                    break;
                case "9":
                    for (Course course : gifu.getCourses()) {
                        System.out.println(course.getInformation());
                        ArrayList<Enrollment> course_enrollments = gifu.getEnrollments(course);
                        for (Enrollment enrollment : course_enrollments) {
                            System.out.println(enrollment.getStudent().getInformation() + ", arvosana: " + enrollment.getGrade());
                        }
                    }
                    break;
                case "0":
                    System.out.println("Kiitos ohjelman käytöstä.");
                    sc.close();
                    break;
                default:
                    System.out.println("Syöte oli väärä");
                    break;
            }
        }
    }
}
