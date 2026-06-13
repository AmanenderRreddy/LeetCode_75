class Solution {
  public String reverseWords(String s) {
    int len = s.length();

    int i = len - 1;
    int j = i;
    String new_res = "";

    while (i >= 0) {

      while (i >= 0 && s.charAt(i) == ' ') {
        i--;
      }
      j = i;

      while (i >= 0 && s.charAt(i) != ' ') {
        i--;
      }

      new_res = new_res + s.substring(i + 1, j + 1);

      while (i >= 0 && s.charAt(i) == ' ') {
        i--;
      }

      if (i >= 0) {
        new_res = new_res + " ";
      }

      j = i;
    }

    return new_res;
  }
}

public class _151_Reverse_Words_in_a_String {
  public static void main(String[] args) {
    Solution sol = new Solution();
    String str = sol.reverseWords("   a good   example   ");
    System.out.println(str);
  }
}
