/**
 * @author zhaoshuai@ucfgroup.com
 * @Title: PACKAGE_NAME
 * @Description:
 * @Company: ucfgroup.com
 * @Created on 2018/4/25 20:14
 * @Copyright: Copyright (c) 2018/4/25
 */
public class BestSingleton1 {
    //构造方法一定要设为private
    private BestSingleton1() {
    }
    private static final BestSingleton1 INSTANCE = new BestSingleton1();

    public static BestSingleton1 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println(BestSingleton1.getInstance()+"-----"+Thread.currentThread().getName());
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                System.out.println(BestSingleton1.getInstance()+"-----"+Thread.currentThread().getName());
            }
        });
        Thread t3 = new Thread(new Runnable() {
            public void run() {
                System.out.println(BestSingleton1.getInstance()+"-----"+Thread.currentThread().getName());
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
