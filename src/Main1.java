import java.util.Scanner;

public class Main1{
//    static int myFunction(int a , int b){
//        return a+b;
//    }
//    static double myFunction(double a , double b){
//        return a-b;
//    }
//    static float myFunction(float a , float b){
//        return a*b;
//    }
//    static String myFunction(String a , String b){
//        return a+" "+b;
//    }
//    recursive function
//  public static int recursive_function(int num){
//        if(num==0){
//            return 0;
//        }
//        return num+recursive_function(num-1);
//
//    }
    public static void countdown(int num){
        if(num==0){
            return;
        }
        System.out.print(num+" ");
        countdown(num-1);
    }
    public static void main(String[] args) {
//        int num1=12;
//        int num2=15;
//        double num3=20.56;
//        double num4=55.87;
//        float num5=78.7f;
//        float num6=24.88f;
//        System.out.println(myFunction(num1,num2));
//        System.out.println(myFunction(num3,num4));
//        System.out.println(myFunction(num5,num6));
//        String str1="ziaurrehman";
//        String str2="A 2Y scholar";
//        System.out.println(myFunction(str1,str2));
// Lets implimate the recursion fucntion
//        Scanner sc=new Scanner((System.in));
//        System.out.println("Enter the number");
//        int num=sc.nextInt();
//        System.out.println(recursive_function(num));
//this is the halting situatipon of recursive function
        //    function to crreate the countdown recursive function
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    countdown(n);


    }


}