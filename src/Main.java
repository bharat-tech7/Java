import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


       // Scanner scn=new Scanner(System.in);
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
        Scanner scn=new Scanner(System.in);
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
        System.out.println("Enter your Number");
        int num= scn.nextInt();
        int i=2;
        while(i<num)
        {  int temp=num;
            if(num%num==0 && num%1==0)
            {
                System.out.println("Prime Number");
            }
            else
            {
                System.out.println("Not Prime");
            }
            i++;
        }

    }
}