import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int width=Integer.parseInt(sc.nextLine());
        int length=Integer.parseInt(sc.nextLine());
        int height=Integer.parseInt(sc.nextLine());
        String done=sc.nextLine();
        int carton=0;
        int apartment=width*length*height;
        while(!done.equals("Done")){
            int n=Integer.parseInt(done);
            carton+=n;
            if(apartment<carton) break;
            done=sc.nextLine();
        }
        int difference=Math.abs(carton-apartment);
        if(carton<=apartment){
            System.out.printf(difference+" Cubic meters left.");
        }
        else
            System.out.printf("No more free space! You need %d Cubic meters more.",difference);
    }
}
