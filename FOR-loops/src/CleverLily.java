import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=Integer.parseInt(sc.nextLine());
        double priceWash=Double.parseDouble(sc.nextLine());
        int priceToy=Integer.parseInt(sc.nextLine());
        int toyCount=0;
        int money=0;
        int ctr=1;
        for(int i=1;i<=age;i++)
        {
            if(i%2==1){
                toyCount++;
            }
            else {
                money+=10*ctr;
                money-=1;
                ctr++;
            }
        }
        double moneyToy=toyCount*priceToy;
        money+=moneyToy;
        double diff=Math.abs(money-priceWash);
        if(money>=priceWash){
            System.out.printf("Yes! %.2f",diff);
        }
        else System.out.printf("No! %.2f",diff);

    }
}