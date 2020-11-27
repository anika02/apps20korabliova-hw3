package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.ArrayList;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {

    public MapDecorator(SmartArray smartArray, MyFunction func) {
        super(mapArray(smartArray, func));
    }

    private static SmartArray mapArray(SmartArray smartArray, MyFunction func) {
        ArrayList<Object> array = smartArray.getElements();
        for (int i = 0; i < array.size(); ++i) {
            array.set(i, func.apply(array.get(i)));
        }
        return new BaseArray(array);
    }

    @Override
    public Object[] toArray() {
        return this.smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "Map elements to the same function";
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
