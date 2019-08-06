package ObjectTool;
/**
 *
 *  早期的时候，我们使用Object代表任意的类型
 *  向上转型是没有任何问题的，但是在向下转型的时候其实隐含了类型转换的问题
 *  也就是说这样的程序是不安全的
 *  所以java在jdk5之后引入了泛型，提高程序安全性
 *
 */


public class ObjectToolDemo {
    public static void main(String[] args) {
        ObjecTool ot = new ObjecTool();
        //正常使用
        ot.setObj(new Integer(27));
        Integer i = (Integer) ot.getObj();
        System.out.println("年龄是："+i);

        ot.setObj(new String("林青霞"));
        String s = (String) ot.getObj();
        System.out.println("姓名是："+s);
    }
}
