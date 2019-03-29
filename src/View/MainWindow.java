package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {

    public JPanel getWindow() {
        ta_ColorText.setText("#000000");
        return window;
    }

    public void setWindow(JPanel window) {
        this.window = window;
    }

    private JPanel window;

    public JButton getBtn_GenerateColor() {
        return btn_GenerateColor;
    }

    private JButton btn_GenerateColor;

    public JTextArea getTa_ColorText() {
        return ta_ColorText;
    }

    private JTextArea ta_ColorText;

    public JButton getBtn_ChangeMode() {
        return btn_ChangeMode;
    }

    private JButton btn_ChangeMode;

}
