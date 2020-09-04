import org.omg.CORBA.PUBLIC_MEMBER;

public class ArrayDemo {
    public static void main(String[] args) {
        // java中内存五个分区
        // 栈 局部变量
        // 堆 new的对象
        // 方法区
        // 本地方法 系统函数
        // 寄存器 register

        // 动态初始化: 给出大小，系统给定初始值
        // arr1是局部变量，在栈中，存了地址
        // int[3] 这三个int类型的数存在堆中，有默认值0(引用类型:NULL boolean类型:false)
        int[] arr1 = new int[3];
        int[] arr2 = arr1;
        // 栈内存的两个引用(局部变量)指向同一个堆内存空间，无论哪一个操作，都是针对同一块堆内存
        arr2[1] = 100;
        System.out.println(arr1[1]);
        System.out.println("----");

        // 静态初始化: 给出初始化值，系统推测长度
        int[] arr3 = new int[]{1,2,3};
        // 简化格式:(隐含了new故右边依然在堆内存中)
        int[] arr4 = {1,2,3,4,5,6,7};
        // python: arr4 = [1,2,3];
        // perl: @arr4 = (1,2,3);
        System.out.println(arr3[1]);
        System.out.println("----");

        arr3 = null;
        // NullPointerException
        //System.out.println(arr3.length);
        //System.out.println(arr3[1]);
        printArray(arr4);

        reverse1(arr4);
        printArray(arr4);

        reverse2(arr4);
        printArray(arr4);

    }

    // 数组遍历
    public static void printArray(int[] arr) {
        if (arr == null) return;
        System.out.print('[');
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println(']');
    }

    // 数组是引用类型
    // main函数中的数组变量的值(地址)与reverse方法参数变量的值是同一个
    // in-place修改
    public static void reverse1(int[] arr) {
        if (arr == null) return;
        for (int i=0; i<arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }

    public static void reverse2(int[] arr) {
        for (int start=0,end=arr.length-1; start<end; start++,end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    public static int getIndex(int[] arr, int value) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
