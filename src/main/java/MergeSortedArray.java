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

        int nums1Index = m - 1;
        int nums2Index = n - 1;
        int outputIndex = m + n - 1;

        while (nums1Index >= 0 && nums2Index >= 0) {
            if (nums1[nums1Index] > nums2[nums2Index]) {
                nums1[outputIndex] = nums1[nums1Index];
                nums1Index --;
            } else {
                nums1[outputIndex] = nums2[nums2Index];
                nums2Index --;
            }
            outputIndex --;
        }

        while (nums2Index >= 0) {
            nums1[outputIndex] = nums2[nums2Index];
            nums2Index --;
            outputIndex --;
        }

        return nums1;
    }
}
