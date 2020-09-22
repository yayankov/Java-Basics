import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int ctr=0;
        double total=0;
        while(ctr<12){
            double a=Double.parseDouble(sc.nextLine());
            if(a>=4) {
                total += a;
                ctr++;
            }


        }
        double average=total/12;
        System.out.printf("%s graduated. Average grade: %.2f",name,average);
    }
}
