package com.data.structure;




public class LinearSearchAndBinarySearch {

    // linearSearch
    public static int linearSearch(int [] a, int value){
        for(int i=0; i< a.length; i++){
            if(a[i] == value    ){
                return i;
            }
        }
        return -1;
    }

    // binarySearch
    public static int binarySearch(int [] a, int value){
        int low = 0;
        int high = a.length - 1;
        while(low <= high){
            int mid = (low + high) /2;
            if(a[mid] == value){
                return mid;
            } else if(a[mid] > value){
                high = mid - 1;
            }else {
                low = mid  + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] myArray  =  {2,8,15,5,27,14,30,20};
        System.out.println(binarySearch(myArray, 30));


    }
}
