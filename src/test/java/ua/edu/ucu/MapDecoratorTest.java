package ua.edu.ucu;

import org.junit.Test;
import ua.edu.ucu.functions.MyFunction;
import ua.edu.ucu.smartarr.*;
import ua.edu.ucu.smartarr.BaseArray;
import ua.edu.ucu.smartarr.SmartArray;
import static org.junit.Assert.*;

public class MapDecoratorTest {
    @Test
    public void testToArrayOperationDescriptionSize() {
        Integer[] integers = {-1, 2, 0, 1, 0, -1};
        SmartArray studentSmartArray = new BaseArray(integers);
        MyFunction func = t -> 2 * ((Integer) t);
        studentSmartArray = new MapDecorator(studentSmartArray, func);
        Integer[] expectedRes = {-2, 4, 0, 2, 0, -2};
        Object[] actualRes = studentSmartArray.toArray();
        assertArrayEquals(expectedRes, actualRes);
        assertEquals("Map elements to the same function",
                studentSmartArray.operationDescription());
        assertEquals(6, studentSmartArray.size());
    }

    @Test
    public void testGetElements() {
        Integer[] integers = {-1, 2, 0, 1, 0, -1};
        SmartArray studentSmartArray = new BaseArray(integers);
        MyFunction func = t -> 2 * ((Integer) t);
        studentSmartArray = new MapDecorator(studentSmartArray, func);
        Integer[] expectedRes = {-2, 4, 0, 2, 0, -2};
        Object[] actualRes = studentSmartArray.getElements().toArray();
        assertArrayEquals(expectedRes, actualRes);
    }

}
