/**
 * @author zhaoshuai@ucfgroup.com
 * @Title: PACKAGE_NAME
 * @Description:
 * @Company: ucfgroup.com
 * @Created on 2018/4/25 20:09
 * @Copyright: Copyright (c) 2018/4/25
 */
public class BestSingleton {
    //构造方法一定要设为private
    private BestSingleton() {
    }

    private static class LazyLolder {
        private static final BestSingleton INSTANCE = new BestSingleton();
    }

    public static BestSingleton getInstance() {
        return LazyLolder.INSTANCE;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println(BestSingleton.getInstance()+"-----"+Thread.currentThread().getName());
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                System.out.println(BestSingleton.getInstance()+"-----"+Thread.currentThread().getName());
            }
        });
        Thread t3 = new Thread(new Runnable() {
            public void run() {
                System.out.println(BestSingleton.getInstance()+"-----"+Thread.currentThread().getName());
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
