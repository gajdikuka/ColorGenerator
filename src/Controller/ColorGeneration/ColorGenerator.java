package Controller.ColorGeneration;

import java.util.ArrayList;
import java.util.Random;

public class ColorGenerator {

    private  Random rn = new Random();
    ArrayList<Character> hex;


    public String Generate(){
        String hexcode = "#";
        for (int i = 0; i < 6; i++) {
            hexcode+= hex.get(rn.nextInt(16));
        }
        return hexcode;
    }

    public ColorGenerator(){
        HexList hexcodeGetter = new HexList();
        hex = hexcodeGetter.Get();
    }

}
