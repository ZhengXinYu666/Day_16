package Generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
*   ArrayList存储字符串并遍历
*
*   按照正常写法写程序，报错了
*   为什么呢？
*       因为开始存储的时候存储了String和Integer两种类型的数据
*       遍历的时候都当做String处理的，所以报错了
*   但是，在编译期间却没有告知。
*   回想数组：
*          String[] strArray = new String[3];
*          strArray[0] = "hello";
*           strArray[1] = "world";
*           strArray[2] = 10;
*   集合也模仿数组中的这种做法，在创建对象的时候明确元素的数据类型，这样就不会出问题了
*   这种技术叫做      泛型
*
*   泛型：是一种把类型明确的工作推迟到创建对象或者是调用方法的时候才去明确特殊的类型
*   参数化类型，把类型当做参数一样传递
*
*   格式：<数据类型>
*       此处的数据类型只能是引用类型
*
*   好处：
*       1、把运行时期的问题提前到了编译期间
*       2、避免了强制类型转换
*       3、优化了程序设计，解决了黄色警告线
*
*   泛型在那些地方使用呢？
*   看API，如果类，接口，抽象类后面跟有<E> 一般就要用泛型
*   一般来说就是在集合中使用
*
* */
public class GenericDemo {
    public static void main(String[] args) {
        //创建
        ArrayList<String> array = new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");
        //array.add(10);
        //jdk5之后自动装箱  等价于array.add(Integer.valueOf(10))

        Iterator<String> it = array.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
