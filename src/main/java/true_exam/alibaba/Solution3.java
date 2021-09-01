package true_exam.alibaba;

class Runner implements Runnable {
    private String threadName;
    private Thread t;

    Runner(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 1; i < 101; i++) {
            System.out.println(threadName + "-" + Integer.toString(i));
        }
    }

    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

class Solution3 {
    public static void main(String[] args) {
        Runner r1 = new Runner("线程1");
        Runner r2 = new Runner("线程2");
        r1.start();
        r2.start();
    }
}