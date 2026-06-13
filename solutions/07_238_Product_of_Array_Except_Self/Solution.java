class Solution {
  public int[] productExceptSelf(int[] nums) {
    int len = nums.length;
    int[] left = new int[len];
    int[] right = new int[len];

    left[0] = 1;
    right[len - 1] = 1;
    for (int i = 1; i < len; i++) {
      left[i] = left[i - 1] * nums[i - 1];
    }

    for (int i = len - 2; i >= 0; i--) {
      right[i] = right[i + 1] * nums[i + 1];
    }

    for (int i = 0; i < len; i++) {
      left[i] = left[i] * right[i];
    }

    return left;
  }
}

public class _238_Product_of_Array_Except_Self {
  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] res = sol.productExceptSelf(new int[] { 1, 2, 3, 4 });
    System.out.println(res);
  }

}
