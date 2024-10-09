package reflect;

import java.io.IOException;

public class user {
   public String name;
    private int age;

    public user(String name) {
        this.name = name;
    }

    public user(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private user() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sleep()
    {
        System.out.println("休息");
    }
    private void speaking(String what) throws IOException
    {
        System.out.println("他在说"+what);
    }
    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
