package main;

import java.util.Scanner;

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
                case "0":
                    System.out.println("Lopetetaan");
                    sc.close();
                    break;
                default:
                    System.out.println("Syöte oli väärä");
                    break;
            }
        }
    }
}
