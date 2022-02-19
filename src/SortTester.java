import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {-6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19, -20, -21, -23, -24, -25};
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {-6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19, -20, -21, -23, -24, -25};
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));

    /* SORT METHOD IN ARRAYS CLASS */
    int[] arr3 = {-4, 5, 8, 79, 0, -56, -13, 86, 99, 31, -90};
    Arrays.sort(arr3);
    System.out.println(Arrays.toString(arr3));

    /* DESCENDING SELECTION SORT */
    int[] arr4 = {-6, 7, 9, 4, -19, -13, -98, -71, 8, 34, 12, 18, -80, -15};
    Sort.selectionSortDescending(arr4);
    System.out.println(Arrays.toString(arr4));

    /* DESCENDING INSERTION SORT */
    int[] arr5 = {-6, 7, 9, 4, -19, -13, -98, -71, 8, 34, 12, 18, -80, -15};
    Sort.insertionSortDescending(arr5);
    System.out.println(Arrays.toString(arr5));
  }
}
