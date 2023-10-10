package hard.mobile_robot;

import hard.mobile_robot.Solution;

public class Main {
    public static void main(String[] args) {
        int [] nums = {-2, 0, 2};
        int d = 3;
        String s = "RLL";
        Solution solution = new Solution();
        System.out.println(solution.sumDistance(nums,s,d));
    }
}
