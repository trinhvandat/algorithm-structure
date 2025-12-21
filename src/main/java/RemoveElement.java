public class RemoveElement {
    public static void main(String[] args) {
        System.out.println("Result: " + removeElement(new int[] {3,2,2,3}, 3));
        System.out.println("Result: " + removeElement(new int[] {0,1,2,2,3,0,4,2}, 2));
    }

    private static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int index = 0; index < nums.length; index ++) {
            if (nums[index] != val) {
                nums[k] = nums[index];
                k++;
            }
        }
        return k;
    }
}
