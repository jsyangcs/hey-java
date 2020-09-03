public class LoopDemo {
    public static void main(String[] args) {
        int idx = 0;
        do {
            System.out.println("Hello world");
            idx++;
        } while (idx < 10);
        // for (;;) 死循环

        //跳出多层循环: 给循环命名 break name;
        outer: for (int x=0; x<3; x++) {
            inner: for (int y=0; y<4; y++) {
                if (y==2) {
                    break outer;
                }
                System.out.print('x');
            }
            System.out.println();
        }

        // 对于for循环continue跳到控制语句，对于while循环continue跳到判断语句
    }
}
