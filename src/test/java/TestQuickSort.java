import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertThrows;


public class TestQuickSort {

    static int[] numbers = {4, 8, 1, 3, 0, 2, 8, 8, 9, 5, 3};
    static int[] sortedA = {0, 1, 2, 3, 3, 4, 5, 8, 8, 8, 9};


    @Test
    public void testSeparation() {
        int[] sortedForLastElement = {1, 3, 0, 2, 3, 8, 8, 8, 9, 5, 4};
        QuickSort.separation(numbers, 0, numbers.length - 1);
        Assertions.assertEquals(Arrays.toString(numbers), Arrays.toString(sortedForLastElement));
    }

    @Test
    public void testQuickSort() {
        QuickSort.quickSort(numbers, 0, numbers.length - 1);
        Assertions.assertEquals(Arrays.toString(numbers), Arrays.toString(sortedA));
    }

    @Test
    public void testQuickSortBlank() {
        int[] numbersNull = {};
        Exception exception = assertThrows(NullPointerException.class,
                ()->QuickSort.quickSort(numbersNull, 0, numbersNull.length - 1));
        Assertions.assertEquals("Array not be a blank",exception.getMessage());
    }
}
