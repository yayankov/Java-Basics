import java.util.Scanner;

public class Graduat2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int ctr=1;
        int ctr2=1;
        double total=0;
        while(ctr<=12){
            double a=Double.parseDouble(sc.nextLine());
            if(ctr2==2){
                System.out.printf("%s has been excluded at %d grade",name,ctr);
                break;
            }
            if(a<4) {
                ctr2++;
            }
            else {
                total += a;
                ctr++;
            }
        }
        double average=total/12;
      if(ctr==13)
            System.out.printf("%s graduated. Average grade: %.2f",name,average);
    }
}
