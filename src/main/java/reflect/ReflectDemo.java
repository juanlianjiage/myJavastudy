package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class字节码文件对象
        Class clazz = Class.forName("reflect.user");
//        Constructor[] con = clazz.getConstructors();
//        for (Constructor constructor : con) {
//            System.out.println(constructor);
//        }


//        //获取所有构造方法
//        Constructor[] cons1 = clazz.getDeclaredConstructors();
//        for (Constructor con : cons1) {
//            System.out.println(con);
//        }

//        Constructor con2 = clazz.getDeclaredConstructor();
//        System.out.println(con2);
//
//        Constructor con3 = clazz.getDeclaredConstructor(String.class);
//        System.out.println(con3);

        Constructor cons4 = clazz.getDeclaredConstructor(String.class, int.class);
        //System.out.println(cons4);
//        int modifiers = cons4.getModifiers();
//        System.out.println(modifiers);

//        Parameter[] ps = cons4.getParameters();
//        for (Parameter p : ps) {
//            System.out.println(p);
//        }
        cons4.setAccessible(true);
        user u1 = (user)cons4.newInstance("张三", 23);
        System.out.println(u1);
    }
}
