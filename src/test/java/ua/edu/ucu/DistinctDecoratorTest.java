package ua.edu.ucu;

import org.junit.Test;
import ua.edu.ucu.smartarr.BaseArray;
import ua.edu.ucu.smartarr.DistinctDecorator;
import ua.edu.ucu.smartarr.SmartArray;

import static org.junit.Assert.*;

public class DistinctDecoratorTest {

    @Test
    public void testToArrayOperationDescriptionSize() {
        Integer[] integers = {-1, 2, 0, 1, 0, -1};
        SmartArray studentSmartArray = new BaseArray(integers);
        studentSmartArray = new DistinctDecorator(studentSmartArray);
        Integer[] expectedRes = {-1, 2, 0, 1};
        Object[] actualRes = studentSmartArray.toArray();
        assertArrayEquals(expectedRes, actualRes);
        assertEquals("Remove all duplicates",
                studentSmartArray.operationDescription());
        assertEquals(4, studentSmartArray.size());
    }
}
