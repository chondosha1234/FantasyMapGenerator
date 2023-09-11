public class Map {

    private Cell[][] cellMap;

    public Map(int x, int y) {
        cellMap = new Cell[x][y];
    }

    public Cell[][] getMap() {
        return this.cellMap;
    }
}
