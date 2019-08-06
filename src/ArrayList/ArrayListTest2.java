package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *  去除集合中自定义对象的重复值（对象的成员变量都相同）
 *
 *
 *  contains()方法的底层依赖是equals方法
 *  而学生类中没有equals方法，默认使用其父亲的equlas方法
 *  而Object的equals方法默认比较的是地址值
 *  所以所有的元素都通过了比较，因为new出来的东西地址值都不同
 *
 *  按照我们自己的需求，比较成员变量的值，重写equlas方法即可
 *  自动生成
 */
public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        Student s1 = new Student("林青霞",27);
        Student s2 = new Student("林志玲",40);
        Student s3 = new Student("凤姐",35);
        Student s4 = new Student("芙蓉姐姐",18);
        Student s5 = new Student("如花姐姐",16);
        Student s6 = new Student("林青霞",27);
        Student s7 = new Student("林青霞",18);

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        arrayList.add(s5);
        arrayList.add(s6);
        arrayList.add(s7);


        //创建新集合
        ArrayList newArray = new ArrayList();

        Iterator it = arrayList.iterator();
        while(it.hasNext()){
           Student s = (Student) it.next();

            //判断
           if(!newArray.contains(s)){
               newArray.add(s);
           }
        }

        //遍历新集合
        for(int x = 0; x<newArray.size();x++){
            Student s = (Student) newArray.get(x);
            System.out.println(s.getName()+"---"+s.getAge());
        }


    }
}
