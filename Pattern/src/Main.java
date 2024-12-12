
public class Main {
    static int maxElement(int [] arr){
     int n= arr.length;
     int max = arr[0];
     for(int i=1;i<n;i++)
     {
         if(arr[1]>max)  max=arr[i];
     }
     return  max;
    }
    static int minElement(int[] arr){
        int n= arr.length;
        int min = arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[1]<min)  min=arr[i];
        }
        return min;
    }
    static void barchart(int[] arr){
        int n= arr.length;
        for(int i =0;i<arr.length;i++) {
            for (int j = 1; j <= arr[i]; j++){

                System.out.print("*  ");
        }
            System.out.println("");
        }

    }
    static void barchart2(int[] arr){
        int n= arr.length;
        int max=maxElement(arr);
        for(int i= max; i > 0; i-- ) {
            for (int j = 0; j < n; j++) {
                if (arr[j] >= i) System.out.print("*"+"  ");


            }
            System.out.println( "    ");
        }

    }


    public static void main(String[] args) {
        int[] arr ={2,4,1,3,5};
//        barchart(arr);
//        System.out.println("Max Value is :"+ maxElement(arr));

//        System.out.println("Min vValue is :"+ minElement(arr));
     barchart2(arr);

    }
}