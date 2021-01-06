package ru.vsu.kudinov.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import ru.vsu.kudinov.common.SorterList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tests
{
    @Test

    public void test1()
    {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));

        List<Integer> sortedList = SorterList.createNewList(list1, list2);
        List<Integer> resultList = new ArrayList<>(Arrays.asList(1, 5, 2, 4, 3, 3, 4, 2, 5, 1));

        Assertions.assertEquals(sortedList, resultList);
    }

    @Test
    public void test2()
    {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(12, 77, 728, 21, 3, 2, 2, 1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(98, 55, 444, 2, 3, 87, 12, 2));

        List<Integer> sortedList = SorterList.createNewList(list1, list2);
        List<Integer> resultList = new ArrayList<>(Arrays.asList(12, 98, 77, 55, 728, 444, 21, 2, 3, 3, 2, 87, 2, 12, 1, 2));

        Assertions.assertEquals(sortedList, resultList);
    }

    @Test
    public void test3()
    {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(76, 5, 2, 11, 11, 67, 5, 4, 9, 0));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1));

        List<Integer> sortedList = SorterList.createNewList(list1, list2);
        List<Integer> resultList = new ArrayList<>(Arrays.asList(76, 1, 5, 2, 2, 3, 11, 4, 11, 5, 67, 5, 5, 4, 4, 3, 9, 2, 0, 1));

        Assertions.assertEquals(sortedList, resultList);
    }

    @Test
    public void test4()
    {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(-9, 8, -7, 6, 0, 0, 0, 0));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 1, 2, 3, 4));

        List<Integer> sortedList = SorterList.createNewList(list1, list2);
        List<Integer> resultList = new ArrayList<>(Arrays.asList(-9, 0, 8, 0, -7, 0, 6, 0, 0, 1, 0, 2, 0, 3, 0, 4));

        Assertions.assertEquals(sortedList, resultList);
    }

    @Test
    public void test5()
    {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(5, 55, 44, 4, 87, 78, 12, 14));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(22, 2, 3, 33, 667, 98, 17, 87));

        List<Integer> sortedList = SorterList.createNewList(list1, list2);
        List<Integer> resultList = new ArrayList<>(Arrays.asList(5, 22, 55, 2, 44, 3, 4, 33, 87, 667, 78, 98, 12, 17, 14, 87));

        Assertions.assertEquals(sortedList, resultList);
    }
    


}
