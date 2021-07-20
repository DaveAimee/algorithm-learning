package chapter7_string.excercise;

import java.util.Arrays;
//leetcode43: https://leetcode-cn.com/problems/multiply-strings/
public class StringMultiple {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        //最终结果长度不会大于两个数之和
        int len1 = num1.length();
        int len2 = num2.length();
        int[] resultArray = new int [len1 + len2];
        Arrays.fill(resultArray, 0);

        for(int i = len1-1;i>=0;i--) {
            for(int j = len2-1;j>=0;j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int indexTen = i+j;
                int indexOne = i+j+1;
                int sum = mul + resultArray[indexOne];
                resultArray[indexOne] = sum%10;
                resultArray[indexTen] += sum/10;
            }
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<resultArray.length;i++) {
            if(resultArray[i]==0 && i==0) {
                continue;
            }
            str.append(String.valueOf(resultArray[i]));
        }
        return str.toString();
    }

}
