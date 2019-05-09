
package insertionsort;


public class InsertionSortTest {
    public static void main(String[] args) {
        InsertionSort b=new InsertionSort();
        int[] arr={10,34,2,56,7,67,88,42};
        b.insertionSortAscending(arr);
        System.out.println("Sorted array:");
        b.printArray(arr);
    }
}
