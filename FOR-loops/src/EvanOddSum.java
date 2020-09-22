import java.util.Scanner;

public class EvanOddSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=n;i++){
            int num1=Integer.parseInt(sc.nextLine());
            if(i%2==0){
                sum1+=num1;
            }
            else {
                sum2+=num1;
            }
        }
        if(sum1==sum2)
        {
            System.out.println("Yes" );//
            System.out.println( "Sum = "+sum1);
        }
        else{
            System.out.println("No" );//Diff = "+Math.abs(sum1-sum2)
            System.out.println("Diff = "+Math.abs(sum1-sum2));
        }
    }
}
