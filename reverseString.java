public class reverseString {
    public static StringBuilder reverse(StringBuilder sb, int index) {
        if (2*index == sb.length() - 1) {
            return sb;
        } else {
            char temp = sb.charAt(index);
            sb.setCharAt(index, sb.charAt(sb.length() - 1 - index));
            sb.setCharAt(sb.length() - 1 - index, temp);
            return reverse(sb, index + 1);
        }
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb = reverse(sb, 0);
        System.out.println(sb); 
    }
}
