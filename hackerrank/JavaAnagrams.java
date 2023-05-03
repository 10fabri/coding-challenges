package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = scan.next();
        System.out.print("Enter second string: ");
        String b = scan.next();

        scan.close();

        boolean ret = isAnagram(a, b);

        System.out.println((ret) ? "\nAnagrams" : "\nNot Anagrams");
    }


    static boolean isAnagram(String s1, String s2) {

        if (s1.length() == s2.length()) {
            char[] s1Array = s1.toLowerCase().toCharArray();
            char[] s2Array = s2.toLowerCase().toCharArray();

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            return Arrays.equals(s1Array, s2Array);
        }

        return false;
    }
}
