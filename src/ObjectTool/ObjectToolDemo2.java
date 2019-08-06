package ObjectTool;
public class ObjectToolDemo2 {
    public static void main(String[] args) {
//        ObjecTool ot = new ObjecTool();
//
//        ot.setObj(new String ("郑黑脸"));
//        String s = (String) ot.getObj();
//        System.out.println("姓名是："+s);
//
//        ot.setObj(new Integer(22));
//        Integer i = (Integer) ot.getObj();
//        System.out.println("年龄是："+i);

//        ot.setObj(new String("林青霞"));
//        Integer ii = (Integer) ot.getObj();
//        System.out.println("姓名是："+ii);
        ObjecTool<String> ot = new ObjecTool<String>();
        ot.setObj(new String("郑黑脸"));
        String s = ot.getObj();
        System.out.println(s);

    }
}
