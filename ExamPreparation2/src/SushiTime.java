import java.util.Scanner;

public class SushiTime {
    public static void main(String[] args) {
        // въвеждаме вид суши, ресторант, порции инт, символ
        Scanner sc = new Scanner(System.in);
        String sushi = sc.nextLine();
        String restaurant = sc.nextLine();
        int portion = Integer.parseInt(sc.nextLine());
        char delivery = sc.next().charAt(0);
        double sashimi;
        double maki;
        double uramaki;
        double temaki;
        double total;
        // изчислява цената на поръчката
        switch (sushi) {
            case "sashimi":
                if (restaurant.equals("Sushi Zone")) {
                    sashimi = 4.99;
                    total = portion * sashimi;
                    if (delivery == 'Y' || delivery == 'y') {
                        total = total * 1.2;
                    }
                    System.out.printf("Total price: %.0f lv.", Math.ceil(total));
                } else if (restaurant.equals("Sushi Time")) {
                    sashimi = 5.49;
                    total = portion * sashimi;
                    if (delivery == 'Y' || delivery == 'y') {
                        total = total * 1.2;
                    }
                    System.out.printf("Total price: %.0f lv.", Math.ceil(total));
                } else if (restaurant.equals("Sushi Bar")) {
                    sashimi = 5.25;
                    total = portion * sashimi;
                    if (delivery == 'Y' || delivery == 'y') {
                        total = total * 1.2;
                    }
                    System.out.printf("Total price: %.0f lv.", Math.ceil(total));
                } else if (restaurant.equals("Asian Pub")) {
                    sashimi = 4.50;
                    total = portion * sashimi;
                    if (delivery == 'Y' || delivery == 'y') {
                        total = total * 1.2;
                    }
                    System.out.printf("Total price: %.0f lv.", Math.ceil(total));
                } else
                    System.out.printf("%s is invalid restaurant!", restaurant);
                break;
            case "maki":
                if (restaurant.equals("Sushi Zone")) {
                    maki = 5.29;
                    total = portion * maki;
                    if (delivery == 'Y' || delivery == 'y') {
                        total = total * 1.2;
                    }
                    System.out.printf("Total price: %.0f lv.", Math.ceil(total));
                } else if (restaurant.equals("Sushi Time")) {
                    maki = 4.69;
                    total = portion * maki;
                    if (delivery == 'Y' || delivery == 'y') {
                        total = total * 1.2;
                    }
                    System.out.printf("Total price: %.0f lv.", Math.ceil(total));
                } else if (restaurant.equals("Sushi Bar")) {
                    maki = 5.55;
                    total = portion * maki;
                    if (delivery == 'Y' || delivery == 'y') {
                        total = total * 1.2;
                    }
                    System.out.printf("Total price: %.0f lv.", Math.ceil(total));
                } else if (restaurant.equals("Asian Pub")) {
                    maki = 4.80;
                    total = portion * maki;
                    if (delivery == 'Y' || delivery == 'y') {
                        total = total * 1.2;
                    }
                    System.out.printf("Total price: %.0f lv.", Math.ceil(total));
                } else
                    System.out.printf("%s is invalid restaurant!", restaurant);
                break;
            case "uramaki":
                if (restaurant.equals("Sushi Zone")) {
                    uramaki = 5.99;
                    total = portion * uramaki;
                    if (delivery == 'Y' || delivery == 'y') {
                        total = total * 1.2;
                    }
                    System.out.printf("Total price: %.0f lv.", Math.ceil(total));
                } else if (restaurant.equals("Sushi Time")) {
                    uramaki = 4.49;
                    total = portion * uramaki;
                    if (delivery == 'Y' || delivery == 'y') {
                        total = total * 1.2;
                    }
                    System.out.printf("Total price: %.0f lv.", Math.ceil(total));
                } else if (restaurant.equals("Sushi Bar")) {
                    uramaki = 6.25;
                    total = portion * uramaki;
                    if (delivery == 'Y' || delivery == 'y') {
                        total = total * 1.2;
                    }
                    System.out.printf("Total price: %.0f lv.", Math.ceil(total));
                } else if (restaurant.equals("Asian Pub")) {
                    uramaki = 5.50;
                    total = portion * uramaki;
                    if (delivery == 'Y' || delivery == 'y') {
                        total = total * 1.2;
                    }
                    System.out.printf("Total price: %.0f lv.", Math.ceil(total));
                } else
                    System.out.printf("%s is invalid restaurant!", restaurant);
                break;
            case "temaki":
                if (restaurant.equals("Sushi Zone")) {
                    temaki = 4.29;
                    total = portion * temaki;
                    if (delivery == 'Y' || delivery == 'y') {
                        total = total * 1.2;
                    }
                    System.out.printf("Total price: %.0f lv.", Math.ceil(total));
                } else if (restaurant.equals("Sushi Time")) {
                    temaki = 5.19;
                    total = portion * temaki;
                    if (delivery == 'Y' || delivery == 'y') {
                        total = total * 1.2;
                    }
                    System.out.printf("Total price: %.0f lv.", Math.ceil(total));
                } else if (restaurant.equals("Sushi Bar")) {
                    temaki = 4.75;
                    total = portion * temaki;
                    if (delivery == 'Y' || delivery == 'y') {
                        total = total * 1.2;
                    }
                    System.out.printf("Total price: %.0f lv.", Math.ceil(total));
                } else if (restaurant.equals("Asian Pub")) {
                    temaki = 5.50;
                    total = portion * temaki;
                    if (delivery == 'Y' || delivery == 'y') {
                        total = total * 1.2;
                    }
                    System.out.printf("Total price: %.0f lv.", Math.ceil(total));
                } else
                    System.out.printf("%s is invalid restaurant!", restaurant);
                break;
        }
        // ако ресторанта го няма: ...
        // за вкъщи се доплаща 20% от цялата сума
        // печата крайна цена закръглено нагоре
    }
}
