package easy.minimize_and_divide;

import java.util.Arrays;

public class Solution {
    public int splitNum(int num) {
        int temp = num;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        int [] arr = new int[count];
        int i = 0;
        while (num != 0) {
            arr[i] = num % 10;
            i++;
            num = num / 10;
        }
        Arrays.sort(arr);
        int num1 = 0;
        int num2 = 0;
        for (int j = 0; j < count; j++) {
            if (j % 2 == 0) {
                num1 = num1 * 10 + arr[j];
            } else {
                num2 = num2 * 10 + arr[j];
            }
        }
        return num1 + num2;
    }
}
