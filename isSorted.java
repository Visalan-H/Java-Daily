public class isSorted {
    
    public static void main(String[] args) {
        
        int[] arr= {1,2,3,5,7,6};
        boolean flag=true;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>=arr[j])
                    flag=false;
                    break;
            }
            if(!flag)
                break;
        }
        if(flag){
            System.out.println("sorted");
        }
        else
            System.out.println("not sorted");
    }
}
