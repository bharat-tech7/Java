package soorting;

public class main {
    public static void swap(int[] arr,int a,int b){
        int c= arr[a];
        arr[a]=arr[b];
        arr[b]= c;
    }
    public static int[] bubblesort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j = 0; j < n - 1 - i; j++)
            {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        return arr ;
    }
    public static int[] insertion(int [] arr){
        int n=arr.length;
        for(int i=1;i<n;i++) {
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > temp ){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }
    public static void main(String[]args){
        int[] arr={12,54,87,20,9,17};
        int[] result = insertion(arr);
        for (int value:result){
            System.out.print(value+" ");
        }
    }
}
