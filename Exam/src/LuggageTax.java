import java.util.Scanner;

public class LuggageTax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int width=Integer.parseInt(sc.nextLine());
        int height=Integer.parseInt(sc.nextLine());
        int depth=Integer.parseInt(sc.nextLine());
        String priority=sc.nextLine();
        int V=width*height*depth;
        double luggageTax = 0.0;
        if(V<101 && V>49){
            switch (priority){
                case "true": luggageTax=0.0;
                    break;
                case "false": luggageTax=25;
                    break;
            }
        } else if(V>100 && V<201){
            switch (priority){
                case "true":  luggageTax=10;
                    break;
                case "false":  luggageTax=50;
                    break;
            }
        }else if(V>200 && V<301){
            switch (priority){
                case "true":  luggageTax=20;
                    break;
                case "false": luggageTax=100;
                    break;
            }
        }
        System.out.printf("Luggage tax: %.2f",luggageTax);
    }
}
