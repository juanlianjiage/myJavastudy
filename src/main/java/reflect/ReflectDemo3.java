package reflect;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class ReflectDemo3 {
    public static void main(String[] args) throws IllegalAccessException, IOException {

        user user = new user("张三", 50);
        saveObject(user);
    }

    private static void saveObject(user user) throws IllegalAccessException, IOException {
        Class clazz = user.getClass();

        //创建IO流
        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            Object o = field.get(user);

            bw.write(name+"="+o);
            bw.newLine();
        }
        bw.close();
    }
}
