class Solution {
    public String mergeAlternately(String word1, String word2) {
        // String result = "" + word1.charAt(0);
        // int p1 = 1;
        // int p2 = 0;

        // while (p1 < word1.length() && p2 < word2.length()) {
        // if (p1 < p2 || p1 == p2) {
        // result = result + word1.charAt(p1++);
        // } else if (p2 < p1) {
        // result = result + word2.charAt(p2++);
        // }
        // }

        // while (p1 < word1.length()) {
        // result = result + word1.charAt(p1++);
        // }

        // while (p2 < word2.length()) {
        // result = result + word2.charAt(p2++);
        // }

        // return result;

        String result = "";
        int l1 = word1.length();
        int l2 = word2.length();

        if (l1 == 0) {
            return word2;
        }
        if (l2 == 0) {
            return word1;
        }

        if (l1 < l2) {
            for (int i = 0; i < l1; i++) {
                result += word1.charAt(i);
                result += word2.charAt(i);
            }

            for (int i = l1; i < l2; i++) {
                result += word2.charAt(i);
            }

            return result;
        } else {
            for (int i = 0; i < l2; i++) {
                result += word1.charAt(i);
                result += word2.charAt(i);
            }

            for (int i = l2; i < l1; i++) {
                result += word1.charAt(i);
            }

            return result;
        }
    }

}

public class _1768_Merge_Strings_Alternately {

    public static void main(String[] args) {
        Solution sol = new Solution();
        String res = sol.mergeAlternately("abctyeui", "pqr");
        System.err.println(res);
    }
}