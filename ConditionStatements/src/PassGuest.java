import java.util.Scanner;

public class PassGuest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        if(a.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        }
        else System.out.println("Wrong password!");
    }
}
