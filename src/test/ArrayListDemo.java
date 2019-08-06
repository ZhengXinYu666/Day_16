package test;

import For.Student;

import java.util.ArrayList;

/*
*   集合的嵌套遍历
*       需求：
*           我们班有学生，每一个学生是一个对象，所以用一个集合表示我们班的学生A仍然有List<Student>
*       但是，我们旁边也有班级，每个班级也是一个ArrayList<Student>
*       而现在，我们有多个ArrayList<Student>需要用集合存储，怎么办呢？
*
*       ArrayList<ArrayList<>Student>
*  */
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建大集合
        ArrayList<ArrayList< Student >> bigArrayList = new ArrayList<ArrayList<Student>>();

        //创建第一个班级集合
        ArrayList<Student> firstArrayList = new ArrayList<Student>();
        //创建学生
        Student s1 = new Student("唐僧",30);
        Student s2 = new Student("孙悟空",29);
        Student s3 = new Student("猪八戒",28);
        Student s4 = new Student("沙僧",27);
        Student s5 = new Student("白龙马",26);
        //学生进班
        firstArrayList.add(s1);
        firstArrayList.add(s2);
        firstArrayList.add(s3);
        firstArrayList.add(s4);
        firstArrayList.add(s5);
        //把第一个班级存入学生系统中
        bigArrayList.add(firstArrayList);

        //创建第二个班级集合
        ArrayList<Student> secondArrayList = new ArrayList<Student>();
        //创建学生
        Student s11 = new Student("诸葛亮",30);
        Student s22 = new Student("司马懿",29);
        Student s33 = new Student("周瑜",28);
        //学生进班
        secondArrayList.add(s11);
        secondArrayList.add(s22);
        secondArrayList.add(s33);
        //把第二个班级存入学生系统中
        bigArrayList.add(secondArrayList);



        //创建第三个班级集合
        ArrayList<Student> thirdArrayList = new ArrayList<Student>();
        //创建学生
        Student s111 = new Student("宋江",40);
        Student s222 = new Student("无用",29);
        Student s333 = new Student("高俅",28);
        Student s444 = new Student("李师师",22);
        //学生进班
        thirdArrayList.add(s111);
        thirdArrayList.add(s222);
        thirdArrayList.add(s333);
        thirdArrayList.add(s444);
        //把第三个班级存入学生系统中
        bigArrayList.add(thirdArrayList);


        //遍历集合
        for(ArrayList<Student> array:bigArrayList){
            for(Student s:array){
                System.out.println(s.getName()+"---"+s.getAge());
            }
        }
    }
}
