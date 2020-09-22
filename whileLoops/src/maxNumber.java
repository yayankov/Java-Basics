import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int min=Integer.MAX_VALUE;

        while(n>0){
            int num=Integer.parseInt(sc.nextLine());
            if(min>num) {
                min=num;
            }
            n--;
        }
        System.out.println(min);
    }
}
