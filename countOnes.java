import java.util.Scanner;

public class countOnes {
    
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt();
        int c=0;
        while(a>0){
            c+=(a&(int)1);
            a>>=1;
        }
        System.out.println(c);
    }
}
