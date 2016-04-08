package Sorting.QuickSort;

/**
 * Created by aswathyn on 08/04/16.
 */
public class QuickSortAB {

    private int[] array;
    private int len;
    private int[] input;

    public QuickSortAB(int num) {
        len=0;
        array = new int[num];
    }

    public void display() {
        for(int i =0;i < len;i++) {
            System.out.print(array[i]+",");
        }
        System.out.println();
    }

    public void insert(int number) {
        array[len] = number;
        len++;
    }

    public void sort() {
        this.input = array;
        int length = len;
        quickSort(0,length-1);
    }

    public void quickSort(int low , int high) {
        int i= low;
        int j = high;

        /* Pivot is the arbitary middle value from where array is split into 2 .
        *
         */
        int pivot = input[low + (high -low) / 2];

        /*
        * While loop for organizing all values less than pivot to left and greater than pivot to right
         */
        while(i <=j) {
            while (input[i] < pivot) {
                i++;
            }
            while(input[j] > pivot) {
                j--;
            }

            if(i<=j) {
                swap(i,j);
                i++;
                j--;
            }
        }

        /*
        * Changing the array to be sorted when i and j cross each other and array splits into 2.
         */
        if(low < j) {
            quickSort(low , j);
        }

        if(i < high) {
            quickSort(i , high);
        }
    }

    public void swap(int i , int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j]= temp;
    }


}
