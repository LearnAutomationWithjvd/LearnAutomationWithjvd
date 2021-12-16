import java.util.Scanner;

public class ReachEnd {

    public static void main(String[] args) {

        int[] arr = {1,1,1,14};
        System.out.println( solve(arr));

    }

    public static boolean solve(int[] arr) {
        boolean[] dp = new boolean[arr.length];
        dp[0] = true;
        for (int currPos = 0; currPos < arr.length; currPos++) {
            if (dp [currPos] && arr [currPos] > 0) {
                int maxJumps = arr[currPos];
                for (int jump = 1; jump <= maxJumps; jump++) {
                    if(currPos + jump < dp.length)
                    {
                        dp[currPos+jump] =  true;
                    }
                }
            }
        }
        return dp [arr.length-1];
    }

}
 