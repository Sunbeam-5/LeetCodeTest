package medium.multiply_by_string;


import java.math.BigInteger;

public class Solution {
    public String multiply(String num1, String num2) {
        /*char[] arr1 = new char[200];
        char[] arr2 = new char[200];
        arr1 = num1.toCharArray();
        arr2 = num2.toCharArray();
        long a = 0;
        long b = 0;
        for (int i = 0; i < num1.length(); i++) {
            a = a * 10 + (long) (arr1[i] - '0');
        }
        for (int i = 0; i < num2.length(); i++) {
            b = b * 10 + (long) (arr2[i] - '0');
        }
        String arr3 = String.valueOf(a * b);
        return String.valueOf(arr3);*/


        BigInteger big1 = new BigInteger(num1);
        BigInteger big2 = new BigInteger(num2);
        BigInteger result = big1.multiply(big2);
        return String.valueOf(result);
    }
}

