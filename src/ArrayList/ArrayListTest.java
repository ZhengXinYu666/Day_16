package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 *  去除集合中字符串的重复值（字符串内容相同）
 *
 *  分析：
 *      1、创建集合对象
 *      2、添加多个字符串元素（包含重复的）
 *      3、创建新集合
 *      4、遍历旧集合，获取得到每一个元素
 *      5、拿这个元素到新集合去找，看有无
 *          有：不管
 *          没有：添加到新集合
 *      6、遍历新集合
 */
public class ArrayListTest {
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

        ArrayList arrayList1 = new ArrayList();


        Iterator it = arrayList.iterator();
        while(it.hasNext()){
            String s = (String) it.next();

            //判断
            if(! arrayList1.contains(s)){
                arrayList1.add(s);
            }
        }

        //遍历新集合
        for(int x = 0; x<arrayList1.size();x++){
            String s = (String) arrayList1.get(x);
            System.out.println(s);
        }
    }
}
