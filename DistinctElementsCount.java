import java.util.*;

public class DistinctElementsCount { 

    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];

        Arrays.fill(visited, false);
        System.out.println("Count of distinct elements:");

        
        for (int i = 0; i < n; i++) {
            
            if (visited[i] == true)
                continue;
            
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // takinf elements here

        System.out.print("Enter Array size:");
        int size = sc.nextInt();

        int[] firstArray = new int[size];
        int[] secondArray = new int[size];
        
        //entering elements into an array 1 

        System.out.print("Enter elements into firstArray:");
        for (int i = 0; i < size; i++)
            firstArray[i] = sc.nextInt();


        // array 2 Elements
        System.out.print("Enter elements into secondArray:");
        for (int i = 0; i < size; i++)
            secondArray[i] = sc.nextInt();

        int fal = firstArray.length; 
        int sal = secondArray.length; 
        int[] result = new int[fal + sal]; 
        System.arraycopy(firstArray, 0, result, 0, fal);
        System.arraycopy(secondArray, 0, result, fal, sal);

        int n = result.length;
        countFreq(result, n);
    }
}
