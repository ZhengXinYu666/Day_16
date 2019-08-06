package For;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student("李白", 27);
        Student s2 = new Student("韩信", 25);
        Student s3 = new Student("花木兰", 18);
        Student s4 = new Student("公孙离", 16);

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        Iterator<Student> it = array.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+"---"+s.getAge());
        }

        System.out.println("-----------------");


        for(int x = 0; x < array.size();x++){
            Student s = array.get(x);
            System.out.println(s.getName()+"---"+s.getAge());
        }


        System.out.println("-----------------");

        for(Student s:array){
            System.out.println(s.getName()+"---"+s.getAge());
        }

    }
}
