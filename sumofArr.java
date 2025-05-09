public class sumofArr {
    
    public static int summ(int[] arr,int i){
        if(i==0)
            return arr[i];
        return arr[i]+summ(arr, i-1);

    }
    public static void main(String[] args) {
        int[] arr={5,6,4,3,4,5};
        System.out.println(summ(arr,arr.length-1));
    }
}
