import java.util.Scanner;

public class animalType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        switch (n) {
            case "dog":
                System.out.println("mammal"); break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");break;
            default:
                System.out.println("unknown");break;
        }
    }
}
