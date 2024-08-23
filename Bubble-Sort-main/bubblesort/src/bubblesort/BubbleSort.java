package bubblesort;

public class BubbleSort {

		// TODO Auto-generated method stub
		 public static void bubbleSort(int[] args) {
		        int n = args.length;
		        boolean swapped;

		        for (int i = 0; i < n - 1; i++) {
		            swapped = false;

		            for (int j = 0; j < n - 1 - i; j++) {
		                if (args[j] > args[j + 1]) {
		                   
		                    int temp = args[j];
		                    args[j] = args[j + 1];
		                    args[j + 1] = temp;

		                    swapped = true;
		                }
		            }

		           
		            if (!swapped) {
		                break;
		            }
		        }
		    }

		    // Method to print the array
		    public static void printArray(int[] args) {
		        for (int i : args) {
		            System.out.print(i + " ");
		        }
		        System.out.println();
		    }

		    // Main method to test the bubble sort
		    public static void main(String[] args) {
		        int[] arr = {64, 34, 25, 12, 22, 11, 90};
		        System.out.println("Unsorted array:");
		        printArray(arr);

		        bubbleSort(arr);

		        System.out.println("Sorted array:");
		        printArray(arr);
		    }
		
	}


