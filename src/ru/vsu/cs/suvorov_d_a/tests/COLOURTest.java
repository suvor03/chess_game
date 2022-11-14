package ru.vsu.cs.suvorov_d_a.tests;

import org.junit.*;
import ru.vsu.cs.suvorov_d_a.enums.COLOUR;

import static org.junit.Assert.*;

public class COLOURTest {
    @Test
    public void colourToString() {
        assertEquals(COLOUR.B.toString(),"Black");
        assertEquals(COLOUR.W.toString(),"White");
        assertNotEquals(COLOUR.B.toString(),"White");
        assertNotEquals(COLOUR.W.toString(),"Green");
        // test enums are not equal
        assertNotEquals(COLOUR.B, COLOUR.W);
    }
}
