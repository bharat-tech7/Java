
import java.util.Scanner;






public class Main {


//    static void sum() {
//
//    }
//
//    {
//        int a=10;
//        int b=20;
//        System.out.println(a+b);
//    }
//    static void x()
//    {
//        System.out.println("Bharat");
//        System.out.println("Daksh");
//        y();
//        System.out.println("Kiran");
//        System.out.println("Subham");
//    }
//    static void y()
//    {
//        System.out.println("regex is best");
//    }
//
//    public static void main(String[] args) {
//
//       Scanner scn=new Scanner(System.in);
        //Taking marks from user
      /*  System.out.println("Enter Your marks of math :");
       int math=scn.nextInt();
        System.out.println("Enter Your marks of science:");
        int sci=scn.nextInt();
        System.out.println("Enter Your marks of Sst :");
        int sst=scn.nextInt();
        System.out.println("Enter Your marks of English :");
        int english=scn.nextInt();
        System.out.println("Enter Your marks of Hindi:");
        int hindi=scn.nextInt();
        //total marks obtain
        int total=math+sci+sst+english+hindi;
        System.out.printf("Total marks =%d\n",total);
        //calculating percentage
        float per=(total)/500.0f*100;
        System.out.println(per);
        //calulating grade
        if(per>=90)
        {
            System.out.println("Execllent");
        }
        else if(per>=80)
        {
            System.out.println("Very Good");
        }
        else if(per>=70)
        {
            System.out.println("Good");
        }
        else if(per<=70)
        {
            System.out.println("Fail Ho Gya!");
        }
        else {
            System.out.println("invalid value");
        }
*/
        //number print 1--100
//        int num=1;
//        while(num<=100)
//        {
//            System.out.println(num);
//            num++;
//        }
//        //print number 100--1
//        int i=100;
//        while (i>=1)
//        {
//            System.out.println(i);
//            i--;
//        }
        //All even number between 1--100
//        int number=1;
//        while(number<=100)
//        {
//        if(number%2==0) {
//            System.out.println(number);
//        }
//            number++;
//        }
//All Odd Number between 1--100
//        int number=1;
//        while(number<=100)
//        {
//            if(number%2!=0) {
//                System.out.println(number);
//            }
//            number++;
//        }
//        Scanner scn = new Scanner(System.in);
//        System.out.print("Enter Your Number ");
//        int number=scn.nextInt();
//        int i=1;
//        while(i<=10) {
//            System.out.println(number +" x " +i +" = "+number*i);
//            i++;
//        }
//        //factorial programme
//        System.out.print("Enter number :");
//        int num= scn.nextInt();
//int checkingnum =2;
//while(num>1)
//{
//if(num%checkingnum ==0)
//{
//    System.out.print(checkingnum +" ");
//    num=num/checkingnum;
//}
//else
//{
//    checkingnum+=1;
//}
//}
//
//        System.out.println("Enter Your Number");
//        int n=scn.nextInt();
//        int n1=0 ,n2=1;
//        int i=1;
//        while( i<=n)
//        {
//            System.out.print(n1+",");
//            int n3=n1 + n2;
//            n1=n2;
//            n2=n3;
//            i++;
//
//        }
//        Prime Number Programme
//        System.out.println("Enter your Number");
//        int num= scn.nextInt();
//        int divnum =2;
//        int count =0;
//
//        while (divnum<num){
//            if(num%divnum ==0)
//            {
//                count++;
//                break;
//            }
//            divnum++;
//        }
//        if (count>0)
//        {
//            System.out.println("not prime" + " " +count);
//        }
//        else
//        {
//            System.out.println("Prime ");
//        }
//   <---------     Power Program ------->
//        System.out.println("Enter your first number");
//        int n1= scn.nextInt();
//        System.out.println("Enter your second number");
//        int n2= scn.nextInt();
//        int ans=1;
//      while (n2>0)
//      {   ans=ans * n1;
//n2--;
//      }
//        System.out.println(ans);
//
//        System.out.println("Enter number");
//        int num = scn.nextInt();
//       int  ans=1;
//        while(ans*ans<=num)
//        {
//            ans++;
//        }
//        ans=ans-1;
//        System.out.println(ans);
//
//        System.out.println("Enter Four Digit Number :");
//        int number =scn.nextInt();
//        System.out.println("Enter the value of k :");
//        int k= scn.nextInt();
//        while(k >0)
//        {
//            number=((number%10) * 1000) + number/10;
//
//
//            k--;
//
//        }
//        System.out.println("The  Final Number : "+number);
//        System.out.print("Enter Number :");
//        int n=scn.nextInt();
//       for(int i=1; i<=n; i++)
//        {
//            for(int j=1; j<=n; j++)
//            {
//                if(i == 1 ||j==1||i+j==6) {
//
//                    System.out.print(j+" ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//
//            }
//            System.out.println(" ");
//        }
        //Square Hollow Program
//        for(int i=1; i<=n; i++)
//        {
//            for(int j=1; j<=n; j++)
//            {
//                if(i == 1 ||j==1||i==5||j==5) {
//
//                    System.out.print("*"+" ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//
//            }
//            System.out.println(" ");
//        }

