package LFP.Day2;

import LFP.Day1.StringComparison;

public class Main {
    public static void main(String[] args) {
      boolean flag=  StringComparison.validInteger(args[0]);
      boolean flag1=StringComparison.validInteger(args[1]);
      if(flag&&flag1){
          SpringSeason springSeason= new SpringSeason();
          springSeason.setD(Integer.parseInt(args[0]));
          springSeason.setM(Integer.parseInt(args[1]));
          System.out.println( springSeason.dayOfMonthBetweenMarch20AndJune20());
      }
      Quadratic quadratic= new Quadratic();
      quadratic.setA(1);
      quadratic.setB(2);
      quadratic.setC(3);
      quadratic.rootsOfQuadraticEquation();
      if(StringComparison.validInteger(args[0])&&StringComparison.validInteger(args[1])){
          Distance d = new Distance();
          d.setX(Integer.parseInt(args[0]));
          d.setY(Integer.parseInt(args[1]));
          System.out.println(d.distance());
      }
    }
    static void numberInWords(int n){
        String s="";
        switch(n){
            case 0:s="Zero";break;
            case 1:s="One";break;
            case 2:s="Two";break;
            case 3:s="Three";break;
            case 4:s="Four";break;
            case 5:s="Five";break;
            case 6:s="Six";break;
            case 7:s="Seven";break;
            case 8:s="Eight";break;
            case 9:s="Nine";break;
            default:s="Invalid";
        }
        System.out.println(s);
    }
    static void sumOfNaturalNumbers(int n){
        int sum=0;
        while(n>0){
            sum+=n;
            n--;
        }
        System.out.println(sum);
    }
    static void reverseOfANumber(int n){
        int rev=0;
        while (n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        System.out.println(rev);;
    }
    static void sumOfNaturalNumbersUsingForLoop(int n){
        int sum=0;
        for(;n>0;n--){
            sum+=n;
            
        }
        System.out.println(sum);
    }
    static void reverseOfANumberUsingForLoop(int n){
        int rev=0;
        for (;n>0;n=n/10){
            rev=rev*10+n%10;
        }
        System.out.println(rev);
    }
    static boolean palindromeNumber(int n){
        int temp=n;
        int rev=0;
        while (n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        if(rev==temp){
           return true;
        }
        else
            return false;
    }
    static boolean isVowel(char c){
        switch(c){
            case 'a':return true;
            case 'e': return true;
            case 'i':return true;
            case '0': return true;
            case 'u':return true;
            default: return false;
        }
    }
    static String monthNameOfANumber(int n){
        switch (n){
            case 1 : return "January";
            case 2 : return "Februaru";
            case 3 : return "March";
            case 4 : return "April";
            case 5 : return "May";
            case 6 : return "June";
            case 7 : return "July";
            case 8 : return "August";
            case 9 : return "September";
            case 10 : return "October";
            case 11 : return "November";
            case 12 : return "December";
            default:return "Invalid Number";
        }
    }
     static void operatorProgram(int a,int b, int c){
        int operation1=a+b*c;
        int operation2=c+a/b;
         int operation3=a%b+c;
         int operation4=a*b+c;
         if(a>=b&&a>=c){
             System.out.println(a);
         }else{
             if(b>=c){
                 System.out.println(b);
             }else{
                 System.out.println(c);
             }
         }
         if(a<=b&&a<=c){
             System.out.println(a);
         }else{
             if(b<=c){
                 System.out.println(b);
             }else{
                 System.out.println(c);
             }
         }
     }

}
