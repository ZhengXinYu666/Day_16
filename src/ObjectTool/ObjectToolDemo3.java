package ObjectTool;

public class ObjectToolDemo3 {
    public static void main(String[] args) {
//        ObjectTool<String > ot = new ObjectTool<String>();
//        ot.show("hello");
//        ObjectTool<Integer > ot1 = new ObjectTool<Integer>();
//        ot1.show(100);
//        ObjectTool<Boolean > ot2 = new ObjectTool<Boolean>();
//        ot2.show(true);

        //如果类上没有泛型的话，方法还能不能接受任意类型的参数呢？
        //定义泛型方法后
        ObjectTool ot = new ObjectTool();
        ot.show("hello");
        ot.show(100);
        ot.show(true);
    }
}
