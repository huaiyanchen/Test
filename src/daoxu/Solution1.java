package daoxu;

/**
 *
 */
class Solution1 {
    public int reverse(int x) {
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x = x / 10;
        }
        return (int)n;
    }

}
