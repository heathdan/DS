package Sorting.BubbleSort;

/**
 * Created by aswathyn on 06/04/16.
 */
public class BubbleSortAB {
    public int[] numArray;
    public int arraySize;

    public BubbleSortAB(int number) {
        numArray = new int[number];
        arraySize = 0;
    }

    public void insert(int num) {
        numArray[arraySize] = num;
        arraySize++;
    }

    public void showArray() {
        for (int i=0;i<arraySize;i++) {
            System.out.println(numArray[i]);
        }
    }

    public void bubbleSort() {
        int outer,inner;

        for(outer= 0; outer <arraySize-1;outer++) {
            for(inner=0;inner< arraySize-outer-1; inner++) {
                if(numArray[inner]> numArray[inner+1]) {
                    swap(inner, inner+1) ;
                }
            }

        }
    }

    public void swap(int first, int second) {
        int temp = numArray[first];
        numArray[first] = numArray[second];
        numArray[second]= temp;
    }


}
