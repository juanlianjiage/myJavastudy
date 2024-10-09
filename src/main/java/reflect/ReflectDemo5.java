package reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
* 创建代理
* */
public class ReflectDemo5 {

    /*形参：被代理的对象

    //返回值：创建的代理
    * */
    public static star createProxy(bigStar bigStar)
    {

        star star = (star) Proxy.newProxyInstance(
                ReflectDemo5.class.getClassLoader(),//指定类加载器，去加载生成的代理类
                new Class[]{reflect.star.class},//指定接口，这些接口用于指定生成的代理长什么样，有什么方法

                new InvocationHandler() {//用来指定生成的代理对象干什么事情
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //1.代理的对象
                        //2.要运行的方法
                        //3.传递方法的实参
                        if("sing".equals(method.getName()))
                        {
                            System.out.println("准备话筒，收钱");
                        }
                        //启用对象的方法


                        return method.invoke(bigStar,args);
                    }
                }
        );
        return star;
    }

    public static void main(String[] args) {
        star proxy = ReflectDemo5.createProxy(new bigStar("坤坤"));

        System.out.println(proxy.sing("王菲"));
    }
}
