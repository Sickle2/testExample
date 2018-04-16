import java.util.ArrayList;

/**
 * @author zhaoshuai@ucfgroup.com
 * @Title: PACKAGE_NAME
 * @Description:
 * @Company: ucfgroup.com
 * @Created on 2018/4/16 15:26
 * @Copyright: Copyright (c) 2018/4/16
 */
public class Stack<E> {
    private ArrayList<E> array = new ArrayList<E>();

    public void put(E e){
        array.add(e);
    }

    public E pop(){
        if (array.size() > 0){
            E temp = array.get(array.size() - 1 );
            array.remove(array.size() - 1);
            return temp;
        }else {
            throw new RuntimeException("xxxx");
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stark = new Stack<Integer>();
        stark.put(1);
        stark.put(2);
        stark.put(3);
        System.out.println(stark.pop());
        System.out.println(stark.pop());
        System.out.println(stark.pop());
    }
}
