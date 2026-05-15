public class SearchIndexPosition {
    public static void main(String[] args) {
        System.out.println("stat");
        test(new int[] {1, 3, 5, 6}, 5, 2);
        test(new int[] {1, 3, 5, 6}, 2, 1);
        test(new int[] {1, 3, 5, 6}, 7, 4);
    }

    public static void test(int[] nums, int target, int expected) {
        var actual = searchIndex(nums, target);
        System.out.println("Result: " + ((actual == expected) ? "pass" : "failed"));
    }

    public static int searchIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
