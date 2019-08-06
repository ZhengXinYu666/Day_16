package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 需求：ArrayList去除集合中字符串的重复值
 * 要求：不能创建新的集合，在以前的集合上面做
 *
 */
public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        arrayList.add("world");
        arrayList.add("java");
        arrayList.add("world");
        arrayList.add("java");
        arrayList.add("java");
        arrayList.add("java");
        arrayList.add("java");

        //由选择排序思想引入
        //拿0索引的一次和后面的比较，有就把后面的干掉
        //同理，索引值增加
        for(int x= 0; x<arrayList.size();x++){
            for(int y = x+1;y<arrayList.size();y++){
                if(arrayList.get(x).equals(arrayList.get(y))){
                    arrayList.remove(y);
                    y--;
                }
            }
        }

        //遍历集合
        Iterator it = arrayList.iterator();

        while(it.hasNext()){
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
