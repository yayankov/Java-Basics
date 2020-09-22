import java.util.Scanner;

public class numSequences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int num=Integer.parseInt(sc.nextLine());
            if(min>num) min=num;
            if(max<num) max=num;
        }
        System.out.println("Max number: "+max);
        System.out.println("Min number: "+min);
    }
}
