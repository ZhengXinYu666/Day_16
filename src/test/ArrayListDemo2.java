package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
*   键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
*
*   分析：
*       1、创建键盘录入数据对象
*       2、键盘录入多个数据，用集合存储
*       3、以0结束，键盘录入的0，就不继续录入数据了
*       4、把集合转成数组
*       5、对数组排序
*       6、获取该数组中的最大索引的值
*
* */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<Integer>();

        //以0结束，键盘录入的0，就不继续录入数据了
        while(true){
            System.out.println("请输入数据");
            int number = sc.nextInt();
            if(number != 0){
                array.add(number);
            }else{
                break;
            }
        }

        //集合转数组
        //public <T> T[] toArray(T[] a)
        Integer[] i = new Integer[array.size()];
        array.toArray(i);
        System.out.println(i);

        //对数组排序
        Arrays.sort(i);
        System.out.println("数组是："+arrayToString(i)+"最大值是："+i[i.length-1]);
    }

    public static String arrayToString(Integer[] i){
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for(int x =0; x<i.length;x++){
            if(x==i.length-1){
                sb.append(i[x]);
            }else{
                sb.append(i[x]).append(", ");
            }
        }

        sb.append("]");

        return sb.toString();
    }
}
