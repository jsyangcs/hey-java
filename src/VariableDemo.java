public class VariableDemo {
    // java是静态语言(定义变量需要明确类型)
    // java是强类型语言(一旦赋值给某个变量，改变量就会持有这个类型，"不能"(相对)与其他类型混合运算)
    public static void main(String[] args) {
        // byte short int(default) long
        byte b = 10;
        long c = 10000 + b;   // 整形字面量默认是int,long加L 不加L如果在范围内不报错(默认转换)，否则报错
        System.out.println(c);
        // float double(default)
        float d = 12.13F;           // ..字面量默认是double,float加F 不加F报错，损失精度
        System.out.println(d);
        // char
        // '0':48 'A':65 'a':97
        char ch = 'a';
        System.out.println(ch);
        // b = (byte)ch;
        // boolean
        boolean flag = true;
        System.out.println(flag);
        // 默认类型转换(因为不同类型数据运算) byte/short/char -> int -> long -> float -> double
        byte n1 = 10;
        byte n2 = 11;
        //byte n3 = n1 + n2;
        //右边已经变成了int类型的值
        int n3 = n1 + n2;
        System.out.println(n3);
        // 强制类型转换
        byte n4 = (byte) (n1 + n2);
        System.out.println(n4);

        // 涉及字面两的例子
        byte b1 = 3;
        //右边涉及变量就不行
        //byte b2 = b1 + 2;
        //只有常量就行
        byte b2 = 2 + 3;

        // boolean不参与类型转换
        boolean c1 = true;
        int c2 = 1;
        //int c3 = c1 + c2;

        //int d1 = 1000000;
        char d2 = 100;




    }
}
