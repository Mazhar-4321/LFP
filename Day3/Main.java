package LFP.Day3;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        largestElementOfArray(arr);
        smallestElementOfArray(arr);
        elementsAtEvenPosition(arr);
        elementsOfArrayInReverseOrder(arr);
        elementsAtOddPosition(arr);
        duplicateElementsOfArray(arr);
        sortElementsOfArray(arr);;
    }
    static void elementsOfArray(int[] arr){
        for(int x:arr){
            System.out.println(x+" ");
        }
    }
    static void elementsOfArrayInReverseOrder(int[] arr){
        for(int i=arr.length-1;i>=0;i--)
            System.out.println(arr[i]);
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
    static void elementsAtEvenPosition(int[] arr){
        int c=0;
        for(int x: arr){
           if(c%2==0){
               System.out.println(x);
           }
           c++;
        }

    }
    static void elementsAtOddPosition(int[] arr){
        int c=0;
        for(int x: arr){
            if(c%2==1){
                System.out.println(x);
            }
            c++;
        }

    }
    static void duplicateElementsOfArray(int[] arr){
        for(int i=0;i< arr.length;i++){
            boolean flag=false;
            if (arr[i]==-1)
                continue;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=-1;
                    flag=true;
                }
            }
            if(flag){
                System.out.print(arr[i]+" ");
            }
        }
    }
    static void sortElementsOfArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minP=i,minValue=arr[i];
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<minValue){
                    minP=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minP];
            arr[minP]=temp;
        }
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}
