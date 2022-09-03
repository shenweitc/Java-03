//定义一个方法，打印指定次数的Hello World

public class DemoMethodPrint {
    public static void main(String[] args) {
        printCount(5);
    }

    public static void printCount(int a) {
        for (int i = 1; i <=a; i++) {
            System.out.println("Hello World "+i);
        }
    }
}

