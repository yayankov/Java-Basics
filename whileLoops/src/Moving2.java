import java.util.Scanner;

public class Moving2 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=Integer.parseInt(sc.nextLine());
            int b=Integer.parseInt(sc.nextLine());
            int c=Integer.parseInt(sc.nextLine());
            String input=sc.nextLine();
            int freeSpace=a*b*c;
            while(!input.equals("Done")){
                int box=Integer.parseInt(input);
                freeSpace-=box;
                if(freeSpace<0){
                    System.out.printf("No more space!");
                    return;
                }
                input=sc.nextLine();

            }
        System.out.println("There is a space!");
    }
}
