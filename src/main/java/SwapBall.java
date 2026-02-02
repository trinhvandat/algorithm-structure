import java.util.ArrayList;
import java.util.List;

public class SwapBall {

    public static void main(String[] args) {
        System.out.println("Result :" + solution("WRWRRWWRW"));
    }

    public static int solution(String s) {
        List<Integer> redBallIndex = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                redBallIndex.add(i);
            }
        }

        if (redBallIndex.size() <= 1) {
            return 0;
        }

        long MAX_COUNT = 1_000_000_000L;

        int midRedIndex = redBallIndex.size() / 2;
        int midRealIndex = redBallIndex.get(midRedIndex);
        int targetIndex = 0;
        long minCount = 0;

        for (int i = 0; i < redBallIndex.size(); i++) {
            targetIndex = midRealIndex - (midRedIndex - i);
            minCount += Math.abs(targetIndex - redBallIndex.get(i));
        }

        if (minCount > MAX_COUNT) {
            return -1;
        }

        return (int) minCount;
    }
}
