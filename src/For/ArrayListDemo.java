package For;

import java.util.ArrayList;

/*
*   ArrayList存储字符串并遍历，要求加入泛型，并用增强for遍历
*   a、迭代器
*   b、普通for
*   c、增强for
* */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");

        //增强for
        for(String s:array){
            System.out.println(s);
        }
    }
}
