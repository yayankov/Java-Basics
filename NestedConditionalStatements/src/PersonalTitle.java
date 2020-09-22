import java.util.Scanner;

public class PersonalTitle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double age=Double.parseDouble(sc.nextLine());
        char sex=sc.next().charAt(0);
        if(age>=16 && sex=='m')
            System.out.println("Mr.");
        else if(age<16 && sex=='m')
            System.out.println("Master");
        else if(age>=16 && sex=='f')
            System.out.println("Ms.");
        else if(age<16 && sex=='f')
            System.out.println("Miss");

    }
}
