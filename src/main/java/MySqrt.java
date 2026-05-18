public class MySqrt {
    public static void main(String[] args) {
        test(4, 2);
        test(8, 2);
    }

    public static void test(int x, int expected) {
        var actual = mySqrt(x);
        System.out.println("Result: " + ((actual == expected) ? "pass" : "false"));
    }

    /**
     * Binary search
     * @param x
     * @return
     */
    public static int mySqrt(int x) {
        if (x == 0) return 0;

        long left = 1;
        long right = x;

        long mid = 0;
        int result = 0;
        while (left <= right) {
            mid = (right + left) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid > x) {
                right = mid - 1;
            } else {
                result = (int) mid;
                left = mid + 1;
            }
        }
        return result;
    }
}
