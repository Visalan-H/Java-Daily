public class longestPrefix {
    public static void main(String[] args) {
        String[] cars={"flower","fly","flow"};
        int min=cars[0].length;
        String minii=cars[0];
        for (int i = 1; i < cars.length; i++) {
            if(cars[i].length()<min){
                min=cars[i].length;
                minii=cars[i];
            }
        }
        int j=0;
        for (int i = 0; i <minii.length; i++) {
            int f=1;
            if(!cars[i].startsWith(minii.substring(0,minii.length()-i))){
                f=0;
            }
            if(f==0){
                System.err.println("prefix is "+minii.substring(0, minii.length()-i));
                break;
            }
        }
        
    }
}
