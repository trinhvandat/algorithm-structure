public class LengthOfLastWord {
    public static void main(String[] args) {
        test("Hello World", 5);
        test("   fly me   to   the moon   ", 4);
    }

    public static void test(String s, int expected) {
        var actual = lengthOfLastWord(s);
        System.out.println("Result: " + ((actual == expected) ? "pass" : "failed"));
    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (count == 0) {
                    continue;
                } else {
                    return count;
                }
            } else {
                count ++;
            }
        }

        return count;
    }
}
