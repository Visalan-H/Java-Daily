import java.util.Scanner;

public class multi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int product=0;

        int min=(num1<num2)?num1:num2;
        int max=(num1>num2)?num1:num2;

        while(min>0){
            product+=max;
            min-=1;
        }

        System.out.println(product);

        scanner.close();
    }
}
