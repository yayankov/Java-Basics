import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        double bonus;
        double num;
        if(n<=100)
        {
            bonus=5;
            if(n%2==0)
            {
                bonus++;
            }
            if(n%10==5)
            {
                bonus+=2;
            }

            num=n;
            num+=bonus;
            System.out.println(bonus);
            System.out.println(num);
        }else if(n>100 && n<=1000){
            bonus=n*0.2;
            if(n%2==0)
            {
                bonus++;
            }
            if(n%10==5)
            {
                bonus+=2;
            }
            num=n;
            num+=bonus;
            System.out.println(bonus);
            System.out.println(num);
        }
        else if(n>1000) {
            bonus=n*0.1;
            if(n%2==0)
            {
                bonus++;
            }
            if(n%10==5)
            {
                bonus+=2;
            }
            num=n;
            num+=bonus;
            System.out.println(bonus);
            System.out.println(num);
        }
    }
}
