import java.util.Scanner;

public class warName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int sum=0;
        int currentSum=0;
        String bestName = null;
        int bestSum=0;
        while(!name.equals("STOP")){
            sum=0;
            for(int i=0;i<name.length();i++){
                sum+=(int)(name.charAt(i));
            }
            if(sum>currentSum){
                bestName=name;
                bestSum=sum;
            }
            currentSum=sum;
            name=sc.nextLine();
        }
        System.out.printf("Winner is %s - %d!",bestName,bestSum);
    }
}
