class Solution {
  public int maxArea(int[] height) {
    if (height == null || height.length < 2)
      return 0;

    int i = 0;
    int j = height.length - 1;
    int max = 0;

    while (i < j) {
      int width = j - i;
      int minHeight = Math.min(height[i], height[j]);
      int area = width * minHeight;
      max = Math.max(max, area);

      if (height[i] < height[j]) {
        i++;
      } else {
        j--;
      }
    }
    return max;
  }
}

public class _11_Container_With_Most_Water {
  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    int res = sol.maxArea(arr);
    System.out.println(res);
  }
}
