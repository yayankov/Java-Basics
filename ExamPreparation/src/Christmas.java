import java.util.Scanner;

public class Christmas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        while (!input.equals("Stop")) {
            for (int i = 0; i < input.length(); i++) {
                sum = sum - (int) (input.charAt(i));
            }
            if (sum < 0) {
                System.out.println("Not enough money!");
                return;
            } else {
                System.out.println("Item successfully purchased!");
            }
            input = sc.nextLine();
        }
        System.out.println("Money left: " + sum);

    }
}
