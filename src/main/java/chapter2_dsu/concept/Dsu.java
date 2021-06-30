package chapter2_dsu.concept;
//参考自https://www.jianshu.com/p/8c74df1db116

public class Dsu {
    private boolean isPathCompressEnabled = true;
    private int[] uset = null;
    private int setNums = -1;
    /**
     * 创建新的并查集,size为并查集的大小
     * @param size
     */
    public void makeset(int size) {
        this.uset = new int[size];
        for(int i = 0 ;i < size; i++) {
            this.uset[i] = i;
        }
        this.setNums = this.uset.length;
    }
    
    /**
     * 将元素x和y所在的集合合并
     * @param x
     * @param y
     * @return
     */
    public void unionSet(int x, int y) {
        //若两个元素的根元素相同，则两个元素在一个
        if(find(x) == find(y)) {
            return;
        }
        uset[find(x)] = find(y);
        this.setNums = this.setNums - 1;
    }
    /**
     * 寻找x所在集合的根元素
     * @param x
     * @return
     */
    public int find (int x) {
        if(this.uset[x] != x) {
            if(isPathCompressEnabled) {
                uset[x] = find(uset[x]);
            }
            return find(this.uset[x]);
        }
        else {
            return x;
        }
    }
    
    public int getSetNums() {
        return this.setNums;
    }
    public static void main(String[] args) {
        Dsu d = new Dsu();
        d.makeset(10);
        d.unionSet(0, 1);
        d.unionSet(2, 3);
        d.unionSet(4, 5);
        d.unionSet(1, 4);
        assert d.find(1) == d.find(4);
    }
}