package com.company;

import java.util.Scanner;

public class WeatherForecast2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double deg = Double.parseDouble(sc.nextLine());
        if (deg >= 26.00 && deg <= 35.00) {
            System.out.println("Hot");
        } else if (deg >= 20.10 && deg <= 25.90) {
            System.out.println("Warm");
        } else if (deg >= 15.00 && deg <= 20.00) {
            System.out.println("Mild");
        } else if (deg >= 12.00 && deg <= 14.90) {
            System.out.println("Cool");
        } else if (deg >= 5.00 && deg < 11.90) {
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }

    }
}

