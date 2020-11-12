package daoxu;

/**
 * @author chy
 */
class Test1 {
    public static void main(String[] args) {
        int x = 1234;
        int y;
        Solution1 solution = new Solution1();
        y= solution.reverse(x);
        System.out.println(y);
  }

    static class Test2 {
        public static void main(String[] args) {
            int x = 1234;
            int y;
            Solution2 solution = new Solution2();
            y = solution.reverse(x);
            System.out.println(y);
        }

    }
}

