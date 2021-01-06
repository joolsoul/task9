package ru.vsu.kudinov.common;

import java.util.ArrayList;
import java.util.List;

public class SorterList
{
    public static List<Integer> createNewList(List<Integer> list1, List<Integer> list2)
    {
        List<Integer> sortedList = new ArrayList<>();

        if(list1.size() == list2.size())
        {
            for (int i = 0; i < list1.size(); i++)
            {
                sortedList.add(i * 2, list1.get(i));
                sortedList.add(i * 2 + 1, list2.get(i));
            }
        }

        if(list1.size() > list2.size())
        {
            for (int i = 0; i < list2.size(); i++)
            {
                sortedList.add(i * 2, list1.get(i));
                sortedList.add(i * 2 + 1, list2.get(i));
            }

            for (int j = list2.size(); j < list1.size(); j++)
            {
                sortedList.add(j, list1.get(j));
            }
        }

        if(list2.size() > list1.size())
        {
            for (int i = 0; i < list1.size(); i++)
            {
                sortedList.add(i * 2, list1.get(i));
                sortedList.add(i * 2 + 1, list2.get(i));
            }

            for (int j = list1.size(); j < list2.size(); j++)
            {
                sortedList.add(j, list2.get(j));
            }
        }
        return sortedList;
    }
}
