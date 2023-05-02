package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {

        System.out.println(fizzBuzz(100));

    }

    static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int index = 1; index <= n; index++) {
            if (index % 15 == 0) {
                result.add("FizzBuzz");
            } else if (index % 5 == 0) {
                result.add("Buzz");
            } else if (index % 3 == 0) {
                result.add("Fizz");
            } else {
                result.add(String.valueOf(index));
            }
        }

        return result;

    }
}