        //Number Increasing pramid
//        for(int i=1; i<=n; i++)
//        {
//            for(int j=1; j<=i; j++)
//            {
//
//                    System.out.print(j+" ");
//
//            }
//            System.out.println(" ");
//        }
//        //Number Increasing reverse  pramid
//        for(int i=5; i>=1; i--)
//        {
//            for(int j=1; j<=i; j++)
//            {
//
//                System.out.print(j+" ");
//
//            }
//            System.out.println(" ");
//        }
        //right half pramid
//        for(int i=1; i<=n; i++)
//        {
//            for(int j=1; j<=i; j++)
//            {
//
//                System.out.print( "*"+" ");
//
//            }
//            System.out.println(" ");
//        }
        // Number Triangle
//        for(int i=1;i<=n;i++)
//        {
//            for(int s=5;s>=i;s--)
//            {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(i+" ");
//            }
//            System.out.println("  ");
//        }
        //Lift half pyramid
//        for(int i=1;i<=5;i++)
//        {
//            for(int s=5;s>=i;s--)
//            {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("*"+" ");
//            }
//            System.out.println("");
//        }
        //Reverse Right Half Pyramid
//        for(int i=5;i>=1;i--)
//        {
//            for(int s=5;s>=i;s--)
//            {
//                System.out.print("");
//            }
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("*"+" ");
//            }
//            System.out.println("");
//        }
        //Triangle star pattern
//        for(int i=1;i<=5;i++)
//        {
//            for(int s=5;s>=i;s--)
//            {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++)
//
//            {
//                System.out.print("*"+" ");
//            }
//            System.out.println("");
//        }
        //K Pattern
//        for(int i=5;i>=1;i--)
//        {
//            for(int s=5;s>=i;s--)
//            {
//                System.out.print("");
//            }
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("*"+" ");
//            }
//            System.out.println("");
//        }
//        for(int i=2; i<=5; i++)
//        {
//            for(int j=1; j<=i; j++)
//            {
//
//                System.out.print( "*"+" ");
//
//            }
//            System.out.println(" ");
//        }
        // Number Increasing Reverse Pyramid
//        for(int i=5;i>=1;i--)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(j+" ");
//            }
//            System.out.println("  ");
//        }
//        sum();
//
//        System.out.println("A");
//        System.out.println("B");
//        x();
//        System.out.println("C");
//        System.out.println("D");
        public static void main (String[] args){
//        System.out.println("Enter a Number ");
//        Scanner scn = new Scanner(System.in);
//        int Number = scn.nextInt();
//        int[] age = new int[Number];
//        System.out.println("Enter " + Number + " values of the array");
//        for (int i = 0; i < Number; i++) {
//            age[i] = scn.nextInt();
//        }
//        System.out.println("The valueof entered array is :");
//        for (int i = 0; i < Number; i++) {
//            System.out.print(age[i] + " ");
//        }
//        //max age and min age or spam(difference)
//        int maxAge = age[0];
//        int minAge = age[0];
//        for (int i = 1; i < age.length; i++) {
//            if (maxAge < age[i]) {
//                maxAge = age[i];
//            }
//            if (minAge > age[i]) {
//                minAge = age[i];
//            }
//        }
//            System.out.println("Max age in array is: " + maxAge);
//        System.out.println("Thw minimum value in array is:"+minAge);
//        int spam=maxAge-minAge;
//        System.out.println("Spam is:"+spam);


            //------Array swaping  ------>

//        int[] arr = {10, 20, 30, 40, 50};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        swaparr(arr,2,3);
//        for (int i = 0; i <arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//    }
//
//   public static void swaparr(int[] arr, int a, int b) {
//        arr[a]  = arr[a]+arr[b];
//       arr[b]  = arr[a]-arr[b];
//       arr[a]  = arr[a]-arr[b];
//            System.out.println("Enter Target Value: ");
//       Scanner scn = new Scanner(System.in);
//            int[] arr = {20, 40, 70, 50, 80};
//
//
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//            }
//            int t=scn.nextInt();
//            System.out.println();
//            int count = function(arr, t);
//            if (count != 0) {
//                System.out.println("The target is found at :" + count);
//            } else {
//                System.out.println("Wrong value");
//            }
//        }
//    static int function ( int[] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                return i;
//            }
//        }
//            return 0;
//            ------------------------------------------------------------------------------------------------
//           int [] arr={ 2,5,4,6,0,1};
//            for( int i=0;i<arr.length;i++){
//                for(int j=1;j<=arr[i];j++){
//                    if(arr[i]!=0){
//                    System.out.print("*");
//                }
//                else {
//                        System.out.print("");
//                    }
//
//}
//                System.out.println("");
//            }
            //---------------------------------------------------------------------------
//            for( int i=0;i<arr.length;i++){
//                for(int j=5;j>=arr[i];j--){
//                    if(arr[i]!=0){
//                        System.out.print("*");
//                    }
//                    else {
//                        System.out.print("");
//                    }
//
//                }
//                System.out.println("");
//                for(int i=5;i< arr.length;i--)
//                {
//                    for(int j=1;j<=arr[i];j++) {
//                        if (arr[i] != 0) {
//
//
//                            System.out.print("*");
//                        }
//                        else {
//                            System.out.print(" ");
//                        }
//                    }
//                    System.out.println(" ");
//                }
            }

    }












