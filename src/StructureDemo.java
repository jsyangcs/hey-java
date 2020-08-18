import java.util.Scanner;

public class StructureDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int a1 = sc.nextInt();
        //int a2 = sc.nextInt();
        int x = 10;
        boolean y = true;
        // java中判断表达式的值必须是boolean值
        if (y == true) {
            System.out.println("x==10"+3);
        }
        System.out.println("over");
        String isOdd = (x%2 == 0)?"x is even":"x is odd";
        System.out.println(isOdd);
        if (x%2 == 0) {
            System.out.println("x is even");
        } else {
            System.out.println("x is odd");
        }

    }
}
