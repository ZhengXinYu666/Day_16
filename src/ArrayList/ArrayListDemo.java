package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*
*   ArrayList的使用
*
*   存储字符串并遍历
*
* */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("hellow");
        arrayList.add("world");
        arrayList.add("java");

        Iterator<String > it = arrayList.iterator();

        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }


        System.out.println("----------");

        for(int x = 0; x < arrayList.size(); x++){
            String s = arrayList.get(x);
            System.out.println(s);
        }
    }
}
