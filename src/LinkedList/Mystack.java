package LinkedList;

import java.util.LinkedList;

/*
*   自定义的栈集合
*
*   @aythor 郑黑脸
*   @version V1.0
*
*/
public class Mystack {
    private LinkedList link;

    public Mystack(){
        link = new LinkedList();
    }

    public void add(Object obj){
        link.addFirst(obj);
    }

    public Object get(){
        return link.removeFirst();
    }
    public boolean isEmpty(){
        return link.isEmpty();
    }
}
