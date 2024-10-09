package shejimoshi.danlimoshi;

import java.util.*;

public class User {

//    //构造方法私有，防止被实例化
//    private User(){};
//
//    //构建内部类，创建user实例，
//    //jvm内部机制，在一个类加载过程的时候是线程互斥的，第一次调用getInstance，jvm会确保实例被创建一次
//    private static class UserCreate{
//        private static User user = new User();
//    }
//    public static User getInstance(){
//        return UserCreate.user;
//    }
//    //防止序列化
//    private Object readReslove(){
//        return getInstance();
//    }

//    private volatile static User user;
//    private User(){};
//    private static User getUser(){
//        if (user==null){
//            synchronized (User.class){
//                if (user==null){
//                    user = new User();
//                }
//            }
//        }
//        return user;
//    }

    private volatile static User user;
    static String url;
    private User(){};
    private static User getUser(){
        if (user==null){
            synchronized (User.class){
                if (user==null){
                    user = new User();
                }
            }
        }
        return user;
    }

    @Override
    public String toString() {
        return "User{}"+ url;
    }

    //public int[] topKFrequent(int[] nums, int k) {
//    int n=nums.length;
//    Map<Integer,Integer> map=new HashMap<Integer,Integer>();
//    for(int i=0;i<n;i++){
//        Integer integer = map.getOrDefault(nums[i], 0);
//        map.put(nums[i],integer+1);
//    }
//    ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList(map.entrySet());
//
//    Collections.sort(list, (a, b) -> {
//        return b.getValue() - a.getValue();
//    });
//    int[] res=new int[k];
//    for(int i=0;i<k;i++){
//        res[i]=list.get(i).getKey();
//    }
//    return res;
//}
public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
        User user = User.getUser();
        user.url="https://www.baidu.com";
        System.out.println(user.toString());
    }
    User user1 = User.getUser();
    user1.url="11111111111";
    System.out.println(user1.toString());
}
}
