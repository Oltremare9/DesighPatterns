package DynamicProxy;

//需要被实现的接口
public interface Calculate {
    int add(int a,int b);
    int minus(int a,int b);
    int times(int a,int b);
    int divide(int a,int b);
}
