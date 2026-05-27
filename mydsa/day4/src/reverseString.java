import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        String s = "Ananya WEDS Parth";
        char [] x = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            x [i] = s.charAt(i);
        }
        reversestring(x);

    }

    public static void reversestring(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(end>start){
            char temp = s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }

        System.out.print(Arrays.toString(s));


    }

}
