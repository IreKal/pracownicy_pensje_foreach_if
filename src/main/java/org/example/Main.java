package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik("Jan","Kowalski",50,100);
        System.out.println(pracownik.toString());
       PracownikZNadgodzinami pracownikZN = new PracownikZNadgodzinami("Jan","Kowalski",50,100,30);
        System.out.println(pracownikZN.toString());
    }
//    Scanner scan = new Scanner(System.in);
//        System.out.println("Kalkulator wynagrodzen");
//
//
//        System.out.println("Podaj rodzaj umowy: Umowa o prace, Umowa zlecenie, Umowa o dzielo");
//    String umowa  = scan.nextLine();
//
//
//        System.out.println("podaj ilosc dni roboczych danego miesiaca");
//    int ile_dni   = scan.nextInt();
//
//
//        System.out.println("podaj ilosc godzin przepracowanych w soboty, niedziele i swieta: " );
//    int ile_godz   = scan.nextInt();
//
//
//        System.out.println("podaj ilosc dni przebytych na urlopie");
//    int dni_url   = scan.nextInt();
//
//
//        System.out.println("podaj ilosc dni przebytych na zwolnieniu lekarskim");
//    int dni_chr   = scan.nextInt();
//
//
//        System.out.println("podaj ilosc dni wolnych od a przebytych na zwolnieniu lekarskim");
//    int dni_w_chr   = scan.nextInt();


}