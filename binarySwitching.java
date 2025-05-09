import java.util.Scanner;

public class binarySwitching {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt();
        int b=inp.nextInt();
        int c=a^b;
        int co=0;
        while(c>0){
            co+=(a&(int)1);
            c>>=1;
        }
        System.out.println(co);
    }
}