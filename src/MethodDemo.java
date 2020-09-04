import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short x = sc.nextShort();
        short y = sc.nextShort();
        long result = (long)getMax(x,y);
        System.out.println("the max is "+result);
        System.out.println(1+2+"a");

    }

    // java中方法不难嵌套
    // java中的void不是一种数据类型，只能勇于方法返回值

    // 方法重载
    public static long getMax(long a, long b) {
        System.out.println("long");
        return (a>b)? a: b;
    }

    public static int getMax(int a, int b) {
        System.out.println("int");
        return (a>b)? a: b;
    }

    public static void myPrint() {
        System.out.println("hello world");
    }

}
