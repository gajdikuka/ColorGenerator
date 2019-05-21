package Tests;

import Model.ColorGeneration.ColorGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorGeneratorTest {

    ColorGenerator cg = new ColorGenerator();

    @Test
    void generateHosszMegfelel() {
        int expectedHossz = 7;
        assertEquals(cg.Generate().length(),expectedHossz);
    }

    @Test
    void generateHosszHashmarkElol() {
        char hashmark = '#';
        assertEquals(cg.Generate().charAt(0),hashmark);
    }

}