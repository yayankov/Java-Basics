import java.util.Scanner;

public class areaFigures {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        switch (str){
            case "square":
                double a=Double.parseDouble(sc.nextLine());
                double area=a*a;
                System.out.printf("%.3f",area);
                break;
            case "rectangle":
                double b=Double.parseDouble(sc.nextLine());
                double c=Double.parseDouble(sc.nextLine());
                double area2=b*c;
                System.out.printf("%.3f",area2);
                break;
            case "circle":
                double d=Double.parseDouble(sc.nextLine());
                double area3=3.14159265359*d*d;
                System.out.printf("%.3f",area3);
                break;
            case "triangle":
                double e=Double.parseDouble(sc.nextLine());
                double f=Double.parseDouble(sc.nextLine());
                double area4=f*e/2;
                System.out.printf("%.3f",area4);
                break;
        }
    }
}
