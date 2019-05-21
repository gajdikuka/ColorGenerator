package Tests;

import Model.ColorGeneration.HexList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HexListTest {

    @Test
    void getValos() {
        ArrayList<Character> testHexList = new ArrayList<>();
        testHexList.addAll(Arrays.asList('0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'));
        HexList hexList = new HexList();
        assertEquals(hexList.Get(), testHexList);
    }

    @Test
    void getNull() {
        ArrayList<Character> testHexList = new ArrayList<>();
        HexList hexList = new HexList();
        assertNotEquals(hexList.Get(), testHexList);
    }
}