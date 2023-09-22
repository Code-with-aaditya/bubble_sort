import java.util.Scanner;

public class insertion {
    static void print(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void func(int[] a) {
        for(int i = 1; i < a.length; i++) {
            int j = i;
            while(j > 0 && a[j - 1] > a[j]) {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before sorting: ");
        print(arr);
        System.out.println("After sorting: ");
        func(arr);
        print(arr);
    }
}
