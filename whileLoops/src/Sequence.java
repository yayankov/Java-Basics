import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int num=1;
        while(n>=num){
            System.out.println(num);
            num=num*2+1;
        }
    }
}
