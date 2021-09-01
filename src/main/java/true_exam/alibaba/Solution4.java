package true_exam.alibaba;
//实现HashMap
class MyHashMap {
    private Object[] buffer = new Object[10000];
    public Object get(Object key) {
        int index = key2index(key);
        return buffer[index];
    }
    public void put(Object key,Object value) {
        int index=key2index(key);
        buffer[index]=value;
    }
    private int key2index(Object key) {
        return (Integer)key % 10000;
    }
}
public class Solution4 {
    public static void main(String[] args) {
        MyHashMap sol = new MyHashMap();
        sol.put(1, "Tom");
        sol.put(2, "Jerrry");
        System.out.println((String)sol.get(1));
        System.out.println((String)sol.get(2));
    }
}
