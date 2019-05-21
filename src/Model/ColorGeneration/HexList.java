package Model.ColorGeneration;

import Model.dbManager;

import java.util.ArrayList;

public class HexList {
    public ArrayList<Character> Get(){
        dbManager db = new dbManager();
        db.Csatlakoz();
        return db.GetHex();
    }

}
