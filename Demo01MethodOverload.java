//方法的重载：方法名一样，参数列表不同
public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10,56,56));
    }

    public static int sum(int a,int b) {
        return a+b;
    }
    public static int sum(int a,int b,int c) {
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d) {
        return a+b+c+d;
    }
}
