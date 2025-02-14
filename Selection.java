package Sorting;

import java.util.Arrays;

public class Selection {
        public static void main(String[] args) {
        int[] arr={12,34,5,6,78,9};
        Selection(arr);
       System.out.println(Arrays.toString(arr));

    }
    static void Selection(int[]arr){
        for (int i=0;i<arr.length;i++){
            int last= arr.length-i-1;
            int maxIndex= getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int []arr,int First,int Second){
            int temp =arr[First];
            arr[First]=arr[Second];
            arr[Second]=temp;
    }
     static int getMaxIndex(int[]arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
          if(arr[max]<arr[i]){
            max=i;
          }
        }
        return max;
    }
    
}
