import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int first=n/100;
        int second=n/10%10;
        int third=n%10;
        int num;
        for(int i=1;i<=third;i++){
            for(int j=1;j<=second;j++){
                for(int k=1;k<=first;k++){
                    num=i*j*k;
                    System.out.printf("%d * %d * %d = %d;%n",i,j,k,num);
                }
            }
        }
    }
}
