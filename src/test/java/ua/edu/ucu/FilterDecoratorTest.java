package ua.edu.ucu;

import org.junit.Test;
import ua.edu.ucu.functions.MyPredicate;
import ua.edu.ucu.smartarr.BaseArray;
import ua.edu.ucu.smartarr.FilterDecorator;
import ua.edu.ucu.smartarr.SmartArray;

import static org.junit.Assert.*;

public class FilterDecoratorTest {

    @Test
    public void testToArrayOperationDescriptionSize() {
        Integer[] integers = {-1, 2, 0, 1, 0, -1};
        SmartArray studentSmartArray = new BaseArray(integers);
        MyPredicate pr = t -> ((Integer) t) > 0;
        studentSmartArray = new FilterDecorator(studentSmartArray, pr);
        Integer[] expectedRes = {2, 1};
        Object[] actualRes = studentSmartArray.toArray();
        assertArrayEquals(expectedRes, actualRes);
        assertEquals("Filter elements",
                studentSmartArray.operationDescription());
        assertEquals(2, studentSmartArray.size());
    }
}