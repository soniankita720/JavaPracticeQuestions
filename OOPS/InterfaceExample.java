public class InterfaceExample {
    public static void main(String args[]) {
        King k = new King();
        k.moves();

        Rook r = new Rook();
        r.moves();

        Queen q = new Queen();
        q.moves();
    }
}

interface Chessboard { 
    void moves();
}

class King implements Chessboard {
    public void moves() {
        System.out.println("King");
    }
}

class Rook implements Chessboard {
    public void moves() {
        System.out.println("Rook");
    }
}

class Queen implements Chessboard {
    public void moves() {
        System.out.println("Queen");
    }
}