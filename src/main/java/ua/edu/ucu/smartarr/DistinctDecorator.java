package ua.edu.ucu.smartarr;

import java.util.ArrayList;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray) {
        super(removeDuplicates(smartArray));
    }

    private static SmartArray removeDuplicates(SmartArray smartArray) {
        ArrayList<Object> array = smartArray.getElements();
        int i = 0;
        int j;
        while (i < array.size() - 1) {
            j = i + 1;
            while (j < array.size()) {
                if(array.get(i).equals(array.get(j))) {
                    array.remove(j);
                }else{
                    ++j;
                }
            }
            ++i;
        }
        return new BaseArray(array);
    }

    @Override
    public Object[] toArray() {
        return this.smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "Remove all duplicates";
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
