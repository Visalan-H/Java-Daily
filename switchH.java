import java.util.Scanner;

public class switchH {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Enter first num");
            int num1 = inp.nextInt();
            System.out.println("Enter second num");
            int num2 = inp.nextInt();
            System.out.println("Choose 1,2,3,4,5 for +,-,*,/,quit");
            int opt = inp.nextInt();

            switch (opt) {
                case 1:
                    add(num1, num2);
                    break;
                case 2:
                    sub(num1, num2);
                    break;
                case 3:
                    mul(num1, num2);
                    break;
                case 4:
                    div(num1, num2);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Choose 1/2/3/4/5");
            }
        }
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void sub(int a, int b) {
        System.out.println(a - b);
    }

    public static void mul(int a, int b) {
        System.out.println(a * b);
    }

    public static void div(int a, int b) {
        if (b == 0)
            System.out.println("Can't divide by zero");
        else
            System.out.println(a / b);
    }
}
