package Controller.WindowStrategia;

import Controller.ColorGeneration.ColorGenerator;

import javax.swing.*;
import java.awt.*;

public class Form {
    private FormStrategia fs;
    private Object cw;
    private JFrame frame;

    public void TipustValaszt(FormStrategia fs){
        this.fs = fs;
        this.cw = fs.getWindow();
        this.frame = fs.getFrame();
    }

    public JFrame getFrame () {
        return frame;
    }

    public Object getWindow(){
        return cw;
    }

}
