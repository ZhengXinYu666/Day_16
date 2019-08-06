package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


/*
*   如果遇到ClassCastException，注意千万要搞清楚类型
*
* */
public class ArrayListDemo2 {
    public static void main(String[] args) {

        //创建集合对象
        //JDK7新特性：泛型推断
        //但是不建议，因为大部分公司都不会这样写代码，尽量写清楚
        ArrayList<Student> arrayList = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("韩信",30);
        Student s2 = new Student("李白",29);
        Student s3 = new Student("孙悟空",5000);
        Student s4 = new Student("百里玄策",21);

        //添加元素
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);


        //创建构造器对象
        Iterator<Student> it = arrayList.iterator();
        while (it.hasNext()){
            Student s =  it.next();
            System.out.println(s.getName()+"---"+s.getAge());
        }

    }
}
