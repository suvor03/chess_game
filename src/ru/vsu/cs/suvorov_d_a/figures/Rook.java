package ru.vsu.cs.suvorov_d_a.figures;

import ru.vsu.cs.suvorov_d_a.enums.COLOUR;
import ru.vsu.cs.suvorov_d_a.enums.ID;
import ru.vsu.cs.suvorov_d_a.rules.Coordinate;
import ru.vsu.cs.suvorov_d_a.rules.Move;
import ru.vsu.cs.suvorov_d_a.rules.Piece;
import ru.vsu.cs.suvorov_d_a.rules.Pieces;

import javax.swing.*;
import java.util.ArrayList;

public class Rook extends Piece {

    private Coordinate castleCoordRook;

    private ImageIcon icon;

    //________________________________________________Class Constructors________________________________________________

    public Rook(COLOUR colour, Coordinate OGcoord) {
        super(ID.ROOK, colour, OGcoord);
        if (getColour() == COLOUR.B)
            icon = new ImageIcon("BRook.png");
        else if (getColour() == COLOUR.W)
            icon = new ImageIcon("WRook.png");
    }

    public Rook (Rook original) {
        super(original);
    }

    //________________________________________________Getters & Setters________________________________________________

    public Coordinate getCastleCoordRook() {
        return castleCoordRook;
    }

    public void setCastleCoordRook(Coordinate castleCoordRook) {
        this.castleCoordRook = castleCoordRook;
    }

    //________________________________________________Overridden Methods________________________________________________

    @Override
    public Rook makeCopy() {
        return new Rook(this);
    }

    /**
     * Produces an ArrayList containing all the raw moves available to a Rook within a given board
     * @param pieces the board being played in
     * @return an ArrayList containing all the coordinates produced from the Move class (all the verticals and all the horizontals)
     */

    @Override
    public ArrayList<Coordinate> getRawMoves(Pieces pieces) {
        ArrayList<Coordinate> front = Move.frontFree(pieces,this,dimension);
        ArrayList<Coordinate> right = Move.rightFree(pieces,this,dimension);
        ArrayList<Coordinate> back = Move.backFree(pieces,this,dimension);
        ArrayList<Coordinate> left = Move.leftFree(pieces,this,dimension);

        front.addAll(right);
        back.addAll(left);
        front.addAll(back);

        return front;
    }

    @Override
    public ImageIcon getImageIcon() {
        return icon;
    }
}