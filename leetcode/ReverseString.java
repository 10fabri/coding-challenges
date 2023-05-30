package leetcode;

public class ReverseString {

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(s);
        System.out.println(s);
    }

    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char tempChar = s[left];
            s[left] = s[right];
            s[right] = tempChar;
            left++;
            right--;
        }

    }
}
