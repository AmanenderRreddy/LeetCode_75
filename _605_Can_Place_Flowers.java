class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        for (int i = 0; i < len; i++) {
            System.out.println(i + ">>");
            if (flowerbed[i] == 1) {
                i = i + 1;
            }

            else if (flowerbed[i] == 0
                    && (i == 0 || flowerbed[i - 1] != 1)
                    && (i == len - 1 || flowerbed[i + 1] != 1)) {

                flowerbed[i] = 1;
                n = n - 1;

                if (n == 0) {
                    return true;
                }
            }

            System.out.println(i + "^^");
        }

        if (n == 0) {
            return true;
        } else {
            return false;
        }
    }
}

public class _605_Can_Place_Flowers {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Boolean res = sol.canPlaceFlowers(new int[] { 1, 0, 0, 0, 0, 1 }, 3);
        System.out.println(res);
    }
}