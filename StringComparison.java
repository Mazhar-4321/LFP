package LFP;

import java.util.Scanner;

public class StringComparison {
    static int var;
    public static void main(String[] args) {
        //sumOfCommandLineArguments(args);
        name(args[0]);
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        if(s1.equals(s2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

    }
    static void sumOfCommandLineArguments(String[] args){
        int invalidIntegers=0;
        int sum=0;
        for(String s : args){
            if(validInteger(s)){
                sum+=Integer.parseInt(s);
            }else{
                invalidIntegers++;
            }
        }
        System.out.println("count="+sum);
        System.out.println("Invalid Integers Count="+invalidIntegers);
    }
    static boolean validInteger(String s){
        int count=0;
        for(char x : s.toCharArray()){
            switch(x){
                case '0':break;
                case '1':break;
                case '2':break;
                case '3':break;
                case '4':break;
                case '5':break;
                case '6':break;
                case '7':break;
                case '8':break;
                case '9':break;
                default:count++;
            }
        }
        if(count==0){
            return true;
        }
        if((count==1)&&(s.charAt(0)=='+'||s.charAt(0)=='-')){
            return true;
        }else
            return false;
    }
    static void name(String arg){
        System.out.println(arg);
    }
    static void sampleMethod(){
        //all the methods in this class are static
        // and var 'variable' is static
        {
            System.out.println("static block");
        }
    }
    static boolean leapYear(int year){
         if(year<1582){
             return false;
         }
         else{
             if(year%400==0){
                 return true;
             }else{
                 if(year%4==0&&year%100==0){
                     return true;
                 }else{
                     return false;
                 }
             }
         }
    }
}
