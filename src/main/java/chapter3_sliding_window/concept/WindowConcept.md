### 滑动窗口法
#### 定义
滑动窗口法，也叫尺取法（可能也不一定相等，大概就是这样），可以用来解决一些查找满足一定条件的连续区间的性质（长度等）的问题。由于区间连续，因此当区间发生变化时，可以通过旧有的计算结果对搜索空间进行剪枝，这样便减少了重复计算，降低了时间复杂度。往往类似于“请找到满足xx的最x的区间（子串、子数组）的xx”这类问题都可以使用该方法进行解决。

#### 滑动窗口范式

```pseudocode
//let nums[0..n] be array
i = 0
sum = 0//or other contition
for j=0 to j=n
    sum +=nums[j]
    while(condition) {
        //some operations
        sum-=nums[i]
        i++
    }
return some expression
```

