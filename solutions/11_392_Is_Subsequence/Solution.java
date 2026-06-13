class Solution {
  public boolean isSubsequence(String s, String t) {
    boolean res = false;
    char[] arr = s.toCharArray();
    int indexval = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      int val = t.indexOf(arr[i]);
      if (val != -1) {
        if (indexval < val) {
          indexval = val;
          res = true;
        } else {
          return false;
        }
      } else {
        return false;
      }
    }
    return res;
  }
}

public class _392_Is_Subsequence {
  public static void main(String[] args) {
    Solution sol = new Solution();
    boolean res = sol.isSubsequence("zbc", "ahbgdc");
    System.out.println(res);
  }
}
