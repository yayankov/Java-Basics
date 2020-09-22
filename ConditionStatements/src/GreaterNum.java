import java.util.Scanner;

public class GreaterNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int m=Integer.parseInt(sc.nextLine());
        if(n>m) {
            System.out.println(n);
        }
        else System.out.println(m);
    }
}
