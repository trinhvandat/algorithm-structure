import java.util.Arrays;

public class RemoveDuplicateFromSortedArray2 {
    public static void main(String[] args) {
        System.out.println("Result: " + removeDuplicates(new int[] {1,1,1,2,2,3}));
        System.out.println("Result: " + removeDuplicates(new int[] {0,0,1,1,1,1,2,3,3}));
    }


    public static int removeDuplicates(int[] nums) {
        int outputIndex = 0;
        int currentValueIndex = 0;

        for (int i = 1; i < nums.length; i ++) {
            if (nums[outputIndex] != nums[i]) {
                currentValueIndex = 0;
                outputIndex ++;
                nums[outputIndex] = nums[i];
            } else if (currentValueIndex < 1) {
                outputIndex ++;
                nums[outputIndex] = nums[i];
                currentValueIndex ++;
            }
        }

        return outputIndex + 1;
    }
}
