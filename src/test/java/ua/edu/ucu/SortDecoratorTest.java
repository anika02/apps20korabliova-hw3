package ua.edu.ucu;

import org.junit.Test;
import ua.edu.ucu.functions.MyComparator;
import ua.edu.ucu.smartarr.BaseArray;
import ua.edu.ucu.smartarr.SmartArray;
import ua.edu.ucu.smartarr.SortDecorator;

import static org.junit.Assert.*;

public class SortDecoratorTest {

    @Test
    public void testToArrayOperationDescriptionSize() {
        Integer[] integers = {-1, 2, 0, 1, 0, -1};
        SmartArray studentSmartArray = new BaseArray(integers);
        MyComparator cmp = (o1, o2) -> ((Integer) o1) - ((Integer) o2);
        studentSmartArray = new SortDecorator(studentSmartArray, cmp);
        Integer[] expectedRes = {-1, -1, 0, 0, 1, 2};
        Object[] actualRes = studentSmartArray.toArray();
        assertArrayEquals(expectedRes, actualRes);
        assertEquals("Compare elements with the same method",
                studentSmartArray.operationDescription());
        assertEquals(6, studentSmartArray.size());
    }
}
