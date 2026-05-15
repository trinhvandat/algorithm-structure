public class FirstOccurrenceStringIndex {
    public static void main(String[] args) {
        test("mississippi", "issip", 4);
        test("sadbutsad", "sad", 0);
        test("leetcode", "leeto", -1);
    }

    public static int strStr(String haystack, String needle) {
        int hl = haystack.length();
        int nl = needle.length();

        if (hl < nl) {
            return -1;
        }

        for (int i = 0; i <= hl - nl; i ++) {
            if (haystack.substring(i, i + nl).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void test(String haystack, String needle, int expectedOutput) {
        var actualResult = strStr(haystack, needle);
        System.out.println("Result: " + ((expectedOutput == actualResult) ? "pass" : "failed"));
    }
}
