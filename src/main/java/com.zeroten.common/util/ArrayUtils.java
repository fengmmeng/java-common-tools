package com.zeroten.common.util;

public class ArrayUtils {

    public static int[] sort(int[] arr){
        if(arr !=null && arr.length !=0){
            int tmp ;
            for(int i=0;i< arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++ ){
                    if(arr[i] > arr[j]){
                        tmp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = tmp;
                    }
                }
            }
            return arr;
        }
        return arr;
    }
}
