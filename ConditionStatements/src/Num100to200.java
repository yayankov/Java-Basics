import java.util.Scanner;

public class Num100to200 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        if(n<100){
            System.out.println("Less than 100");
        }
        else if(n>=100 && n<=200)
        {
            System.out.println("Between 100 and 200");
        }
        else if(n>200){
            System.out.println("Greater than 200");
        }
    }
}
