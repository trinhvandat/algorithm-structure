public class ClimbingStairs {
    public static void main(String[] args) {
        test(2, 2);
        test(3, 3);
    }

    public static void test(int n, int expectation) {
        var actual = climbStairs(n);
        System.out.println("Result " + ((actual == expectation) ? "pass" : "failed."));
    }

    public static int climbStairs(int n) {
        if (n <= 2) return n;
        int prev2 = 1;
        int prev1 = 2;

        for (int i = 3; i <= n; i ++) {
            int curr = prev2 + prev1;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
