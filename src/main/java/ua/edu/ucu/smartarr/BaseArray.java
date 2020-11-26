package ua.edu.ucu.smartarr;

import java.util.ArrayList;
import java.util.Arrays;

// Base array for decorators
public class BaseArray implements SmartArray{
    private final ArrayList<Object> elements;
    private final int size;

    public BaseArray(Object[] elements) {
        this.size = elements.length;
        this.elements = new ArrayList<>(Arrays.asList(elements));
    }

    public BaseArray(ArrayList<Object> elements) {
        this.size = elements.size();
        this.elements = new ArrayList<>(elements);
    }

    public ArrayList<Object> getElements() {
        return elements;
    }

    @Override
    public Object[] toArray() {
        return this.elements.toArray();
    }

    @Override
    public String operationDescription() {
        return "It is the base array";
    }

    @Override
    public int size() {
        return this.size;
    }
}
