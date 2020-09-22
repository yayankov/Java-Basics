import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double income = Double.parseDouble(sc.nextLine());
        double grade = Double.parseDouble(sc.nextLine());
        double minSalary = Double.parseDouble(sc.nextLine());
        double scholarship;
        double scholarshipSocial = minSalary * 0.35;
        if (income > minSalary) {
            if (grade >= 5.50) {
                scholarship = grade * 25;
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(scholarship));
            } else {
                System.out.println("You cannot get a scholarship!");
            }
        } else if (grade >= 4.50) {
            if (grade >= 5.50) {
                scholarship = grade * 25;
                if (scholarship >= scholarshipSocial) {
                    System.out.printf("You get a scholarship for excellent results %.0f BGN",Math.floor(scholarship) );
                }
            }
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(scholarshipSocial));
        } else {
            System.out.println("You cannot get a scholarship!");
        }


    }
}
