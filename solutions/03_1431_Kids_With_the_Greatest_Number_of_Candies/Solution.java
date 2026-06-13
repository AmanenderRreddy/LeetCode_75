import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int length = candies.length;

        for (int i = 0; i < length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        for (int i = 0; i < length; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}

public class _1431_Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<Boolean> res = sol.kidsWithCandies(new int[] { 2, 3, 5, 1, 3 }, 3);
        System.out.println(res);

    }

}
