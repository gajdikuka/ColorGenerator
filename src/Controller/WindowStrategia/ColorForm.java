package Controller.WindowStrategia;

import View.ColorWindow;

import javax.swing.*;

public class ColorForm extends FormStrategia{

    private ColorWindow cw = new ColorWindow();
    private JFrame frame = new JFrame("RandomColor");
    @Override
    public JFrame getFrame() {
        frame.setContentPane(cw.getWindow());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        return frame;
    }

    @Override
    public ColorWindow getWindow() {
        return cw;
    }

}
