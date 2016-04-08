package Sorting.QuickSort;

import org.testng.annotations.Test;

/**
 * Created by aswathyn on 08/04/16.
 */
public class TestQuickSortAB {

    QuickSortAB quickSortAB;

    @Test
    public void quickTest() throws Exception {
        quickSortAB = new QuickSortAB(9);

        quickSortAB.insert(4);
        quickSortAB.insert(2);
        quickSortAB.insert(3);
        quickSortAB.insert(5);
        quickSortAB.insert(6);
        quickSortAB.insert(9);
        quickSortAB.insert(1);
        quickSortAB.insert(8);
        quickSortAB.insert(16);

        quickSortAB.display();
        quickSortAB.sort();
        System.out.println("After sorting: ");
        quickSortAB.display();
    }



 }
