package callByValueReference;

public class CallByValueReferenceDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Before swapping: x = " + x + ", y = " + y);
        swap(x, y);
        System.out.println("After swapping: x = " + x + ", y = " + y);

        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Before modifying array: arr[0] = " + arr[0]);
        modifyArray(arr);
        System.out.println("After modifying array: arr[0] = " + arr[0]);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap method: a = " + a + ", b = " + b);
    }

    public static void modifyArray(int[] arr) {
        arr[0] = 100;
        System.out.println("Inside modifyArray method: arr[0] = " + arr[0]);
    }

}