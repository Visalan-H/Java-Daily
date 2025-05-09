import java.util.Scanner;

public class pattern1 {
    
    public static void main(String[] args) {
        int c=1;
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c+" ");
                c+=1;
            }
            System.out.println();
        }
        ip.close();

    }
}
