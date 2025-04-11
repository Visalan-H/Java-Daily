import java.util.Scanner;

public class armStrong {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        int exp = (int) Math.log10(num) + 1;
        int org=num;

        int sum=0;
        while(num>0){
            int temp=num%10;
            sum+=Math.pow(temp,exp);
            num/=10;
        }
        if(sum==org)
            System.out.println("armstrong");
        else
            System.out.println("Nope");

    }
}
