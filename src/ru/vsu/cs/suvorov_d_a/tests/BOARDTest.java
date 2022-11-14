package ru.vsu.cs.suvorov_d_a.tests;

import org.junit.*;
import ru.vsu.cs.suvorov_d_a.enums.BOARD;

import static org.junit.Assert.*;

public class BOARDTest {
    @Test
    public void getters() {
        assertEquals(BOARD.LAST_FILE.getFileVal(), 'h');
        assertEquals(BOARD.FIRST_FILE.getFileVal(), 'a');
        assertEquals(BOARD.LAST_RANK.getRankVal(), 8);
        assertEquals(BOARD.FIRST_RANK.getRankVal(), 1);
    }
}