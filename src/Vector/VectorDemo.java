package Vector;

/*
*   Vector的特有功能：
*   1、添加功能
*       public void addElement(Object obj)-----之后被add替代
*   2、获取功能
*       public Object elementAt(int index)-----get替代
*       public Enumeration elements()------Iterator替代
*           boolean hasMoreElements()-----hasNext替代
*           Object nextElement()-----next替代
*
*   JDK升级的原因：
*       A、安全
*       B、效率
*       C、简化书写
* */

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();

        v.addElement("hellow");
        v.addElement("world");
        v.addElement("java");

        for(int x = 0; x < v.size();x++){
            String s = (String) v.elementAt(x);
            System.out.println(s);
        }

        System.out.println("-----------------");

        Enumeration en = v.elements();//返回的是实现类的对象
        while (en.hasMoreElements()){
            String s = (String) en.nextElement();
            System.out.println(s);
        }

    }
}
