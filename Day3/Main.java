package LFP.Day3;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        largestElementOfArray(arr);
        smallestElementOfArray(arr);
    }
    static void elementsOfArray(int[] arr){
        for(int x:arr){
            System.out.println(x+" ");
        }
    }
    static void frequencyOfElements(int[] arr){
        for(int i=0;i<arr.length;i++){
            int c=0;
            if(arr[i]==-1)
                continue;
            for(int j=i+1;j<arr.length;j++ ){
                if(arr[i]==arr[j]){
                    c++;
                    arr[j]=-1;
                }
            }
            System.out.println(arr[i]+"=>"+c);
        }
    }
    static void largestElementOfArray(int[] arr){
        int max=arr[0];
                for(int x: arr){
                    if(x>max){
                        max=x;
                    }
                }
        System.out.println("max="+max);
    }
    static void smallestElementOfArray(int[] arr){
        int min=arr[0];
        for(int x: arr){
            if(x<min){
                min=x;
            }
        }
        System.out.println("min="+min);
    }
}
