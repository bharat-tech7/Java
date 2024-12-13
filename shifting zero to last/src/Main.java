//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int temp = 0;


        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[temp++] = arr[i];
            }
        }
        while (temp < n) {
            arr[temp++] = 0;
        }
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,5,0,8,6,0,5,0,1};
        printArray(arr);
moveZerosToEnd(arr);
printArray(arr);
    }
}