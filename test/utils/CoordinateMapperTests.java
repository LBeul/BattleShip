package utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoordinateMapperTests {

    @Test
    public void mapValidCoordinatesToIntegerValues(){
        IntPair convertedCoordsA = CoordinateMapper.coordsToInts("A1");
        assertEquals(0, convertedCoordsA.getX());
        assertEquals(0, convertedCoordsA.getY());
        IntPair convertedCoordsB = CoordinateMapper.coordsToInts("c8");
        assertEquals(2, convertedCoordsB.getX());
        assertEquals(7, convertedCoordsB.getY());
        IntPair convertedCoordsC = CoordinateMapper.coordsToInts("Z20");
        assertEquals(25, convertedCoordsC.getX());
        assertEquals(19, convertedCoordsC.getY());
    }
    @Test
    public void mapIntegerPairToCoords(){
        String coordsA = CoordinateMapper.intsToCoords(new IntPair(0,0));
        assertEquals("A1", coordsA);
        String coordsB = CoordinateMapper.intsToCoords(new IntPair(25,17));
        assertEquals("Z18", coordsB);
        String coordsC = CoordinateMapper.intsToCoords(new IntPair(5,4));
        assertEquals("F5", coordsC);
    }
}
