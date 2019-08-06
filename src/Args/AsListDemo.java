package Args;

import java.util.Arrays;
import java.util.List;

/*
*   public static<T> List<T> aslist(T...a)：把数组转成集合
* */
public class AsListDemo {
    public static void main(String[] args) {
        //定义一个数组
        //String[] strArray = {"hello","world","java"};

        List<String> list = Arrays.asList("hello","world","java");
        list.set(1,"javaee");

        for(String s:list){
            System.out.println(s);
        }
    }
}
