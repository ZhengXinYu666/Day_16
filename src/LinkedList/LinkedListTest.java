package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *  需求：
 *      用LinkedList模拟栈数据结构的集合
 *  分析：
 *      想到addFirst()这个特有功能
 *      栈：先进后出
 *
 *      自己定义一个集合类，在集合类内部可以使用LinkedList模拟
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();

        link.addFirst("hello");
        link.addFirst("world");
        link.addFirst("java");

        Iterator it = link.iterator();
        while(it.hasNext()){
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
