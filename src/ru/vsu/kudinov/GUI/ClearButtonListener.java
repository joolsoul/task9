package ru.vsu.kudinov.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearButtonListener implements ActionListener
{
    private JTextField inputArrayListField1;
    private JTextField inputArrayListField2;
    private JTextField outputResultField;


    public ClearButtonListener(JTextField inputArrayListField1, JTextField inputArrayListField2, JTextField outputResultField)
    {
        this.inputArrayListField1 = inputArrayListField1;
        this.inputArrayListField2 = inputArrayListField2;
        this.outputResultField = outputResultField;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        inputArrayListField1.setText(null);
        inputArrayListField2.setText(null);
        outputResultField.setText(null);
    }



}
