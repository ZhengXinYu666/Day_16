package LinkedList;
/*
*   Mystack测试
*
* */
public class MyStackDemo {
    public static void main(String[] args) {
        Mystack ms = new Mystack();

        ms.add("hello");
        ms.add("world");
        ms.add("java");

        while (!ms.isEmpty()) {
            System.out.println(ms.get());
        }
    }
}

