
import java.util.Scanner;

public class CookieFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String product = sc.nextLine();
        int ctr = 0;
        int ctr2 = 0;
        for (int i = 1; i <= n; i++) {
            while (!product.equals("Bake!")) {
                if (product.equals("flour")) ctr++;
                if (product.equals("sugar")) ctr++;
                if (product.equals("eggs")) ctr++;
                product = sc.nextLine();
            }
            if (ctr==3) {
                System.out.println("Baking batch number " + i + "...");
            }
            else{
                System.out.println("The batter should contain flour, eggs and sugar!");
                i--;
            }
            ctr = 0;
            product = sc.nextLine();
        }
    }
}
