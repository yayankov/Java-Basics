import java.util.Scanner;

public class reservation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //room 30lv
        //10 days earlier 25lv
        //1 month earlier 20% otstypka 25lv
        int dayRes=Integer.parseInt(sc.nextLine());
        int monthRes=Integer.parseInt(sc.nextLine());
        int in=Integer.parseInt(sc.nextLine());
        int monthIn=Integer.parseInt(sc.nextLine());
        int out=Integer.parseInt(sc.nextLine());
        int monthOut=Integer.parseInt(sc.nextLine());
        double cost;
        double room;
        double during=out-in;
        if((in-dayRes)>=10){
            room=25;
            cost=room*during;
        }
        else if(monthRes<monthIn){
            room=25;
            cost=room*during;
            cost=cost-cost*0.2;
        }
        else{
            room=30;
            cost=room*during;
        }
        System.out.printf("Your stay from %d/%d to %d/%d will cost %.2f",in,monthIn,out,monthOut,cost);
    }
}
