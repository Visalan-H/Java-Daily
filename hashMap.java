import java.util.HashMap;

public class hashMap {
    
    public static void main(String[] args) {
        

        String input="malaar";
        String output="";
        int start=0;

        int max = 0;
        int left = 0;

        HashMap<Character, Integer> position = new HashMap<>();

        for (int right = 0; right < input.length(); right++) {
            char current = input.charAt(right);

            if (!position.containsKey(current)) {
                position.put(current, right);
            } else {
                left = Math.max(left, position.get(current) + 1);
                position.put(current, right);
            }
            max = Math.max(max, (right - left) + 1);

        }
        System.out.println("max " + max);
        System.out.println(input.substring(left, left+max));
    }
}
