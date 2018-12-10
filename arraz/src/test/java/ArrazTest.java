import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrazTest {

    Arraz arraz = new Arraz();

    Integer[] array1;
    Integer[] array2;
    double[] array3;
    double[] array4;
    Integer[] array5;
    double[] doubles;

    @Before
    public void setup(){
        array1 = new Integer[]{1, 2, 3, 4, 5};
        array2 = new Integer[]{6,7,8,9,10};
        array3 = new double[]{2.5,3.14,1.5};
        array4 = new double[]{1.1,1.2,1.3};
        array5 = new Integer[]{5, 10, 3, 29, 42};
        doubles = new double[]{1.2, 1.3, 1.4, 1.4};
    }

    @Test
    public void test1sumValuesOfArray(){
        int actual = arraz.sumValuesOfArray(array1);
        int expected = 15;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2sumValuesOfArray(){
        int actual = arraz.sumValuesOfArray(array2);
        int expected = 40;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1sumDoublesOfArray(){
        double actual = arraz.sumDoublesOfArray(array3);
        double expected = 7.14;

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void test2sumDoublesOfArray(){
        double actual = arraz.sumDoublesOfArray(array4);
        double expected = 3.6;

        Assert.assertEquals(expected, actual, 2);
    }

    @Test
    public void test1averageOfArray(){
        Integer actual = arraz.averageOfArray(array1);
        Integer expected = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2averageOfArray(){
        Integer actual = arraz.averageOfArray(array2);
        Integer expected = 8;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test1doubleAverageOfArray(){
        Double actual = arraz.doubleAverageOfArray(array3);
        Double expected = 2.38;

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void test2doubleAverageOfArray(){
        Double actual = arraz.doubleAverageOfArray(array4);
        Double expected = 1.2;

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testContainsValue(){
        Assert.assertTrue(arraz.containsValue(array1, 1));
    }

    @Test
    public void test2ContainsValue(){
        Assert.assertFalse(arraz.containsValue(array1, 6));
    }

    @Test
    public void testReverseArray(){
        Integer[] actual = arraz.reverseArray(array1);
        Integer[] expected = {5,4,3,2,1};

        for(int i = 0; i<array1.length; i++) {
            Assert.assertEquals(actual[i], expected[i]);
        }
    }

    @Test
    public void test2ReverseArray(){
        Integer[] actual = arraz.reverseArray(array2);
        Integer[] expected = {10,9,8,7,6};

        for(int i = 0; i<array1.length; i++) {
            Assert.assertEquals(actual[i], expected[i]);
        }
    }

    @Test
    public void testGetOddEvensOfArray(){
        OddEven actual = arraz.getOddEvensOfArray(array1);
        int actualOdds = actual.getOdds();
        int actualEvens = actual.getEvens();

        int expectedOdds = 3;
        int expectedEvens = 2;

        Assert.assertEquals(expectedEvens, actualEvens);
        Assert.assertEquals(expectedOdds, actualOdds);
    }

    @Test
    public void test2GetOddEvensOfArray(){
        OddEven actual = arraz.getOddEvensOfArray(array2);
        int actualOdds = actual.getOdds();
        int actualEvens = actual.getEvens();

        int expectedOdds = 2;
        int expectedEvens = 3;

        Assert.assertEquals(expectedEvens, actualEvens);
        Assert.assertEquals(expectedOdds, actualOdds);
    }

    @Test
    public void testFindIndexOf(){
        int actual = arraz.findIndexOf(array1, 1);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2FindIndexOf(){
        int actual = arraz.findIndexOf(array1, 3);
        int expected = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3FindIndexOf(){
        int actual = arraz.findIndexOf(array1, 8);
        int expected = -1;

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testCopyArrayByIterator(){
        Integer[] actualCopy = arraz.copyArrayByIterator(array1);
        Integer[] expectedCopy = array1.clone();

        for(int i = 0; i<array1.length; i++) {
            Assert.assertEquals(actualCopy[i], expectedCopy[i]);
        }
    }

    @Test
    public void test2CopyArrayByIterator(){
        Integer[] actualCopy = arraz.copyArrayByIterator(array1);
        Integer[] expectedCopy = array1.clone();

        Assert.assertTrue(Arrays.equals(expectedCopy, actualCopy));
    }

    @Test
    public void testCopyArrayByLoop(){
        Integer[] actualCopy = arraz.copyArrayByLoop(array1);
        Integer[] expectedCopy = array1.clone();

        for(int i = 0; i<array1.length; i++) {
            Assert.assertEquals(actualCopy[i], expectedCopy[i]);
        }
    }

    @Test
    public void test2CopyArrayByLoop(){
        Integer[] actualCopy = arraz.copyArrayByLoop(array1);
        Integer[] expectedCopy = array1.clone();

        Assert.assertTrue(Arrays.equals(expectedCopy, actualCopy));
    }

    @Test
    public void testRemoveElementFromArray(){
        Integer[] actual = arraz.removeElementFromArray(array1, 1);
        Integer[] expected = {2,3,4,5};

        Assert.assertTrue(Arrays.equals(actual, expected));
    }

    @Test
    public void test2RemoveElementFromArray(){
        Integer[] actual = arraz.removeElementFromArray(array2,6);
        Integer[] expected = {7,8,9,10};

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void testNumberOfOccurrences(){
        int actual = arraz.numberOfOccurrences(array1, 1);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInsertIntoArrayAt(){
        Integer[] actual = arraz.insertIntoArrayAt(array1, 3,3);
        Integer[] expected = {1,2,3,3,4,5};

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test2InsertIntoArrayAt(){
        Integer[] actual = arraz.insertIntoArrayAt(array2, 9,0);
        Integer[] expected = {9,6,7,8,9,10};

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void testFindMaxMinOfArray(){
        MaxMin actual = arraz.findMaxMinOfArray(array5);
        int actualMax = actual.getMax();
        int actualMin = actual.getMin();

        int expectedMax = 42;
        int expectedMin = 3;

        Assert.assertEquals(expectedMax, actualMax);
        Assert.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void test2FindMaxMinOfArray() {
        MaxMin actual = arraz.findMaxMinOfArray(array2);
        int actualMax = actual.getMax();
        int actualMin = actual.getMin();

        int expectedMax = 10;
        int expectedMin = 6;

        Assert.assertEquals(expectedMax, actualMax);
        Assert.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void testFind2ndLargestValueFromArray(){
        double actual = arraz.find2ndLargestFromArray(array3);
        double expected = 2.5;

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void test2Find2ndLargestValueFromArray(){
        double actual = arraz.find2ndLargestFromArray(doubles);
        double expected = 1.3;

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testMakeMeAnArrayList(){
        ArrayList<Integer> acutalList = arraz.makeMeAnArrayList(array1);
        ArrayList<Integer> expected = new ArrayList<Integer>(5);
        for(Integer i: array1){
            expected.add(i);
        }


        Assert.assertTrue(acutalList.equals(expected));
    }

    @Test
    public void testCheck2ArraysForEqual(){
        boolean boo = arraz.check2ArraysForEquals(array1, array1);
        Assert.assertTrue(boo);
    }

    @Test
    public void test2Check2Arrays(){
        boolean boo = arraz.check2ArraysForEquals(array2, array1);
        Assert.assertFalse(boo);
    }

    @Test
    public void testAverageArrayWithoutMaxMin(){
        int actualAvg = arraz.averageOfArrayWithoutMaxMin(array1);
        int expectedAvg = 3;

        Assert.assertEquals(expectedAvg, actualAvg);
    }

    @Test
    public void test2AverageArrayWOutMaxMin(){
        int actual = arraz.averageOfArrayWithoutMaxMin(array5);
        int expected = 14;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrayHas65and77(){
        Integer[] array6577 = {65, 77};
        Assert.assertTrue(arraz.contains65and77(array6577));
    }

    @Test
    public void test2ArrayHas65and77(){
        Assert.assertFalse(arraz.contains65and77(array1));
    }

    @Test
    public void testTheTotalOfTensIs30(){
        Integer[]array10 = {10, 10, 10};
        Assert.assertTrue(arraz.theTotalOfTensIs30(array10));
    }

    @Test
    public void test2TotalOfTensIs30(){
        Integer[]array11 = {5, 10, 15, 10, 25, 10, 35, 10};
        Assert.assertFalse(arraz.theTotalOfTensIs30(array11));
    }

    @Test
    public void testSmallestAndSecondSmallest(){
        Integer[] expected = {1,2};
        Integer[] actual = arraz.smallestAndSecondSmallest(array1);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test2SmallestAndSecondSmallest(){
        Integer[] arr = {1,1,2,3};
        Integer[] expected = {1,2};
        Integer[] actual = arraz.smallestAndSecondSmallest(arr);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void testMakeMeACopyPlease(){
        Integer[] expected = {5,4,3,2,1};
        Integer[] actual = arraz.makeMeACopyPlease(array1);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test2MakeMeACopyPlease(){
        Integer[] expected = {10,9,8,7,6};
        Integer[] actual = arraz.makeMeACopyPlease(array2);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void testRemoveLastItemAndCopy(){
        Integer[] expected = {1,2,3,4};
        Integer[] actual = arraz.removeLastItemAndCopy(array1);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test2RemoveLastItemAndCopy(){
        Integer[] expected = {6,7,8,9};
        Integer[] actual = arraz.removeLastItemAndCopy(array2);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void testRemoveFirstItemAndCopy(){
        Integer[] expected = {7,8,9,10};
        Integer[] actual = arraz.removeFirstItemAndCopy(array2);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test2RemoveFirstItemAndCopy(){
        Integer[] expected = {2,3,4,5};
        Integer[] actual = arraz.removeFirstItemAndCopy(array1);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void testInsertAtStartAndCopy(){
        Integer[] expected = {5,6,7,8,9,10};
        Integer[] actual = arraz.insertAtStartAndCopy(array2, 5);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test2InsertAtStartAndCopy(){
        Integer[] expected = {5,1,2,3,4,5};
        Integer[] actual = arraz.insertAtStartAndCopy(array1, 5);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void testSortArrayIntoEvensThenOdds(){
        Integer[] expected = {2,4,1,3,5};
        Integer[] actual = arraz.sortArrayIntoEvensThenOdds(array1);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test2SortArrayIntoEvensThenOdds(){
        Integer[] expected = {6,8,10,7,9};
        Integer[] actual = arraz.sortArrayIntoEvensThenOdds(array2);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

}