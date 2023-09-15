package easy.gem_supply;

import java.util.Arrays;

class Solution {
    public int giveGem(int[] gem, int[][] operations) {
        int count = 0;
        for (int i = 0; i < gem.length; i++) {
            if (gem[i] == 0)
                count++;
        }
        if (count == gem.length)
            return 0;

        for (int i = 0; i < operations.length; i++) {
            int num1 = gem[operations[i][0]] / 2;
            int num2 = gem[operations[i][1]] + num1;
            gem[operations[i][0]] = gem[operations[i][0]] - num1;
            gem[operations[i][1]] = num2;
        }
        Arrays.sort(gem);
        return gem[gem.length - 1] - gem[0];
    }
}



/*class Solution {
    public int giveGem(int[] gem, int[][] operations) {
        for (int[] o: operations) {
            int x = o[0], y = o[1];
            gem[y] += gem[x] / 2;
            gem[x] -= gem[x] / 2;
        }
        return Arrays.stream(gem).max().getAsInt() - Arrays.stream(gem).min().getAsInt();
    }
}*/

/*
作者：星开祈灵
        链接：https://leetcode.cn/problems/WHnhjV/
        来源：力扣（LeetCode）
        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
