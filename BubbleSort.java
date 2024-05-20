// import java.lang.*;
import java.util.Scanner;
public class BubbleSort
 {  
    static void bubbleSort(int[] arr)
    {  
        int n=arr.length;  
        int temp=0; 
       

        for(int i=0;i<(n-1);i++)
          {  
             for(int j=1;j<n;j++)
                   {
                          if(arr[j-1]>arr[j])
                              {  
                                 temp=arr[j-1];  
                                 arr[j-1]=arr[j];  
                                 arr[j]=temp;  
                              }  
                   }  
          }  
    }  
    public static void main(String[] args)
    {  
        int arr[]={3,60,35,2,45,320,5};  
        System.out.print("Array Before Bubble Sort: ");  
        for(int i=0;i<arr.length;i++)
        {  
           System.out.print(arr[i] + " ");  
        }  
           System.out.println();  
           bubbleSort(arr);//sorting array elements using bubble sort  
           System.out.print("Array After Bubble Sort:  ");  
           for(int i=0;i<arr.length;i++)
           {  
              System.out.print(arr[i] + " ");  
           }  
    }  
}
