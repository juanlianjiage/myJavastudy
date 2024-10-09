package demo;

import sun.rmi.server.UnicastServerRef;

import java.lang.reflect.Proxy;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;


public class Test {

//    public static void main(String[] args) {
////        HashMap<User, Integer> map = new HashMap<>();
////        ConcurrentHashMap<Object, Object> hashMap = new ConcurrentHashMap<>();
////        map.put(new User("张三"),1);
////        map.put(new User("张三"),1);
////        System.out.println(map.size());
////        Integer integer = map.get(new User("张三"));
////        System.out.println("张三的值为"+integer);
//
////        ///将将服务器本地时间转换为世界协调时UTC
////        LocalDateTime utcNow = LocalDateTime.now(ZoneId.of("UTC"));
////        System.out.println("服务器当前UTC时间: " + utcNow);
////
////        // 转换为纽约时区时间
////        ZoneId newYorkZoneId = ZoneId.of("America/New_York");
////        ZonedDateTime newYorkTime = utcNow.atZone(ZoneId.of("UTC")).withZoneSameInstant(newYorkZoneId);
////        System.out.println("纽约时区时间: " + newYorkTime);
////        System.out.println("纽约时区小时: " + newYorkTime.getHour());
////
////        // 转换为系统默认时区时间（假设服务器在伦敦）
////        ZonedDateTime systemTime = utcNow.atZone(ZoneId.of("UTC")).withZoneSameInstant(ZoneId.systemDefault());
////        System.out.println("系统默认时区时间: " + systemTime);
////        System.out.println("系统默认时区小时: " + systemTime.getHour());
//
////        Integer a=127,b=127;
////        System.out.println(a==b);
////
////        Integer c=1000,d=1000;
////        System.out.println(c==d);
////
////        int e=10000;
////        Integer f=10000;
////        System.out.println(e==f);
////        User user = new User("张三");
////        User user1 = new User("张三");
////        System.out.println(user1.equals(user));
////        System.out.println(user.hashCode());
////        System.out.println(user1.hashCode());
////        Object o = new Object();
//
////        for (int i=1;i<=5;i++){
////            try{
////                int i1 = i / 0;
////                System.out.println("66666");
////            }catch (Exception e){
////                e.printStackTrace();
////            }
////        }
////        for (int i=1;i<=5;i++){
////            int i1= i / 0;
////            System.out.println(6666);
////        }
////        final List<Integer> list=new ArrayList<>();
////        list.add(1);
////        list.add(2);
////        for (Integer integer : list) {
////            System.out.println(integer);
////        }
//
////        Integer integer = new Integer(5);
////        Integer integer1 = new Integer(5);
////        System.out.println(integer1==integer);
////        Integer i=5;
////        Integer i1=5;
////        System.out.println(i==i1);
//
////        String s="leetcode";
////        List<String> wordDict=new ArrayList<>();//"cats","dog","sand","and","cat"
////        wordDict.add("leet");
////        wordDict.add("code");
////        int[] re=new int[s.length()+1];
////        re[0]=1;
////        int n=s.length();
////        for(int i=1;i<=n;i++){
////            for(int j=0;j<i;j++){
////                if(re[j]==1&&wordDict.contains(s.substring(j,i))){
////                    re[i]=1;
////                    break;
////                }
////            }
////        }
////        System.out.println(re[n]);
//        int[] nums={-2,3,-4};
//        int[] re = new int[nums.length];
//        re[0] = nums[0];
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 1; i < nums.length; i++) {
//            re[i]=nums[i];
////            if (re[i - 1] <= nums[i] * re[i - 1]) {
////                re[i] = Math.max(nums[i],nums[i] * re[i - 1]);
////            } else {
////                re[i] = nums[i];
////            }
//            re[i]=Math.max(re[i],nums[i]*re[i-1]);
//            max = Math.max(max, re[i]);
//        }
//        System.out.println(max);
//    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
        String a = in.nextLine();

        int len = a.length();
        for(int i=0;i<len;i++) {
            boolean flag = false;
            int k = 1;
            for (int j = i + 1; j < len; j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    flag = true;

                    if (k > 0) {
                        System.out.println(a.charAt(i) + "," + (i+1)   + ";");
                    }
                    k--;
                    if (flag) {
                        System.out.println(a.charAt(j) + "," + (j+1) + ";");
                    }
                }

            }
            a.replaceAll(String.valueOf(a.charAt(i)),"*");
            k = 1;
            flag = false;
        }
    }
}
