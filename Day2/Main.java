package LFP.Day2;

public class Main {
    public static void main(String[] args) {

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

}
