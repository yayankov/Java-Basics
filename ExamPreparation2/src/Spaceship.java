import java.util.Scanner;

public class Spaceship {
    public static void main(String[] args) {
        // кораб с размери length, width, height, average
        Scanner sc = new Scanner(System.in);
        double length = Double.parseDouble(sc.nextLine());
        double width = Double.parseDouble(sc.nextLine());
        double height = Double.parseDouble(sc.nextLine());
        double average = Double.parseDouble(sc.nextLine());
        // поне 3ма, но не повече от 10
        // на човек стая с размери 2,2,average+40
        // извежда обем на кораба
        double volumeAll = length * width * height;
        // колко астронавти събира
        double volumeRoom = (average + 0.40) * 2 * 2;
        int people = (int) Math.floor(volumeAll / volumeRoom);
        // достатъчно голям ли е
        if (people >= 3 && people <= 10) {
            System.out.printf("The spacecraft holds %d astronauts.", people);
        } else if (people < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (people > 10) {
            System.out.println("The spacecraft is too big.");
        }

    }
}
