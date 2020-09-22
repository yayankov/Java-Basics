import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int income=Integer.parseInt(sc.nextLine());
        int month=Integer.parseInt(sc.nextLine());
        double sum=Double.parseDouble(sc.nextLine());
        //kolko procenta ot dohodite si moje da spestqva
        //30% nepredvideni razhodi
        double savingsMonth=income-(sum + (income*0.3));
        double percent=savingsMonth/income*100;
        double savingsAll=month*savingsMonth;
        System.out.printf("She can save %.2f%%\n",percent);
        System.out.printf("%.2f",savingsAll);

    }
}
