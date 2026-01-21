import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        System.out.println("Result: " + Arrays.toString(merge(
                new int[]{1, 2, 3, 0, 0, 0},
                3,
                new int[]{2, 5, 6},
                3
        )));

        System.out.println("Result: " + Arrays.toString(merge(
                new int[]{1},
                1,
                new int[]{},
                0
        )));

        System.out.println("Result: " + Arrays.toString(merge(
                new int[]{0},
                0,
                new int[]{1},
                1
        )));
    }

    private static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        if (n == 0) {
            return nums1;
        }

        int outputLength = nums1.length;
        int num2Index = 0;

        for (int index = m; index < outputLength; index++) {
            nums1[index] = nums2[num2Index];
            num2Index++;
        }

        Arrays.sort(nums1);

        return nums1;
    }
}
