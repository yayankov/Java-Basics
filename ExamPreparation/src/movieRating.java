import java.util.Scanner;

public class movieRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double minRate = Double.MAX_VALUE;
        double maxRate = Double.MIN_VALUE;
        String bestMovie = null;
        String worstMovie = null;
        double sum = 0;
        double beforeRate = 0;
        for (int i = 1; i <= n; i++) {
            String movie = sc.nextLine();
            double rating = Double.parseDouble(sc.nextLine());
            if (minRate > rating) {
                minRate = rating;
                worstMovie = movie;
            }
            if (maxRate < rating) {
                maxRate = rating;
                bestMovie = movie;
            }
            sum += rating;
        }
        double average = sum / n;
        System.out.printf("%s is with highest rating: %.1f\n", bestMovie, maxRate);
        System.out.printf("%s is with lowest rating: %.1f\n", worstMovie, minRate);
        System.out.printf("Average rating: %.1f\n", average);
    }
}
