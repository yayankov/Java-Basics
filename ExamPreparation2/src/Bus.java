import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        // vuvejdame broi putnici trugave, broi spirki,
        Scanner sc=new Scanner(System.in);
        int people=Integer.parseInt(sc.nextLine());
        int station=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=station;i++)
        {
            int out=Integer.parseInt(sc.nextLine());
            people-=out;
            int in=Integer.parseInt(sc.nextLine());
            people+=in;

            if(i%2==0) {
                people-=2;
            } else {
                people+=2;
            }
        }
        System.out.printf("The final number of passengers is : "+people);
        //necheten broi spirki +2 provervashi
        //cheten broi spirki -2 proverqvashi
        //kolko putnika v Burgas, krainata spirka

    }
}
