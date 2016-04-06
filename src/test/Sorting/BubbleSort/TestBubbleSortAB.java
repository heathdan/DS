package Sorting.BubbleSort;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by aswathyn on 06/04/16.
 */
public class TestBubbleSortAB {
    BubbleSortAB bubbleSortAB;

    @BeforeClass
    public void beforeClass() throws Exception {
        System.out.println("@BeforeClass:");
    }

    @Test
    public void bubb1Test() throws Exception {
        bubbleSortAB = new BubbleSortAB(6);
        bubbleSortAB.insert(10);
        bubbleSortAB.insert(30);
        bubbleSortAB.insert(1);
        bubbleSortAB.insert(5);
        bubbleSortAB.insert(15);
        bubbleSortAB.insert(0);

        bubbleSortAB.showArray();

        bubbleSortAB.bubbleSort();
        System.out.println("Bubble Sort post sorting:");
        bubbleSortAB.showArray();

    }

    @Test
    public void bubb1TestFromCons6ole() throws Exception {

    }
}

