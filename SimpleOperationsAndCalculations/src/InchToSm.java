import java.util.Scanner;

public class InchToSm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double NumInch = Double.parseDouble(sc.nextLine());
        double NumSm = NumInch * 2.54;
        System.out.printf("%.2f",NumSm);

    }
}
