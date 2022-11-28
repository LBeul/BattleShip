package ui;

public class Coordinates {
    private final int x;
    private final int y;

    public Coordinates(String stringCoords) {
        this.x = Character.getNumericValue(stringCoords.charAt(0)) - 10;
        this.y = Integer.parseInt(stringCoords.substring(1)) - 1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * String representation for debugging reasons
     * @return coordinates as string
     */
    @Override
    public String toString() {
        return "IntPair{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
