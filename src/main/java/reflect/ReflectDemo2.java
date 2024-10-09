package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class clazz = Class.forName("reflect.user");
        Method[] methods = clazz.getMethods();

        //获取里卖弄所有的方法，包含父类的公共的方法
//        for (Method method : methods) {
//            System.out.println(method);
//        }
        //获取里面的所有方法，不包括父类的方法，包括私有的方法
//        Method[] methods1 = clazz.getDeclaredMethods();
//        for (Method method : methods1) {
//            System.out.println(method);
//        }

        Method method = clazz.getDeclaredMethod("speaking", String.class);
        System.out.println(method);
        int modifiers = method.getModifiers();
        System.out.println(modifiers);
        String methodName = method.getName();
        System.out.println(methodName);
        Parameter[] parameters = method.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }
        Class<?>[] exceptionTypes = method.getExceptionTypes();
        for (Class<?> exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }

        method.setAccessible(true);
        user user = new user("张三", 20);
        method.invoke(user,"中文");

    }

}
