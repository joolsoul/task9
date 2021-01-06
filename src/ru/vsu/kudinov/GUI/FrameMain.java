package ru.vsu.kudinov.GUI;

import javax.swing.*;
import java.awt.*;

public class FrameMain extends JFrame
{
    private JPanel mainPanel;
    private JTextField inputArrayListField1;
    private JButton applyButton;
    private JButton clearButton;
    private JTextField inputArrayListField2;
    private JTextField outputResultField;

    public FrameMain()
    {
        super("task 9");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 500, 500, 250);
        this.setMinimumSize(new Dimension(500, 130));
        setVisible(true);

        applyButton.addActionListener(new ApplyButtonListener(inputArrayListField1, inputArrayListField2, outputResultField));
        clearButton.addActionListener(new ClearButtonListener(inputArrayListField1, inputArrayListField2, outputResultField));
    }
}
