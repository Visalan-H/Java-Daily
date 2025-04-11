import java.util.Scanner;


public class fact {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int fact=1;
        int num=input.nextInt();
        System.out.println(num/5);
        while(num>0){
            fact=fact*num;
            num-=1;
        }
        System.out.println(fact);

    }
}