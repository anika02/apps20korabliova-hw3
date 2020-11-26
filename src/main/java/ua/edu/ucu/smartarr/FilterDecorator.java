package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.ArrayList;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {

    public FilterDecorator(SmartArray smartArray, MyPredicate pr) {
        super(filterArray(smartArray, pr));
    }

    private static SmartArray filterArray(SmartArray smartArray, MyPredicate pr) {
        ArrayList<Object> array = smartArray.getElements();
        array.removeIf(item -> !pr.test(item));
        return new BaseArray(array);
    }

    @Override
    public Object[] toArray() {
        return this.smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "Filter elements";
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
