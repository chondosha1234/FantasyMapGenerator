public class Cell {

    private Tile tile;

    public Cell(Tile tile) {
        this.tile = tile;
    }

    public void setType(Tile tile) {
        this.tile = tile;
    }

    public Tile getType() {
         return this.tile;
    }
}
