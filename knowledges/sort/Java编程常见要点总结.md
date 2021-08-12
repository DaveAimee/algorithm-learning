#### 使用java处理输入和输出
```java
Scanner sc = new Scanner(System.in); 
System.out.println("请输入你的姓名："); 
String name = sc.nextLine(); 
System.out.println("请输入你的年龄："); 
int age = sc.nextInt(); 
System.out.println("请输入你的工资："); 
float salary = sc.nextFloat(); 
System.out.println("你的信息如下："); 
System.out.println("姓名："+name+"\n"+"年龄："+age+"\n"+"工资："+salary); 
sc.close();
```
#### 整数的运算中处理溢出

```java
//Method1
try {
    int result = Math.multiplyExact(x,y);
    result = Math.decrementExact(x,y);
    result = Math.addExact(x,y);
}
catch(ArithmeticException e) {
      //if you get here, it is too big
}
//Method2
long test = (long)a*(long)a;
if (test > Integer.MAX_VALUE || test < Integer.MIN_VALUE)
    // Overflow!
```

#### 自定义HashSet对象需要手工实现HashCode和Equals方法

```java
class Pair{
    public int x,y;
    Pair (int x,int y) {
       this.x = x;
       this.y = y;
    }
    @Override 
    public boolean equals(Object st) { 
        Pair temppair= (Pair) st; 
        if (this.x==temppair.x && this.y==temppair.y) return true; 
        else return false; 
    }
    @Override
    public int hashCode() {
        int result = 17;
        result += 31 * ((Integer)this.x).hashCode();
        result += 31 * ((Integer)this.y).hashCode();
        return result;
    }
}
```

#### 使用Arrays.sort排序多维数组或自定义对象

```java
Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] point1, int[] point2) {
                if (point1[1] > point2[1]) {
                    return 1;
                } else if (point1[1] < point2[1]) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
```



