public class Solution344 {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char copy = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = copy;
        }
    }
}
