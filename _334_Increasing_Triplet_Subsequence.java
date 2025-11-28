import java.util.List;

class Solution {
  public boolean increasingTriplet(int[] nums) {
    int smallest = nums[0];
    int second = Integer.MAX_VALUE;
    boolean re = false;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < smallest) {
        smallest = nums[i];
      } else if (nums[i] > smallest && nums[i] < second) {
        second = nums[i];
      } else  {
        return true;
      }

    }
    return re;
  }
}

public class _334_Increasing_Triplet_Subsequence {
  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] arr = { 1, 2, 3, 4, 5 };
    boolean res = sol.increasingTriplet(arr);
    System.out.println(res);
  }
}
