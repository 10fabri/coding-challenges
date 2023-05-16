package leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings1 = {"flower", "flow", "flight"};
        String[] strings2 = {"dog", "racecar", "car"};

        System.out.println(longestCommonPrefix(strings1));
        System.out.println(longestCommonPrefix(strings2));
    }

    static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String firstString = strs[0];
        String lastString = strs[strs.length - 1];
        int index = 0;

        while (index < firstString.length()) {
            if (firstString.charAt(index) == lastString.charAt(index)) {
                index++;
            } else {
                break;
            }
        }

        return index == 0 ? "" : firstString.substring(0, index);
    }
}
