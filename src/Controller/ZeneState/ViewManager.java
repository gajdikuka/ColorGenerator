package Controller.ZeneState;

import Controller.ColorGeneration.ColorGenerator;
import Controller.WindowStrategia.ColorForm;
import Controller.WindowStrategia.Form;
import Controller.WindowStrategia.MainForm;
import View.MainWindow;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewManager {

    private static ViewManager instance = new ViewManager();

    public Form colorWindow;
    public Form mainWindow;
    public MainWindow foAblak;
    public static ViewManager GetInstance(){
        return instance;
    }

    private ViewManager(){
        ColorGenerator cg = new ColorGenerator();
        colorWindow = new Form();
        mainWindow = new Form();
        colorWindow.TipustValaszt(new ColorForm());
        mainWindow.TipustValaszt(new MainForm());
        foAblak = (MainWindow)mainWindow.getWindow();
        foAblak.btn_GenerateColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hexcode = cg.Generate();
                colorWindow.getFrame().getContentPane().setBackground(Color.decode(hexcode));
                foAblak.ta_ColorText.setText(hexcode);
            }
        });

        foAblak.btn_ChangeMode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GombLenyomas();
            }
        });
    };

    public void setAllapot(ZeneAllapot allapot) {
        this.allapot = allapot;
    }

    private ZeneAllapot allapot = new Zene0();

    public void GombLenyomas(){
        allapot.GombLenyomas(this);
    }



}
