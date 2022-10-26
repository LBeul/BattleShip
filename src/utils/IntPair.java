package utils;

public class IntPair {
    private final int x;
    private final int y;

    IntPair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "IntPair{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
