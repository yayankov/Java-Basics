import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String familyName=sc.nextLine();
        int age=Integer.parseInt(sc.nextLine());
        String town=sc.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.",
                name,familyName,age,town);
    }
}
