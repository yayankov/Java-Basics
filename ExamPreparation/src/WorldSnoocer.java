import java.util.Scanner;

public class WorldSnoocer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matchDay = sc.nextLine();
        String typeTicket = sc.nextLine();
        int tickets = Integer.parseInt(sc.nextLine());
        String image = sc.nextLine();

        double standardTicket;
        double premiumTicket;
        double VIPTicket;
        double total;
        boolean isImage = false;
        if (matchDay.equals("Quarter final")) {
            if (typeTicket.equals("Standard")) {
                standardTicket = 55.50;
                total = tickets * standardTicket;

                if (total >= 4000) {
                    total = total - total * 0.25;
                    isImage = true;
                } else if (total > 2500) {
                    total = total - total * 0.1;
                }
                if (!isImage && image.equals("Y")) {
                    total += tickets * 40;
                }
                System.out.printf("%.2f", total);

            } else if (typeTicket.equals("Premium")) {
                premiumTicket = 105.20;
                total = tickets * premiumTicket;

                if (total >= 4000) {
                    total = total - total * 0.25;
                    isImage = true;
                } else if (total > 2500) {
                    total = total - total * 0.1;
                }
                if (!isImage && image.equals("Y")) {
                    total += tickets * 40;
                }
                System.out.printf("%.2f", total);


            } else if (typeTicket.equals("VIP")) {
                VIPTicket = 118.90;
                total = tickets * VIPTicket;

                if (total >= 4000) {
                    total = total - total * 0.25;
                    isImage = true;
                } else if (total > 2500) {
                    total = total - total * 0.1;
                }
                if (!isImage && image.equals("Y")) {
                    total += tickets * 40;
                }
                System.out.printf("%.2f", total);

            }
        } else if (matchDay.equals("Semi final")) {
            if (typeTicket.equals("Standard")) {
                standardTicket = 75.80;
                total = tickets * standardTicket;


                if (total >= 4000) {
                    total = total - total * 0.25;
                    isImage = true;
                } else if (total > 2500) {
                    total = total - total * 0.1;
                }
                if (!isImage && image.equals("Y")) {
                    total += tickets * 40;
                }
                System.out.printf("%.2f", total);

            } else if (typeTicket.equals("Premium")) {
                premiumTicket = 125.22;
                total = tickets * premiumTicket;
                if (total >= 4000) {
                    total = total - total * 0.25;
                    isImage = true;
                } else if (total > 2500) {
                    total = total - total * 0.1;
                }
                if (!isImage && image.equals("Y")) {
                    total += tickets * 40;
                }
                System.out.printf("%.2f", total);

            } else if (typeTicket.equals("VIP")) {
                VIPTicket = 300.40;
                total = tickets * VIPTicket;

                if (total >= 4000) {
                    total = total - total * 0.25;
                    isImage = true;
                } else if (total > 2500) {
                    total = total - total * 0.1;
                }
                if (!isImage && image.equals("Y")) {
                    total += tickets * 40;
                }
                System.out.printf("%.2f", total);

            }
        } else if (matchDay.equals("Final")) {
            if (typeTicket.equals("Standard")) {
                standardTicket = 110.10;
                total = tickets * standardTicket;
                if (total >= 4000) {
                    total = total - total * 0.25;
                    isImage = true;
                } else if (total > 2500) {
                    total = total - total * 0.1;
                }
                if (!isImage && image.equals("Y")) {
                    total += tickets * 40;
                }
                System.out.printf("%.2f", total);

            } else if (typeTicket.equals("Premium")) {
                premiumTicket = 160.66;
                total = tickets * premiumTicket;

                if (total >= 4000) {
                    total = total - total * 0.25;
                    isImage = true;
                } else if (total > 2500) {
                    total = total - total * 0.1;
                }
                if (!isImage && image.equals("Y")) {
                    total += tickets * 40;
                }
                System.out.printf("%.2f", total);

            } else if (typeTicket.equals("VIP")) {
                VIPTicket = 400;
                total = tickets * VIPTicket;

                if (total >= 4000) {
                    total = total - total * 0.25;
                    isImage = true;
                } else if (total > 2500) {
                    total = total - total * 0.1;
                }
                if (!isImage && image.equals("Y")) {
                    total += tickets * 40;
                }
                System.out.printf("%.2f", total);
            }
        }
    }
}
