import java.util.Scanner;

public class Main{
    public static void main(String[] args){
//        System.out.println("Hey all , I am Ziaurrrehman Malik, a 2Y SAP STAR Scholar student ");
//        System.out.println("I am learning java from the scrathc or beginning");
//        System.out.println("It is an awesome exeprince ");
//        System.out.println(10000);
//        System.out.println(358);
//        System.out.println(100000);
//        System.out.println(6*3+99-11);
//        //asigning the variable in the java
//        String name="Ziaurrehman Malik";
//        int a=22;
//        double b=23.67;
//        char ch='a';
//        boolean bl=true;
//        System.out.println(name);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(ch);
//        System.out.println(bl);
//        int myNum=55;
//        System.out.println(myNum);
//        myNum=899;
//        System.out.println(myNum);
////        we can use final varivle to make it constant
//        final int ans=97;
//        System.out.println(ans);
////        /ans=99;
//        System.out.println(ans);
////        to combine the text with variable
//        String lt="SAP business";
//        System.out.println("Hey welcome to " + lt);
////        adding first variable to another
//        String str1="good";
//        String Str2="morning";
//        System.out.println(str1+Str2);
//        int p=23;
//        int q=99;
//        System.out.println(p+q);
//        int qq=12,w=23,e=34;
//        System.out.println(qq*7+(e-7)/w);
//        int s,d,f;
//        s=d=f=9988776;
//        System.out.println(s+" "+d+" "+f);
////        area of rectangle
//        int length=4;
//        int width=6;
//        int area=length*width;
//        System.out.println(area);
//        byte firstNum=127;
//        System.out.println(firstNum);
////        for long numbers
//        long myNumber=159999999999L;
//        System.out.println(myNumber);
//float f1=35e3f;
//    System.out.println(f1);
//    double f2=23e4;
//    System.out.println(f2);
//        // Set the maximum possible score in the game to 500
//        int maxScore = 500;
//
//// The actual score of the user
//        int userScore = 423;
//
///* Calculate the percentage of the user's score in relation to the maximum available score.
//Convert userScore to float to make sure that the division is accurate */
//        float percentage = (float) userScore / maxScore * 100.0f;
//
//        System.out.println("User's percentage is " + percentage);
////lets discuss about teh operators
//        int var1=12;
//        int var2=13;
//        System.out.println(var1+var2);
//        System.out.println(var1-var2);
//        System.out.println(var1*var2);
//        System.out.println(var2/var1);
//        System.out.println(var2%var1);
//        System.out.println(var1++);
//        System.out.println(var2--);
//        long pp= 999999L;
//        System.out.println(pp);
////        string methods
//        String name_1="Ziaurrehman Malik";
//        System.out.println(name_1);
//        System.out.println(name_1.length());
//        System.out.println(name_1.toUpperCase());
//        System.out.println(name_1.toLowerCase());
//        System.out.println(name_1.indexOf("Malik"));
//        System.out.println(name_1.charAt(2));
//
//         byte k=127;
//         byte l=2;
//         int div=(byte)(k+l);
//        System.out.println(div);
//        int xx=129;
//        byte yy=(byte)xx;
//        System.out.println(yy);
//        String txt="Hello, good morning \"how are you\" , hope you are doing well";
//        String txt2="great! its going \"well\" ";
//        System.out.println(txt);
//        System.out.println(txt2);
////        finding the random number
//        double ran= Math.random();
//        int ran2=(int)(Math.random()*100);
//        System.out.println(ran);
//        System.out.println(ran2);
//        if(123>98){
//            System.out.println("Correct");
//        }
//        else {
//            System.out.println("Wrong");
//        }
//declaration of an array
//        int [] arr={1,2,3,4,5};
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
////            System.out.println();
//        }
//        String cars[]={"BMW","Audi","Ferrari","Mercedes","Alto"};
//        for(int i=0;i<cars.length;i++){
//            System.out.println(cars[i]+" "+"is my "+i+" car");
//        }
//        String [] coding_profiles={"Leetcode","Codeforces","GeeksForGeeks","CodingNinjas"};
//        String [] new_str = new String[1];
//        for(String str:coding_profiles){
//            if(str=="Leetcode"){
//                new_str[0]=str;
//            }
//        }
//        System.out.println(new_str[0]);
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of cars");
        int no=input.nextInt();
        int [] cars=new int[no];
        for(int i=0;i<no;i++){
            cars[i]=input.nextInt();
        }
        for(int j=0;j<no;j++){
            System.out.println(cars[j]);
        }
//        way of taking the input
        Scanner sc=new Scanner(System.in);
        int number_of_digits=sc.nextInt();
        String pq=sc.next();
        for(int i=0;i<pq.length();i++){
            System.out.println(pq.charAt(i));

        }
        int number_of_words=sc.nextInt();
        for(int i=0;i<number_of_words;i++){

        }


    }
}