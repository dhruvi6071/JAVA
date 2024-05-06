package practical_2;

import java.util.*;
import java.lang.reflect.Array;

public class three {
    public static void sortArr(int arr[]) {
        for(int i=0; i<=arr.length; i++){
            if(arr[i]<arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int arr[] = {0,1, 3, 5, 4, 3, 2, 1, 0, 8, 1, 3, 2};
        
        int count = 0;
        printArr(arr);
        Arrays.sort(arr);
        printArr(arr);

        for(int i = 1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                count++;
            }
        }

        int[] newArr = new int[count];
        int i =1;
        int j = 0;
        while(i<arr.length){
            if(arr[i-1] != arr[i]){
                newArr[j] = arr[i];
            i++;
            j++;
            }
            else{
                i++;
            }
            
        }
        printArr(newArr);
    }
}
