package true_exam.alibaba;

//线程死锁
class DeadLock implements Runnable {
    private static Object obj1 = new Object();
    private static Object obj2 = new Object();
    private boolean flag;

    public DeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "running");
        if (flag) {
            synchronized (obj1) {
                System.out.println(Thread.currentThread().getName() + "have locked obj1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                synchronized (obj2) {
                    // 执行不到这里来
                    System.out.println("after 1 second" + Thread.currentThread().getName() + "locked obj2");
                }
            }
        } else {
            synchronized (obj2) {
                System.out.println(Thread.currentThread().getName() + "have locked obj2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                synchronized (obj1) {
                    // 执行不到这里
                    System.out.println("after 1 second" + Thread.currentThread().getName() + "locked obj1");
                }
            }
        }
    }
}

public class Solution5 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new DeadLock(true), "thread1");
        Thread t2 = new Thread(new DeadLock(false), "thread2");
        t1.start();
        t2.start();
    }
}
