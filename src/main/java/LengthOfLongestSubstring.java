import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println("Result: " + lengthOfLongestSubstring("abcabcbb"));
        System.out.println("Result: " + lengthOfLongestSubstring("ababccjjd"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right ++) {
            Character c = s.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c));
            }
            map.put(c, right + 1);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
