package leetcode;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        if (x < 0 || (x != 0 && x % 10 == 0)) return false;

        int reversedInt = 0;

        while (x > reversedInt) {
            int digit = x % 10;
            reversedInt = (reversedInt * 10) + digit;
            x /= 10;
        }

        return (x == reversedInt || x == reversedInt / 10);

    }

}
