/**
 * @author zhaoshuai@ucfgroup.com
 * @Title: PACKAGE_NAME
 * @Description:
 * @Company: ucfgroup.com
 * @Created on 2018/4/26 10:24
 * @Copyright: Copyright (c) 2018/4/26
 */

interface A {
    default void say(int a) {
        System.out.println("A");
    }

    default void run() {
        System.out.println("A.run");
    }
}
interface B extends A{
    default void say(String a) {
        System.out.println("B");
    }

    default void play() {
        System.out.println("B.play");
    }
}
interface C extends A,B{

}
class D implements C {
    public static void main(String[] args) {
        D d = new D();
        String a = "1";
        d.say(a); //B
    }
}
