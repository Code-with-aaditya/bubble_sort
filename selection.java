import java.util.Scanner;

public class selection {
    static void print(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void func(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            int min_idx = i;
            for(int j = i+1; j < a.length; j++) {
                if(a[min_idx] > a[j]) {
                    min_idx = j;
                }
            }
            if(min_idx != i) {
                int temp = a[i];                          
                a[i] = a[min_idx];
                a[min_idx] = temp; 
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting: ");
        print(arr);
        System.out.println("After Sorting: ");
        func(arr);
        print(arr);






    }
}
