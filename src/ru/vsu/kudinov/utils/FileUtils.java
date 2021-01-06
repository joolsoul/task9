package ru.vsu.kudinov.utils;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class FileUtils
{
    public static void readFile(List<Integer> list1, List<Integer> list2, String fileName)
    {
        File input = new File("src\\ru\\vsu\\kudinov\\files\\" + fileName);

        try
        {
            Scanner scannerOfTheFile = new Scanner(input);

            Scanner scannerOfTheLine = new Scanner(scannerOfTheFile.nextLine());
            while (scannerOfTheLine.hasNextInt())
            {
                list1.add(scannerOfTheLine.nextInt());
            }

            scannerOfTheLine = new Scanner(scannerOfTheFile.nextLine());
            while (scannerOfTheLine.hasNextInt())
            {
                list2.add(scannerOfTheLine.nextInt());
            }

            scannerOfTheFile.close();
        }
        catch (FileNotFoundException e)
        {
            System.err.println("File not found");
            System.exit(1);
        }
    }

    public static void writeFile(List<Integer> sortedList, String fileName) throws IOException
    {
        FileWriter outputFile = new FileWriter("src\\ru\\vsu\\kudinov\\files\\" + fileName);
        outputFile.write(String.valueOf(sortedList));
        outputFile.close();
    }


}
