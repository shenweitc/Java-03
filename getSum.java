package Demo02MethodSum;
//定义一个方法，用来计算方法输入数的和值
public class getSum {
    public static void main(String[] args) {
        System.out.println(getSame(100));
        System.out.println(getSame(200));
    }

    public static int getSame(int a) {
        int sum=0;
        for(int i=0;i<=a;i++){
            sum+=i;
        }
        return sum;
    }
}
