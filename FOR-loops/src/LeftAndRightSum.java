import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=n;i++){
            int num1=Integer.parseInt(sc.nextLine());
            sum1+=num1;
        }
        for(int j=1;j<=n;j++){
            int num2=Integer.parseInt(sc.nextLine());
            sum2+=num2;
        }
        if(sum1==sum2)
        {
            System.out.println("Yes, sum = "+sum1);
        }
        else{
            System.out.println("No, diff = "+Math.abs(sum1-sum2));
        }
    }
}
