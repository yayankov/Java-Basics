import java.util.Scanner;

public class Traveling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            String country=sc.nextLine();
            if(country.equals("End")) break;
            double totalSum=Double.parseDouble(sc.nextLine());
            while(totalSum>0) {
                double sum = Double.parseDouble(sc.nextLine());
                totalSum -= sum;
            }
            System.out.printf("Going to %s!%n",country);
        }
    }
}

