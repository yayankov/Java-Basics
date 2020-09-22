import java.util.Scanner;

public class SeaTrip {
    public static void main(String[] args) {
        // въвеждане пари за храна,сувенири,хотел
        Scanner sc = new Scanner(System.in);
        int food = Integer.parseInt(sc.nextLine());
        int souvenirs = Integer.parseInt(sc.nextLine());
        int hotel = Integer.parseInt(sc.nextLine());
        // 210км разст, 3 дни
        double fuel = 420 *0.07;
        double forCar = fuel * 1.85;
        // на ден храна+сувенири
        double expense = 3 * (food + souvenirs);
        // хотел 1ви ден- 10%, 2ри ден- 15%, 3ти ден 20%
        double hotelAll = hotel *0.9 + hotel*0.85 + hotel*0.8;
        double total = forCar + expense + hotelAll;
        System.out.printf("Money needed: %.2f", total);
    }
}
