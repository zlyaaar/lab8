
package insertionsort;


public class InsertionSort {

    
    public void insertionSortAscending(int[] arr){
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int currentElement = arr[i]; 
            int j;
            for(j=i-1;j>=0 && arr[j]>currentElement;j--){ 
                arr[j + 1] = arr[j]; 
            } 
            arr[j + 1] = currentElement; 
        } 
    }
    
    public void printArray(int arr[]){
         int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    }
}
