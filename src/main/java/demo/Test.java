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
////        map.put(new User("����"),1);
////        map.put(new User("����"),1);
////        System.out.println(map.size());
////        Integer integer = map.get(new User("����"));
////        System.out.println("������ֵΪ"+integer);
//
////        ///��������������ʱ��ת��Ϊ����Э��ʱUTC
////        LocalDateTime utcNow = LocalDateTime.now(ZoneId.of("UTC"));
////        System.out.println("��������ǰUTCʱ��: " + utcNow);
////
////        // ת��ΪŦԼʱ��ʱ��
////        ZoneId newYorkZoneId = ZoneId.of("America/New_York");
////        ZonedDateTime newYorkTime = utcNow.atZone(ZoneId.of("UTC")).withZoneSameInstant(newYorkZoneId);
////        System.out.println("ŦԼʱ��ʱ��: " + newYorkTime);
////        System.out.println("ŦԼʱ��Сʱ: " + newYorkTime.getHour());
////
////        // ת��ΪϵͳĬ��ʱ��ʱ�䣨������������׶أ�
////        ZonedDateTime systemTime = utcNow.atZone(ZoneId.of("UTC")).withZoneSameInstant(ZoneId.systemDefault());
////        System.out.println("ϵͳĬ��ʱ��ʱ��: " + systemTime);
////        System.out.println("ϵͳĬ��ʱ��Сʱ: " + systemTime.getHour());
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
////        User user = new User("����");
////        User user1 = new User("����");
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
        // ע�⣬��������Ƕ��������������ͨ��whileѭ����������������
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
