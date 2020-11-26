package ua.edu.ucu;

import org.junit.Test;
import ua.edu.ucu.smartarr.BaseArray;
import ua.edu.ucu.smartarr.SmartArray;

import static org.junit.Assert.*;

public class BaseArrayTest {

    @Test
    public void testToArrayOperationDescriptionSize() {
        Integer[] integers = {-1};
        SmartArray studentSmartArray = new BaseArray(integers);
        assertEquals("It is the base array",
                studentSmartArray.operationDescription());
    }
}
