class Solution {
  public void moveZeroes(int[] nums) {

    int i = 0;
    int j = 0;
    for (i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[j] = nums[i];
        j++;
      }
    }
    while (j < nums.length) {
      nums[j] = 0;
      j++;
    }

    for (int k = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
  }
}

public class _283_Move_Zeroes {
  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] arr = { 0, 1, 0, 3, 12 };
    sol.moveZeroes(arr);

  }
}
