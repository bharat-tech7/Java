import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
static void printArray(int[]arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}
static void rotate(int []arr,int k){
    int n = arr.length;
    int rnumber = arr[n-1];
    
}


    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the index number for rotate");
        int a= scn.nextInt();
        int[] arr={1,2,3,4,5,6};
        printArray(arr);

    }
}