import java.util.Scanner;

public class perfectNumber {
    
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int num=inp.nextInt();
        int sum=1;
        for (int i=2;i<=num/2;i++)
        {
            if(num%i==0)
                sum+=i;
            else
                continue;
        }
        if(sum==num)
            System.out.println("perfecto");
        else
            System.out.println("Not perfecto");

        inp.close();
    }
}
