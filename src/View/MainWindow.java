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
    public JButton btn_GenerateColor;
    public JTextArea ta_ColorText;
    public JButton btn_ChangeMode;

}
