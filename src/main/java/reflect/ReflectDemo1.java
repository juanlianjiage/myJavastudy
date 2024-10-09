package reflect;

import java.lang.reflect.Field;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class clazz = Class.forName("reflect.user");

        //获取成员变量对象
//        Field[] fields = clazz.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }

//        Field[] fields1 = clazz.getDeclaredFields();
//        for (Field field : fields1) {
//            System.out.println(field);
//        }
        Field age = clazz.getDeclaredField("age");
        System.out.println(age);
        int modifiers = age.getModifiers();
        System.out.println(modifiers);
        String name = age.getName();
        System.out.println(name);
        Class<?> type = age.getType();
        System.out.println(type);

        user user = new user("张三", 2);
        age.setAccessible(true);

        int age1 = (int)age.get(user);
        System.out.println(age1);
        age.set(user,30);
        System.out.println(age1);
        System.out.println(user);
    }
}
