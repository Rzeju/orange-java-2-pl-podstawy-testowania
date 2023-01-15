package pl.sda.zad16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pl.sda.zad16.TheLongestSeries.findSizeOfTheLongestGrowingSeries;

public class TheLongestSeriesTest {


    @Test
    void findSizeOfTheLongestGrowingSeriesForCorrectValues() {

        //given
        int[] numbers = {1, 3, 8, 4, 2, 5, 6, 11, 13, 15};

        //when
        int result = findSizeOfTheLongestGrowingSeries(numbers);

        //then
        assertEquals(6, result);
    }

    @Test
    void findSizeOfTheLongestGrowingSeriesForNullInput() {
        //given
        int[] numbers = null;

        //when
        int result = findSizeOfTheLongestGrowingSeries(numbers);

        //then
        assertEquals(0, result);
    }

    @Test
    void findSizeOfTheLongestGrowingSeriesForShorArray() {

        //given
        int[] numbers_1 = {1, 2};
        int[] numbers_2 = {3, 2};
        int[] numbers_3 = {2};
        int[] numbers_4 = {1, 2, 3};
        int[] numbers_5 = {5, 3, 2};

        //when
        int result_1 = findSizeOfTheLongestGrowingSeries(numbers_1);
        int result_2 = findSizeOfTheLongestGrowingSeries(numbers_2);
        int result_3 = findSizeOfTheLongestGrowingSeries(numbers_3);
        int result_4 = findSizeOfTheLongestGrowingSeries(numbers_4);
        int result_5 = findSizeOfTheLongestGrowingSeries(numbers_5);

        //then
        assertEquals(2, result_1);
        assertEquals(1, result_2);
        assertEquals(1, result_3);
        assertEquals(3, result_4);
        assertEquals(1, result_5);
    }
}
