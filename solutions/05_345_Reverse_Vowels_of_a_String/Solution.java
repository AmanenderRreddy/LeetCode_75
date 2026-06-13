class Solution {
  public String reverseVowels(String s) {
    // a,e,i,o,u
    char arr[] = s.toCharArray();
    int p1 = 0;
    int p2 = s.length() - 1;
    String vowels = "aeiouAEIOU";
    while (p1 < p2) {

      while (p1 < p2 && vowels.indexOf(s.charAt(p1)) == -1) {
        p1++;
      }
      while (p1 < p2 && vowels.indexOf(s.charAt(p2)) == -1) {
        p2--;
      }

      char temp = arr[p1];
      arr[p1] = arr[p2];
      arr[p2] = temp;

      p1++;
      p2--;
    }
    return new String(arr);
  }
}

public class _345_Reverse_Vowels_of_a_String {
  public static void main(String[] args) {
    Solution sol = new Solution();
    String res = sol.reverseVowels("IceCreAm");
    System.out.println(res);
  }
}
