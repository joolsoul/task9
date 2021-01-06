package ru.vsu.kudinov.console;

import ru.vsu.kudinov.common.SorterList;
import ru.vsu.kudinov.utils.FileUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ConsoleMain {

    public static void main(String[] args) throws IOException
    {
       List<Integer> list1 = new ArrayList<>();
       List<Integer> list2 = new ArrayList<>();

       String inputFileName = readFileName("input");
       FileUtils.readFile(list1, list2, inputFileName);

       List<Integer> sortedList = SorterList.createNewList(list1, list2);

       String outputFileName = readFileName("output");
       FileUtils.writeFile(sortedList, outputFileName);

       printResult(list1, list2, sortedList);

    }

    private static String readFileName(String typeOfTheFile)
    {
        String fileName;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the name of the %s file: ", typeOfTheFile);
        fileName = in.next();

        return fileName;
    }

    private static void printResult(List<Integer> list1, List<Integer> list2, List<Integer> sortedList)
    {
        System.out.println("\n" + "Input list 1: " + list1 + "\n" + "Input list 2: " + list2 + "\n" +
                "The sorted list: " + sortedList);
    }
}
