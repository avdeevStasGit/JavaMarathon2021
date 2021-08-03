package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] pieaces = {
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
            ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK
        };

        for( ChessPiece piece : pieaces) {
            System.out.print(piece.getRepresitation() + " ");
        }
    }
}