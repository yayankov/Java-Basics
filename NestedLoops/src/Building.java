import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int floor=Integer.parseInt(sc.nextLine());
        int room=Integer.parseInt(sc.nextLine());
        char type;
        for(int i=floor;i>=1;i--){
            for(int j=0;j<room;j++){
                if(i%2==0) type='O';
                else type='A';
                if(i==floor) type='L';
                System.out.printf("%s%d%d ",type,i,j);

            }
            System.out.println();
        }
    }
}
