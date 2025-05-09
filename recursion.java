public class recursion {
    

    public static void print(int count){
        if(count>20000)
            return;
        System.out.println(count);
        print(count+1);
    }
    public static void main(String[] args) {
        int count=1;
        // print(count);
        // for (int i = 0; i < Integer.MAX_VALUE; i++) {
        //     System.out.println(i);
        // }
    }
}
