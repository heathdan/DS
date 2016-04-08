package Sorting.SelectionSort;


import org.testng.annotations.Test;

/**
 * Created by aswathyn on 08/04/16.
 */
public class TestSelSortAB {

    SelSortAB selSortAB;
//
//    @BeforeClass
//    public void setup() throws Exception {
//        System.out.println("Before Class");
//    }

    @Test
    public void selTest() throws Exception {
        selSortAB = new SelSortAB(10);
        selSortAB.insert(5);
        selSortAB.insert(3);
        selSortAB.insert(15);
        selSortAB.insert(8);
        selSortAB.insert(1);
        selSortAB.insert(9);
        selSortAB.insert(2);
        selSortAB.insert(6);
        selSortAB.insert(7);
        selSortAB.insert(0);

        System.out.println("Before:");
        selSortAB.display();

        selSortAB.selectionSort();

        System.out.println("After :");
        selSortAB.display();

    }
}
