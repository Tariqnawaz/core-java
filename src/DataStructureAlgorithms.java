
public class DataStructureAlgorithms {
	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		BubbleSorting b = new BubbleSorting(input);
        b.bubble_srt(input);
	}
}

/* In sort - Sorting is to order the set of given numbers (lower to higher)*/
class BubbleSorting{
	public BubbleSorting(int[] array){
		bubble_srt(array);
	}
	
	public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }
    
	private static void swapNumbers(int i , int j , int[] array){
		int temp ;
		temp = array[i];
		array[i] = array[j];
		array[j] =temp;
	}
	
	private static void printNumbers(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
}

class MySelectionSort {
	 
    public static int[] doSelectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
     
    public static void main(String a[]){
         
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = doSelectionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}

/* Insertion of sort in java*/
class MyInsertionSort {
	 
    public static void main(String a[]){
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = doInsertionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
     
    public static int[] doInsertionSort(int[] input){
         
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}

/***********************************************************************************************************************************/
/* Write a program to implement Linear search or Sequential search algorithm.*/

class MyLinearSearch {
	 
    public static int linerSearch(int[] arr, int key){
         
        int size = arr.length;
        for(int i=0;i<size;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
     
    public static void main(String a[]){
         
        int[] arr1= {23,45,21,55,234,1,34,90};
        int searchKey = 34;
        System.out.println("Key "+searchKey+" found at index: "+linerSearch(arr1, searchKey));
        int[] arr2= {123,445,421,595,2134,41,304,190};
        searchKey = 421;
        System.out.println("Key "+searchKey+" found at index: "+linerSearch(arr2, searchKey));
    }
}
