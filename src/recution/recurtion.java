package recution;

public class recurtion {

    public static void main(String[] args) {


//increasing(5);
//decinc(6);
//        System.out.println(fab(7));
//        System.out.println(fab( 10));
//        zigzik(3);
        int[] arr = {4, 2, 0, 4, 7, 6, 4, 21};
//     dis(arr,0);
//        revarr(arr, arr.length-1);
//        System.out.println(lastocc(arr, 0, 4));
//        System.out.println(max(arr,1, arr[0]));
        int lastidx=lastocc(arr,arr.length-1,4);
        System.out.println(lastidx);
    }

    public static void increasing(int n) {
        if (n == 0) return;

        increasing(n - 1);
        System.out.println(n);
    }

    public static void decinc(int n) {
        if (n == 0) return;
        System.out.println(n);
        decinc(n - 1);
        System.out.println(n);
    }

    public static int pow(int a, int b) {
        if (b == 1) return a;
        int power = pow(a, b / 2);
        int ans = power * power;
        if (b % 2 != 0) ans = ans * a;
        return ans;
    }

    //   public static int fab(int n) {
//        if(n<=1) return n;
//             return fab(n - 1) + fab(n - 2);
//   }
    public static void zigzik(int n) {
        if (n == 0) return;
        System.out.println("pre " + n);
        zigzik(n - 1);
        System.out.println("in" + n);
        zigzik(n - 1);
        System.out.println("post " + n);

    }

    public static void dis(int[] arr, int idx) {
        if (idx == arr.length) return;
        System.out.println(arr[idx]);
        dis(arr, idx + 1);
    }

    public static void revarr(int[] arr, int idx) {
        if (idx < 0) return;
        System.out.println(arr[idx]);
        revarr(arr, idx - 1);
    }

    public static int occ(int[] arr, int idx, int num) {
        if (arr[idx] == arr.length) return -1;
        else if (arr[idx] == num) return idx;
        return occ(arr, idx + 1, num);
    }
    public static int lastocc(int[] arr, int idx, int num) {
        if (arr[idx] < 0 ) return -1;
        if (arr[idx]==num) return idx;
            return lastocc(arr,idx-1,num);


        }

        public static int max(int []arr,int max){

        }

}
