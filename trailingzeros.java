import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 0;
        while (n > 4) {
            n = n / 5;
            res += n; 
        }
        System.out.println(res);

        sc.close();

    }
}