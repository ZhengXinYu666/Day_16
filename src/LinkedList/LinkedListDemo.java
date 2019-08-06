package LinkedList;

import java.util.LinkedList;

/*
*   LinkedList的特有功能：
*       A、添加
*           public void addFirst(Object obj)：可以先进后出
*           public void addLast(Object obj)
*       B、获取
*           public Object getFirst()
*           public Object getLst()
*       C、删除功能
*           public Object removeFirst()
*           public Object removeLast(0
* */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();

        //添加元素
        link.add("hello");
        link.add("world");
        link.add("java");

        link.addFirst("javaee");
        link.addLast("javaEE");

        System.out.println(link.getFirst());
        System.out.println(link.getLast());

        System.out.println(link.removeFirst());
        System.out.println(link.removeLast());
        System.out.println(link);
    }
}
