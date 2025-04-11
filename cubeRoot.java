import java.util.Scanner;

public class cubeRoot {
    
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int num=inp.nextInt();
        float low=0;
        float high=num;
        int f=0;
        int low1=0;
        int high1=num;
        while(low<=high){
            float mid=(low+high)/2;
            int mid2=(low1+high1)/2;
            int cube2=mid2*mid2*mid2;
            float cube = mid*mid*mid;
            if(cube2==num){
                System.out.println(Math.round(mid2));
                f=1;
                break;
            }
            else if(cube<num){
                low=mid+(float)0.00001;
                low1=mid2+1;
            }
            else{
                high=mid-(float)0.00001;
                high1 = mid2-1;
            }
        }
        if(f==0)
            System.out.println(high);
        
    }
}
