package Args;
/*
*   写一个求和的功能，不直到求几个数据，调用的时候才知道
*
*   为了解决这个问题，java提供了一个东西：可变参数
*
*   可变参数：
*       格式：
*   public static int XXX(数据类型...变量名)
*
* */
public class ArgsDemo {
    public static void main(String[] args) {
        int result = sum(20,30,40,60);
        System.out.println(result);

    }
    public static int sum(int... a){
        int s = 0;

        for(int x:a){
            s += x;
        }
        return s;
    }
}