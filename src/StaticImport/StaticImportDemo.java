package StaticImport;
/*
*   静态导入：
*       格式:import static 包名.类名.方法名
*
* */
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.max;

public class StaticImportDemo {
    public static void main(String[] args) {
        System.out.println(abs(-100));
        System.out.println(pow(2,3));
        System.out.println(max(20,30));
    }
}
