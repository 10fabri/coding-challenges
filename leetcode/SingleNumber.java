package leetcode;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    // Brute Force
    // TC: O(n), SC: O(n)
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        return set.iterator().next();
    }

    // TC: O(n), SC: O(1)
    public int singleNumberImproved(int[] nums) {
        int sn = nums[0];

        for (int num : nums) {
            sn = sn ^ num;
        }

        return sn;
    }
}
