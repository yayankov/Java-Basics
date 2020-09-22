import java.util.Scanner;

public class equalWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a.equalsIgnoreCase(b)){
            System.out.println("yes");
        }
        else System.out.println("no");
    }
}
