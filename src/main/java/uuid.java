import java.io.PushbackInputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class uuid {
//    static int i=1;
//    static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        if (n==2){
//            System.out.println(arr[0]*arr[1]);
//        }else {
//            for(int i=0;i<n-2;i++){
//                int a=arr[i]*arr[i+1];
//                int b=arr[i+1]*arr[i+2];
//                int c=arr[i]*arr[i+2];
//                int max=a;
//                max=b>max?b:max;
//                max=c>max?c:max;
//                list.add(max);
//
//            }
//            Collections.sort(list);
//            System.out.println(list.get(list.size()-1));
//        }

//        System.out.println(0.04+0.02);

//        int[] nums={1,-1};
//        int k = 1;
//        int[] re=new int[nums.length-k+1];
//        int c=0;
//        Deque<Integer> q = new LinkedList<>();
//        q.

//        T1 t1 = new T1();
//        T2 t2 = new T2();
//        Thread thread1 = new Thread(t1);
//        Thread thread2 = new Thread(t2);
//        thread1.start();
//        thread2.start();

//        int[] nums={1,2,3,4,5,3};
//        int l=0;
//        int r=nums.length-1;
//        int mid=nums.length/2;
//        int index=-1;
//        while(l<r){
//            if((nums[mid-1]<nums[mid]&&nums[mid]<nums[mid+1])||(nums[mid-1]>nums[mid]&&nums[mid]>nums[mid+1])){
//                l=mid+1;
//                mid=(l+r)/2;
//            }else{
//                index=mid+1;
//                break;
//            }
//        }
//        while(l<r){
//            if((nums[mid-1]<nums[mid]&&nums[mid]<nums[mid+1])||(nums[mid-1]>nums[mid]&&nums[mid]>nums[mid+1])){
//                r=mid-1;
//                mid=(l+r)/2;
//            }
//            else {
//                index=mid+1;
//                break;
//            }
//        }
//        System.out.println(index);
//       int[] nums1 = {0,0,3,0,0,0,0,0,0};
//       int m = 3;
//       int[] nums2 = {-1,-2,1,1,2,3};
//       int n = 6;
//
//       int a=0;
//       int b=0;
//       while(a<n||b<n){
//
//       }
//        for (int i = 0; i < nums1.length; i++) {
//            System.out.print(nums1[i]);
//        }

//        int[] nums = {1,3,-1,-3,5,3,6,7};
//        int k = 3;
//        Deque<Integer> deque = new LinkedList<Integer>();
//        int[] re=new int[nums.length-k+1];
//        int len = nums.length;
//        int index=k-1;
//        int l=0;
//        int max=nums[0];
//        for (int i = 0; i < k; i++) {
//            if (max<nums[i]) {
//                max=nums[i];
//            }
//            deque.add(nums[i]);
//        }
//        re[l]=max;
//        while(index<len){
//          if (nums[index]<max && deque.removeFirst()==max){
//              re[l]=max;
//              deque.add(nums[index++]);
//          }
//        }

//        for (int i = 0; i < 10; i++) {
//            User user = User.getUser();
//            System.out.println(user);
//        }


    }
//    static class T1 implements Runnable{
//        @Override
//        public void run() {
//            synchronized (lock){
//                while(i<=100){
//                    if(i%2==1){
//                        System.out.println(Thread.currentThread().getId()+" "+i++);
//                        lock.notify();
//                    }
//                    try {
//                        lock.wait();
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//    static class T2 implements Runnable{
//        @Override
//        public void run() {
//            synchronized (lock){
//                while(i<=100){
//                    if(i%2==0){
//                        System.out.println(Thread.currentThread().getId()+" "+i++);
//                        lock.notify();
//                    }
//                    try {
//                        lock.wait();
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//
//        }
//    }

//    public static class User{
//       private static volatile User user;
//        private User(){};
//        private static User getUser(){
//            if (user==null){
//                synchronized (User.class){
//                    if(user==null){
//                        user=new User();
//                    }
//                }
//
//            return user;
//        }
//
//    }
    public static void quickSort(int[] arr,int low ,int high) {
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        temp=arr[low];
        while(i<j){
           while(temp<=arr[j]&&i<j){
               j--;
           }
           while(temp>arr[i]&&i<j){
               i++;
           }
           if(i<j){
               t=arr[j];
               arr[j]=arr[i];
               arr[i]=t;
           }
           arr[low]=arr[i];
           arr[i]=temp;
           quickSort(arr,low,j-1);
           quickSort(arr,j+1,high);
        }

    }



}
class reflectDemo{
    private String name;
    private int age;
    public reflectDemo(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void getName(){
        System.out.println(name+"今年"+age+"岁！");
    }
}
 class reflectClass{
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> reflect = Class.forName("reflectDemo");
        Constructor<?> constructor = reflect.getConstructor(String.class,int.class);
        Object instance = constructor.newInstance("张三",30);
        reflect.getMethod("getName").invoke(instance);
        int i=3;
        System.out.println(i>>1);
    }
}


