public class fibo {

    public static int fiboo(int n){
        if(n==0 || n==1)
            return n;
        return fiboo(n-1)+fiboo(n-2);
    }

    public static void main(String[] args) {
        int num=5;
        System.out.println(fiboo(num));
    }
}

// 0,1,1,2,3,5,8,13,21