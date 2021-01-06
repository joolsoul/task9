package ru.vsu.kudinov.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ArrayListUtils
{
    public static List<Integer> stringToArrayList(String line)
    {
        Scanner scanner = new Scanner(line);
        scanner.useLocale(Locale.ROOT);
        scanner.useDelimiter("(\\s|[,;])+");
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext())
        {
            list.add(scanner.nextInt());
        }
        return list;
    }
}



