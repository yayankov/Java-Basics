import java.util.Scanner;

public class bakingCompetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = Integer.parseInt(sc.nextLine());
        int numCookies = 0;
        int numCakes = 0;
        int numWaffles = 0;
        int total = 0;
        double sum = 0;
        for (int i = 1; i <= people; i++) {
            String name = sc.nextLine();

            numCookies = 0;
            numCakes = 0;
            numWaffles = 0;
            while (true) {
                String type = sc.nextLine();
                if(type.equals("Stop baking!")) break;
                int num = Integer.parseInt(sc.nextLine());
                switch (type) {
                    case "cookies":
                        numCookies += num; break;
                    case "cakes":
                        numCakes += num;break;
                    case "waffles":
                        numWaffles += num;break;
                }
                total += num;

            }
            sum += numCakes * 7.80 + numCookies * 1.50 + numWaffles * 2.30;
            System.out.printf("%s baked %d cookies, %d cakes and %d waffles.\n", name, numCookies, numCakes, numWaffles);
        }
        System.out.println("All bakery sold: " + total);
        System.out.printf("Total sum for charity: %.2f lv.", sum);
    }
}
