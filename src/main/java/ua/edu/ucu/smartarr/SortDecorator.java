package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.ArrayList;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {

    public SortDecorator(SmartArray smartArray, MyComparator cmp) {
        super(sortArray(smartArray, cmp));
    }

    private static SmartArray sortArray(SmartArray smartArray, MyComparator cmp) {
        ArrayList<Object> array = smartArray.getElements();
        array.sort(cmp);
        return new BaseArray(array);
    }

    @Override
    public Object[] toArray() {
        return this.smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "Compare elements with the same method";
    }

    @Override
    public int size() {
        return this.smartArray.size();
    }

    @Override
    public ArrayList<Object> getElements() {
        return this.smartArray.getElements();
    }
}
