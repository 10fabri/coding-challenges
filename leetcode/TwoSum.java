package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);

    }

    static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> solution = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (solution.containsKey(complement)) {
                return new int[]{solution.get(complement), i};
            }

            solution.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
