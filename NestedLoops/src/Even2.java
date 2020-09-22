import java.util.Scanner;

public class Even2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int num;
        for (int i = 0; i <= n; i += 2) {
            num = (int) Math.pow(2, i);
            System.out.println(num);
        }

    }
}
