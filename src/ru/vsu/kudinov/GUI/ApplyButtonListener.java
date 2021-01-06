package ru.vsu.kudinov.GUI;

import ru.vsu.kudinov.common.SorterList;
import ru.vsu.kudinov.utils.ArrayListUtils;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ApplyButtonListener implements ActionListener
{
    JTextField inputListField1;
    JTextField inputListField2;
    JTextField outputResultField;

    public ApplyButtonListener(JTextField inputListField1, JTextField inputListField2, JTextField outputResultField)
    {
        this.inputListField1 = inputListField1;
        this.inputListField2 = inputListField2;
        this.outputResultField = outputResultField;

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String stringList1 = inputListField1.getText();
        String stringList2 = inputListField2.getText();

        List<Integer> list1 = ArrayListUtils.stringToArrayList(stringList1);
        List<Integer> list2 = ArrayListUtils.stringToArrayList(stringList2);

        List<Integer> sortedList = SorterList.createNewList(list1, list2);

        this.outputResultField.setText(sortedList.toString());


    }
}
