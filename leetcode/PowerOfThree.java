package leetcode;

public class PowerOfThree {

    public static void main(String[] args) {

        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(81));
        System.out.println(isPowerOfThree(243));
        System.out.println(isPowerOfThree(0));
        System.out.println(isPowerOfThree(-1));

    }

    static boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 3 != 0) return false;
        return isPowerOfThree(n / 3);
    }
}
