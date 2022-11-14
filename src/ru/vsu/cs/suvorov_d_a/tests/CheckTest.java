package ru.vsu.cs.suvorov_d_a.tests;

import org.junit.*;
import ru.vsu.cs.suvorov_d_a.enums.COLOUR;
import ru.vsu.cs.suvorov_d_a.figures.Queen;
import ru.vsu.cs.suvorov_d_a.figures.Rook;
import ru.vsu.cs.suvorov_d_a.game.Boards;
import ru.vsu.cs.suvorov_d_a.rules.Coordinate;
import ru.vsu.cs.suvorov_d_a.rules.Pieces;

import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void testForChecks() {
        int pawnBRank = 7;
        int bRank = 8;
        int pawnWRank = 2;
        int wRank = 1;

        Pieces p = new Pieces(Boards.getCheckIngBoard());
        Queen queenB = (Queen) p.getPiece(new Coordinate('d',8));
        Rook rookWa = (Rook) p.getPiece(new Coordinate('a',1));
        p.makeMove(new Coordinate('a',5),queenB);
        assertTrue(p.isCheck(COLOUR.W));
        assertFalse(p.isMate(COLOUR.W));
        p.makeMove(new Coordinate('a',5),rookWa);
        assertEquals(Coordinate.emptyCoordinate,p.findPiece(queenB));
        assertFalse(p.isCheck(COLOUR.W));
    }

    @Test
    public void kingMoveCheckTest() {

    }
}
