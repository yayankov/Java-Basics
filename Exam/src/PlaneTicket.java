import java.util.Scanner;

public class PlaneTicket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String flight=sc.nextLine();
        String bestFlight=null;
        int minTime=Integer.MAX_VALUE;
        double priceBest=0.0;
        while(!flight.equals("End")) {
            double priceEuro = Double.parseDouble(sc.nextLine());
            int stay = Integer.parseInt(sc.nextLine());
            double price=priceEuro * 1.96;
            if(minTime>stay){
                bestFlight=flight;
                minTime=stay;
                priceBest=price;
            }
            flight=sc.nextLine();
        }
        int h=minTime/60;
        int m=minTime%60;
        System.out.printf("Ticket found for flight %s costs %.2f leva with %dh %dm stay",bestFlight,priceBest,h,m);
    }
}
