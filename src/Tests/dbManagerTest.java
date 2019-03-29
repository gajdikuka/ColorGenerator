package Tests;

import Model.dbManager;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class dbManagerTest {

    @org.junit.jupiter.api.Test
    void getHexValos() {
        ArrayList<Character> testHexList = new ArrayList<>();
        testHexList.addAll(Arrays.asList('0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'));
        dbManager dbm = new dbManager();
        dbm.Csatlakoz();
        assertEquals(dbm.GetHex(),testHexList);
    }

    @org.junit.jupiter.api.Test
    void getHexNotNull() {
        ArrayList<Character> testHexList = new ArrayList<>();
        dbManager dbm = new dbManager();
        dbm.Csatlakoz();
        assertNotEquals(dbm.GetHex(),testHexList);
    }
}