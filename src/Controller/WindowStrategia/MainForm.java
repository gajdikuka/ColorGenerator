package Controller.WindowStrategia;

import View.ColorWindow;
import View.MainWindow;

import javax.swing.*;
import java.awt.*;

public class MainForm extends FormStrategia{
    private MainWindow mw = new MainWindow();
    private JFrame frame = new JFrame("ColorPicker");

    @Override
    public JFrame getFrame() {
        frame.setContentPane(mw.getWindow());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        return frame;
    }

    @Override
    public MainWindow getWindow() {
        return mw;
    }
}
