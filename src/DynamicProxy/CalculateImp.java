package DynamicProxy;

//被代理的类
public class CalculateImp implements Calculate{


    @Override
    public int add(int a, int b) {
        System.out.println("a+b");
        return a+b;
    }

    @Override
    public int minus(int a, int b) {
        System.out.println("a-b");
        return a-b;
    }

    @Override
    public int times(int a, int b) {
        System.out.println("a*b");
        return a*b;
    }

    @Override
    public int divide(int a, int b) {
        System.out.println("a/b");
        return a/b;
    }
}
