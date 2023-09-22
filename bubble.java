import java.util.Scanner;

public class bubble {
    static void print(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void func(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            boolean check = false;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    check = true;
                }
            }
            if(check == false) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before sorting: ");
        print(arr);
        System.out.println("After sorting: ");
        func(arr);
        print(arr);
    }
}
