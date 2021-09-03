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
//排序数组：points=new int [][] {{1,2},{3,4}};
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
//排序自定义类
class Dog {
public int age;
public String name;
public Dog(int age, String name) {
    super();
    this.age = age;
    this.name = name;
}
//Comparator用法
Comparator<Integer> comp = new Comparator<Integer> () {
    @Override
    public int compare(Integer x, Integer y) {
        if(colorNums[colors[x]] < colorNums[colors[x]]) {
            return -1;
        }
        else if(colorNums[colors[x]] == colorNums[colors[x]]){
            return 0;
        }
        else {
            return 1;
        }
    }
};
```

#### 栈的声明和使用

```java
数组：Arrays.sort()
集合：Collections.sort();sort只能对单列集合使用，所以如果想对map进行排序，将Entry作为集合放入到list即可。
队列：LinkedList queue = new LinkedList();为了便于记忆，不使用接口类型进行声明，入队方法offer()，出队方法poll()
栈：LinkedList stack = new LinkedList();添加元素push()，删除元素pop();作为队列和栈使用时peek()方法都可以查看队头或栈顶元素
最小/最大堆：PriorityQueue queue = new PriorityQueue();队头元素始终是最大/最小值，由比较器进行初始化决定规则
循环中删除集合元素：
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
String item = iterator.next();
if (isRemovable()) {
iterator.remove();
}
}

```



