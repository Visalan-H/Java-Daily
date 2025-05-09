public class tryCatchExcept {
    
    public static void main(String[] args) {
        
        int a=10;
        int b=2;

        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("can't divide by zero");
        }
    }
}
