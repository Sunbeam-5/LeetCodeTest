package medium.integer_inversion;

/*class Solution {
    public int reverse(int x) {
        if (x < -Math.pow(2, 31) || x > Math.pow(2, 31) - 1) {
            return 0;
        }
        if (x == 0)
            return 0;

        String str1 = String.valueOf(x);
        String str2 = "";
        if (str1.charAt(0) == '-') {
            str2 = str1.substring(1,str1.length());
            StringBuffer stringBuffer = new StringBuffer(str2);
            return -Integer.parseInt(String.valueOf(stringBuffer.reverse()));
        }
        StringBuffer stringBuffer1 = new StringBuffer(str1);
        return Integer.valueOf(String.valueOf(stringBuffer1.reverse()));
    }
}*/


class Solution {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return reversed;
    }
}