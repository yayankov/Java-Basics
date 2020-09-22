import java.util.Scanner;

public class BalanceMoney {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int i=1;
        double  total=0;
        while(n>=i){
            double a=Double.parseDouble(sc.nextLine());
            if(a<0){
                System.out.println("Invalid operation!");
                break;
            }
                System.out.printf("Increase: %.2f%n",a);

            total+=a;
            i++;
        }
        System.out.printf("Total: %.2f%n",total);
    }
}
