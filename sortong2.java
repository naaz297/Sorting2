

import java.util.Scanner;
public class problem3{
    static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0 ; i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    static void  sortArrayByParity(int[]arr){
        int n=arr.length;
        int left=0 ,right=n-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }


    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter"+n+"Element");
        for(int i=0;i<n ;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("orignal array");
        printArray(arr);
        sortArrayByParity(arr);

        System.out.println("Sorted array");
        printArray(arr);
    }
}
