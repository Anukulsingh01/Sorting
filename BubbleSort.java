package Sorting;

import java.util.Arrays;

public class BubbleSort {
     public static void main(String[] args) {
        int[] arr={12,34,5,6,78,9};
        Bubblesort(arr);
       System.out.println(Arrays.toString(arr));

    }
   
    static void Bubblesort(int[]arr){
        boolean swapped;
        int n=arr.length;
           for(int i=0; i<n;i++){
            swapped=false;
                for(int j=1;j<n-i;j++){
                    if(arr[j-1]>arr[j]){
                        int temp =arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=temp;
                        swapped=true;
                    }
                }
                if(!swapped){
                    break;
                }
           }
    }
}
