package ru.vsu.cs.suvorov_d_a.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import ru.vsu.cs.suvorov_d_a.enums.COLOUR;
import ru.vsu.cs.suvorov_d_a.enums.ID;
import ru.vsu.cs.suvorov_d_a.rules.Coordinate;
import ru.vsu.cs.suvorov_d_a.rules.Piece;
import ru.vsu.cs.suvorov_d_a.rules.Pieces;

import javax.swing.*;
import java.util.ArrayList;

public class PieceTest {

    Piece piece1 = new Piece(ID.KING, COLOUR.B, new Coordinate('a', 1)) {

        @Override
        public ArrayList<Coordinate> getRawMoves(Pieces pieces) {
            return null;
        }

        @Override
        public ImageIcon getImageIcon() {
            return null;
        }

        @Override
        public Piece makeCopy() {
            return null;
        }
    };
    @Test
    public void getters() {
        assertEquals(piece1.getCoords().toString(), "a1");
        assertEquals(piece1.getColour().toString(), "Black" );
        assertEquals(piece1.getName().toString(), "K");
        assertEquals(piece1.getOGcoord().toString(), "a1");
        assertEquals(piece1.getPieceID(), "*K*Black*a*");
    }

    @Test
    public void setters() {
        piece1.setCoords(new Coordinate('b',2));
        assertEquals(piece1.getCoords().toString(), "b2");
        assertNotEquals(piece1.getCoords(), piece1.getOGcoord());
        assertEquals(piece1.getColour().toString(), "Black" );
        assertEquals(piece1.getName().toString(), "K");
        assertEquals(piece1.getOGcoord().toString(), "a1");
        assertEquals(piece1.getPieceID(), "*K*Black*a*");
    }
    @Test
    public void toStringTest() {
        piece1.setCoords(new Coordinate('b',2));
        assertEquals(piece1.toString(), "Kb2");
        assertEquals(piece1.toFancyString(), "King is at b2");
        piece1.setCoords(new Coordinate('c',4));
        assertEquals(piece1.toString(), "Kc4");
        assertEquals(piece1.toFancyString(), "King is at c4");
    }
}