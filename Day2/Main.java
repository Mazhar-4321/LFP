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
            rev+=rev*10+n%10;
            n=n/10;
        }
        System.out.println(rev);;
    }
}
