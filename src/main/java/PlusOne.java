public class PlusOne {
    public static void main(String[] args) {
        test(
                new int[] {1, 2, 3},
                new int[] {1, 2, 4}
        );

        test(
                new int[] {1, 2, 9},
                new int[] {1, 3, 0}
        );

        test(
                new int[] {9},
                new int[] {1, 0}
        );
    }

    public static void test(int[] digits, int[] expected){
        var actual = plusOne(digits);
        System.out.println("Result: " + ((compareArrays(actual, expected) ? "pass" : "failed")));
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0 ; i < arr1.length; i ++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] plusOne(int[] digits) {
        int remember = 0;
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }

        remember = 1;
        digits[digits.length - 1] = 0;
        for (int i = digits.length - 2; i >= 0; i--) {
            if (digits[i] == 9) {
                digits [i] = 0;
            } else {
                digits[i] = digits[i] + remember;
                remember = 0;
                break;
            }
        }
        if (remember == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 0; i < digits.length; i ++) {
                result[1 + i] = digits[i];
            }
            return result;
        } else {
            return digits;
        }
    }
}
