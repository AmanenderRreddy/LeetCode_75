import java.util.ArrayList;

class Solution {
    private ArrayList<String> divisors;
    private String GCD;

    private void divisors(String str, ArrayList<String> buffer, ArrayList<String> buf) {
        if (str.isEmpty()) {
            buf.addAll(buffer);
            return;
        }
        int n = str.length();
        for (int i = 0; i < n; i++) {
            String consider = str.substring(0, i + 1);
            buffer.add(consider);
            String remaining = str.substring(i + 1, n);
            divisors(remaining, buffer, buf);
            buffer.remove(buffer.size() - 1);
        }
    }

    private void solve(String str, ArrayList<String> buffer) {
        if (str.isEmpty()) {
            for (String div : divisors) {
                ArrayList<String> temp = new ArrayList<>(buffer);
                while (!temp.isEmpty() && temp.contains(div))
                    temp.remove(div);
                if (temp.isEmpty()) {
                    GCD = div;
                    return;
                }
            }
            return;
        }
        int n = str.length();
        for (int i = 0; i < n; i++) {
            String consider = str.substring(0, i + 1);
            buffer.add(consider);
            String remaining = str.substring(i + 1, n);
            solve(remaining, buffer);
            buffer.remove(buffer.size() - 1);
        }
    }

    public String gcdOfStrings(String str1, String str2) {
        GCD = new String();
        divisors = new ArrayList<>();
        divisors(str2, new ArrayList<>(), divisors);
        solve(str1, new ArrayList<>());
        return GCD;
    }
}

public class _1071_Greatest_Common_Divisor_of_Strings {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String res = sol.gcdOfStrings("ABABAB", "AB");
        System.out.println(res);
    }
}
