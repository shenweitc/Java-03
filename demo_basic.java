package demo03;
//定义一个方法，用来判断两个数是否相同
public class demo_basic {
    public static void main(String[] args) {
        System.out.println(isSame(10,30));
        System.out.println(isSame(10,10));
    }

    public static boolean isSame(int a,int b) {
        return a==b;
    }
}
