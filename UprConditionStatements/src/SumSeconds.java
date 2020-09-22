import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int timeF=Integer.parseInt(sc.nextLine());
        int timeS=Integer.parseInt(sc.nextLine());
        int timeT=Integer.parseInt(sc.nextLine());
        int totalTime = timeF+timeS+timeT;
        int minutes=totalTime/60;
        int seconds=totalTime%60;
        if(seconds>9){
            System.out.printf("%d:%d",minutes,seconds);
        }
        else {
            System.out.printf("%d:0%d",minutes,seconds);
        }
    }
}
