package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {

    //真正要代理的对象
    private Object subject;

    public JDKProxy(Object subject) {
        this.subject = subject;
    }


    //通过内部类的方式 返回给主类一个代理 也可以直接实现接口 在主方法中生成handler 来手动new一个proxy
    public Object getProxy() {
        Object proxy = null;
        //被代理的类由哪个加载器加载
        ClassLoader loader = subject.getClass().getClassLoader();
        //代理对象的类型
        Class[] interfaces = new Class[]{Calculate.class};
        //具体对于原本方法的加强
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("代理方法增强");
                Object result=method.invoke(subject,args);
                return result;
            }
        };

        proxy=Proxy.newProxyInstance(loader,interfaces,handler);
        return proxy;

    }

    /**
     * @Description: proxy被代理的对象 method需要调用的方法 args方法调用时的参数
     * @Param: [proxy, method, args]
     * @return: java.lang.Object
     * @Author: whn
     * @Date: 2020/4/22
     */


    public static void main(String args[]) {
        Calculate calculate=new CalculateImp();
        Calculate proxy= (Calculate) new JDKProxy(calculate).getProxy();
        proxy.add(3,4);

    }
}
