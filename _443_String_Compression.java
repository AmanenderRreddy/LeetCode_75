// This is for only finding the lenght 
// class Solution {
//   public int compress(char[] chars) {
//     char prev = chars[0];
//     boolean seenDuplicate = false;
//     int len = chars.length;
//     int count = 0;

//     if (len == 1) {
//       return 1;
//     }

//     for (int i = 0; i < len; i++) {
//       if (i == 0) {
//         count++;
//       }

//       if (prev == chars[i] && !seenDuplicate) {
//         count++;
//         seenDuplicate = true;
//       }

//       else if (prev != chars[i]) {
//         count++;
//         seenDuplicate = false;
//       }

//       else if (prev == chars[i] && seenDuplicate) {
//         continue;
//       }
//       prev = chars[i];
//     }
//     return count;
//   }
// }

class Solution {
  public int compress(char[] chars) {

    int read = 0;
    int write = 0;
    int len = chars.length;

    if (len == 1) {
      return 1;
    }

    while (read < len) {
      char current = chars[read];
      int count = 0;

      while (read < len && chars[read] == current) {
        read++;
        count++;
      }

      chars[write] = current;
      write++;

      if (count > 1) {
        for (char c : String.valueOf(count).toCharArray()) {
          chars[write] = c;
          write++;
        }
      }
    }

    return write;
  }
}

public class _443_String_Compression {
  public static void main(String[] args) {
    Solution sol = new Solution();
    char[] arr = { 'a', 'a', 'b', 'b', 'b', 'b', 'b' };
    int res = sol.compress(arr);
    System.out.println(res);
  }
}