package recution;

public class recurtion {

    public static void main(String[] args) {


//increasing(5);
//decinc(6);
        System.out.println(fab(7));
//        System.out.println(fab( 10));
//        zigzik(2);

    }
    public static void  increasing(int n){
        if(n==0)  return ;

        increasing(n-1);
        System.out.println(n);
    }
    public static void  decinc(int n){
        if(n==0)  return ;
        System.out.println(n);
       decinc(n-1);
        System.out.println(n);
    }

   public static int pow(int a,int b){
        if(b==1) return a;
        int power=pow(a,b/2);
        int ans=power*power;
        if(b%2!=0) ans=ans*a;
        return ans;
   }
   public static int fab(int n) {
        if(n<=1) return n;
             return fab(n - 1) + fab(n - 2);
   }
public static void zigzik(int n){
        if(n==0) return;
    System.out.println("pre "+n);
        zigzik(n-1);
    System.out.println("in"+n);
    zigzik(n-1);
    System.out.println("post "+n);

}

}
