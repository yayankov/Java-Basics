package com.company;

import java.util.Scanner;

public class ArchitectProgram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String nameArch=sc.nextLine();
        int numProject=Integer.parseInt(sc.nextLine());
        int hours=numProject*3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",
                nameArch,hours,numProject);
    }
}
