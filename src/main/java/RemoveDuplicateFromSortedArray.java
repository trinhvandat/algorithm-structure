import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
//        System.out.println("Result: " + removeDuplicates(new int[] {1,1,2}));
        System.out.println("Result: " + removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
    }

    public static int removeDuplicates(int[] nums) {
        int outputIndex = 0;

        for (int i = 1; i < nums.length; i ++) {
            if (nums[outputIndex] != nums[i]) {
                outputIndex ++;
                nums[outputIndex] = nums[i];
            }
        }
        return outputIndex + 1;
    }
}
