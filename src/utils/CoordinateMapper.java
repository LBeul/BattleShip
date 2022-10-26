package utils;

public final class CoordinateMapper {
    public static IntPair coordsToInts(String coords) {
        int x = Character.getNumericValue(coords.charAt(0)) - 10;
        int y = Integer.parseInt(coords.substring(1)) - 1;
        return new IntPair(x, y);
    }

    public static String intsToCoords(IntPair xy) {
        char x = (char) (xy.getX() + 65);
        String y = Integer.toString(xy.getY() + 1);
        return x + y;
    }
}
