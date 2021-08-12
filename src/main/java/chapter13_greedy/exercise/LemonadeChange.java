package chapter13_greedy.exercise;
//leetcode860: https://leetcode-cn.com/problems/lemonade-change/
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int value:bills) {
            if(value == 5) {
                five++;
            }
            else if(value == 10) {
                five--;
                ten++;
                if(five<0) {
                    return false;
                }
            }
            else {
                if(five > 0 && ten > 0) {
                    five--;
                    ten--;
                }
                else {
                    five = five -3;
                }
                if(ten < 0 || five < 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
