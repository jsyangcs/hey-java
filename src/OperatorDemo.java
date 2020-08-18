public class OperatorDemo {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println(x+y);
        System.out.println(1.0 * x / y);
        // 字符串可以和别的数据类型的变量+(拼接)
        System.out.println("x: "+x);
        //单个字符在运算时先转化为int
        System.out.println('A'+x);
        //运算从左往右，第一个是字符串拼接
        System.out.println("x: "+'A'+x);
        System.out.println('A'+"x: "+x);

        //x = x+10 error
        //隐含强制转换
        x+=10;
        System.out.println(x);
        //boolean operator
        // || && ！^ 常用
        //System.out.println(x.instanceof(int));


        // bitwise operator
        // & | ^ ~
        int a = 10;
        int b = 20;
        //用于数据加密
        System.out.println(a ^ b ^ a);
        System.out.println(a ^ b ^ b);
        //交换ab
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);
        //交换ab
        a = (a + b) - (b = a);
        System.out.println(a);
        System.out.println(b);

        //System.out.println(true + 1); error
    }
}
