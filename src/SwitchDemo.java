import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input an integer: ");

        int weekday = sc.nextInt();

        // switch variable: byte char short int enum(JDK5) String(JDK7)

        switch (weekday) {
            // case后必须是literal
            case 1:
                System.out.println("Monday");
                break;
            case 1+1:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid input");
                //break;
        // 先根据value找值(找不到再看default)，在从定位到的这一行开始运行到末尾(遇到break的话退出)
        // HOW EXIST: break/come to end
        }

        System.out.println("See you");

    }

}
