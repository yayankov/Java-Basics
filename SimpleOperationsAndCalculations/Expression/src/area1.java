import java.util.Scanner;

public class area1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double Side1= Double.parseDouble(scanner.nextLine());
        double Side2=Double.parseDouble(scanner.nextLine());
        double area=Side1*Side2;
        System.out.println(area);
    }
}
