import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double a=Double.parseDouble(sc.nextLine());
        if(a>=5.50 && a<=6)
        {
            System.out.println("Excellent!");
        }
    }
}
