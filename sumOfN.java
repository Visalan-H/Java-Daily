public class sumOfN {

    public static int summ(int a){
        if (a<=1)
            return a;
        return a+summ(a-1);
    }

    public static void main(String[] args) {
        System.out.println(summ(5));
    }
}