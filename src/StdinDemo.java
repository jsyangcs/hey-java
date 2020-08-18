import java.util.Scanner;

public class StdinDemo {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("please put in x: ");
        int x = sc.nextInt();

        System.out.println("please put in y: ");
        int y = sc.nextInt();

        int sum = x + y;
        System.out.println("sum is "+sum);

        int max = ((x > y)? x: y);
        System.out.println("max is "+max);
    }

}
