package true_exam.micro_strategy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {
    // Complete the countDuplicates function below.
    static int countDuplicates(List<Integer> numbers) {
        //key: number value:出现次数
        Map<Integer, Integer> maps = new HashMap<Integer,Integer>();
        int count = 0;
        for(Integer num:numbers) {
            if(maps.containsKey(num)) {
                maps.put(num, maps.get(num)+1);
            }
            else {
                maps.put(num,1);
            }
        }
        for (Map.Entry<Integer,Integer> entry: maps.entrySet()) {
            if(entry.getValue() > 1) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        countDuplicates(Arrays.asList(1,3,1,4,5,6,3,2));
    }
}
