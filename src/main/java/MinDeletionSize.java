public class MinDeletionSize {
    public static void main(String[] args) {
        System.out.println("Result: " + minDeletionSize(new String[]{"cba","daf","ghi"}));
        System.out.println("Result: " + minDeletionSize(new String[]{"a","b"}));
        System.out.println("Result: " + minDeletionSize(new String[]{"zyx","wvu","tsr"}));
    }

    private static int minDeletionSize(String[] strs) {
        if (strs == null || strs.length == 0 || strs.length == 1) {
            return 0;
        }

        int totalDeletion = 0;
        int currentIndex = 0;
        int weight = 0;
        boolean hasNext = true;

        int strIndex = 0;

        while (hasNext) {
            while (strIndex < strs.length) {

                if (currentIndex >= strs[strIndex].length()) {
                    hasNext = false;
                    break;
                }

                if (weight <= strs[strIndex].charAt(currentIndex)) {
                    weight = strs[strIndex].charAt(currentIndex);
                } else {
                    totalDeletion ++;
                    break;
                }
                strIndex ++;
            }

            currentIndex ++;
            weight = 0;
            strIndex = 0;
        }

        return totalDeletion;
    }
}
