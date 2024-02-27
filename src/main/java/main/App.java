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
                    
                    break;
                case "2":

                    break;
                case "0":
                    System.out.println("Lopetetaan");
                    break;
                default:
                    System.out.println("Syöte oli väärä");
                    break;
            }
        }
    }
}
