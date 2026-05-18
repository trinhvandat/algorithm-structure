public class AddBinary {
    public static void main(String[] args) {
        test("11", "1", "100");
        test("1010", "1011", "10101");
    }

    public static void test(String a, String b, String expected) {
        var actual = addBinary(a, b);
        System.out.println("Result: " + (actual.equals(expected) ? "pass": "failed"));
    }

    public static String addBinary(String a, String b) {
        int la = a.length() - 1;
        int lb = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        int ri = 0;
        while (la >= 0 || lb >= 0 || carry != 0) {
            ri = carry;

            if (la >= 0) {
                ri += a.charAt(la) - '0';
                la --;
            }

            if (lb >= 0) {
                ri += b.charAt(lb) - '0';
                lb --;
            }

            result.append(ri % 2);
            carry = ri / 2;
        }
        return result.reverse().toString();
    }
}
