package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece
{
    //Super Class constructor
    public Queen(Board board, Color color)
    {
        super(board, color);
    }

    //Methods

    @Override
    public String toString()
    {
        return "Q";
    }

    @Override
    public boolean[][] possibleMoves()
    {
        boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        //Verifying above
        p.setValues(position.getRow() - 1, position.getColumn());

        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p))
        {
            mat [p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() - 1);
        }

        if (getBoard().positionExists(p) && isThereOpponentPiece(p))
        {
            mat [p.getRow()][p.getColumn()] = true;
        }

        //Verifying left
        p.setValues(position.getRow(), position.getColumn() - 1);

        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p))
        {
            mat [p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() - 1);
        }

        if (getBoard().positionExists(p) && isThereOpponentPiece(p))
        {
            mat [p.getRow()][p.getColumn()] = true;
        }

        //Verifying right
        p.setValues(position.getRow(), position.getColumn() + 1);

        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p))
        {
            mat [p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() + 1);
        }

        if (getBoard().positionExists(p) && isThereOpponentPiece(p))
        {
            mat [p.getRow()][p.getColumn()] = true;
        }

        //Verifying below
        p.setValues(position.getRow() + 1, position.getColumn());

        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p))
        {
            mat [p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() + 1);
        }

        if (getBoard().positionExists(p) && isThereOpponentPiece(p))
        {
            mat [p.getRow()][p.getColumn()] = true;
        }

        //Verifying Northwest
        p.setValues(position.getRow() - 1, position.getColumn() - 1);

        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p))
        {
            mat [p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() - 1, p.getColumn() - 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p))
        {
            mat [p.getRow()][p.getColumn()] = true;
        }

        //Verifying Northeast
        p.setValues(position.getRow() - 1, position.getColumn() + 1);

        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p))
        {
            mat [p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() - 1, p.getColumn() + 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p))
        {
            mat [p.getRow()][p.getColumn()] = true;
        }

        //Verifying Southeast
        p.setValues(position.getRow() + 1, position.getColumn() + 1);

        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p))
        {
            mat [p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() + 1, p.getColumn() + 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p))
        {
            mat [p.getRow()][p.getColumn()] = true;
        }

        //Verifying Southwest
        p.setValues(position.getRow() + 1, position.getColumn() - 1);

        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p))
        {
            mat [p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() + 1, p.getColumn() - 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p))
        {
            mat [p.getRow()][p.getColumn()] = true;
        }

        return mat;
    }
}
