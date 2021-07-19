package chapter7_string.excercise;

import java.util.LinkedList;
import java.util.List;
//leetcode93: https://leetcode-cn.com/problems/restore-ip-addresses/
public class RestoreIpAddress {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new LinkedList<>();
        dfsSearch(res, "", 4, s);
        return res;
    }
    private void dfsSearch(List<String> result, String curIP, int numSections, String s) {
        if(numSections == 0 && s.length() > 0) {
            return;
        }
        if(numSections == 0 && s.equals("")) {
            result.add(curIP.substring(0,curIP.length() -1));
        }
        if(s.length() >= 1) {
            int value = Integer.valueOf(s.substring(0,1));
            dfsSearch(result, curIP + s.substring(0,1) + ".", numSections - 1, s.substring(1));
        }
        if(s.length() >= 2) {
            int value = Integer.valueOf(s.substring(0,2));
            if (value > 255 || s.substring(0,2).startsWith("0")) {
                return;
            }
            dfsSearch(result, curIP + s.substring(0,2) + ".", numSections - 1, s.substring(2));
        }
        if(s.length() >=3) {
            //剪枝，不可能大于255.
            int value = Integer.valueOf(s.substring(0,3));
            if (value > 255 || s.substring(0,3).startsWith("0")) {
                return;
            }
            dfsSearch(result, curIP + s.substring(0,3) + ".", numSections - 1, s.substring(3));
        }
    }
}
