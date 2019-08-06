package ObjectTool;
/*
*   泛型类：把泛型定义在类上
*
* */
public class ObjecTool<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
