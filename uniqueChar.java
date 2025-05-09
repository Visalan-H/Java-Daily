public class uniqueChar {
    
    public static void main(String[] args) {
        
        String a="Hello";
        String b="Helio";

        for (int i = 0; i < a.length(); i++) {
            int val=a.charAt(i)^b.charAt(i);
            if (val!=0){
                System.out.println(i);
            }
        }
    }
}
