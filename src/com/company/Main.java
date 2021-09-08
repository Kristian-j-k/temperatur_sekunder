package com.company;
import java.util.Scanner;


public class Main {




public static void main(String[] args) {
// Exercise 2 tester hvad der sker når der bliver givet to format typer til en value
    Scanner in = new Scanner(System.in);
    final double ONE_FAH_IN_CEL = 17.2222222;

    System.out.print("Hvor mange grader varmt er her? ");
    double gra = in.nextInt();
    System.out.printf("%.1f grader er %.1f Fahrenheit\n", gra, ONE_FAH_IN_CEL * gra);

//Exercise 3 converts to total number of seconds
    System.out.print("tast antal sekunder: ");
    int secIn = in.nextInt();
    final int secPerHour = 3600;
    final int secPerMin = 60;
    int hour = secIn / secPerHour;
    int min = secIn % secPerHour / secPerMin;
    int sec = secIn % secPerMin;

    System.out.println(hour + " time, " + min + " minutter, " + sec + " sekunder");
}

}
