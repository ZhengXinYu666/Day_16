package For;

import java.util.ArrayList;

/*
* JDK5新特性
    自动拆装箱、泛型、增强for、静态导入、可变参数、枚举
*
*  增强for：是for循环的一种
*
* 格式：
*       for（元素数据类型 变量: 数组或者Collection集合）{
*       使用变量即可，该变量就是元素
*       }
*
* 好处：简化了数组和集合的遍历
*
*
* 弊端：增强for的目标不能为null
* 如何解决呢？
*   对增强for的目标先判断不为空，再使用增强for
*
*
* 增强for其实是用来替代迭代器的
*
*
*
* */
public class ForDemo {
    public static void main(String[] args) {
        //定义一个int数组
        int[] arr = {1,2,3,4,5};
        for(int x = 0; x < arr.length; x++){
            System.out.println(arr[x]);
        }

        System.out.println("--------------");


        for (int x:arr){
            System.out.println(x);
        }
        System.out.println("--------------");


        String[] str = {"李白","韩信","花木兰"};
        for(String s:str){
            System.out.println(s);
        }
        System.out.println("--------------");

        //定义一个集合
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");

        for(String s:array){
            if("world".equals(s)){
                array.add("javaee");
            }
            System.out.println(array);
        }
        //报错：并发修改异常
        System.out.println("--------------");







    }
}
