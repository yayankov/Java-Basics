import java.util.Scanner;

public class BachelorParty {
    public static void main(String[] args) {
        // vhodni danni suma fo singer
        Scanner sc=new Scanner(System.in);
        int singer=Integer.parseInt(sc.nextLine());
        // broi na horata dokato vyvede restorantyt e pylen
        String command=sc.nextLine();
        double couvert = 0;
        double total=0;
        int people=0;
        while(!command.equals("The restaurant is full")){
            int n=Integer.parseInt(command);
            if(n<5) couvert=100;
            if(n>4) couvert=70;
            people+=n;
            total+=couvert*n;
            command=sc.nextLine();
        }
        if(total>=singer)
        {
            double left=total-singer;
            System.out.printf("You have %d guests and %.0f leva left.",people,left);
        } else {
            System.out.printf("You have %d guests and %.0f leva income, but no singer.",people,total);
        }

    }
}
