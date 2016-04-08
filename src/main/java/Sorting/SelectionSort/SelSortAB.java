package Sorting.SelectionSort;

/**
 * Created by aswathyn on 07/04/16.
 */
public class SelSortAB {
    private int arraySize;
    private int[] numArray;

    public SelSortAB(int num) {
        arraySize=0;
        numArray = new int[num];
    }

    public void insert(int number) {
        numArray[arraySize] = number;
        arraySize++;
    }

    public void display(){
        for(int i =0;i < arraySize;i++) {
            System.out.print(numArray[i]+",");
        }
        System.out.println();
    }

    public void selectionSort(){
        int outer,inner,minimum;

        for(outer =0; outer < arraySize-1;outer++) {
            minimum = outer;
            for(inner=outer+1;inner<arraySize;inner++) {
                if (numArray[inner] < numArray[minimum]) {
                    minimum = inner;
                }
            }
            swap(outer,minimum);
        }
    }

    private void swap(int outer,int minimum) {
        int temp = numArray[outer];
        numArray[outer] =numArray[minimum];
        numArray[minimum] = temp;
    }
 }
