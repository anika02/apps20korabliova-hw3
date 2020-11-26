package ua.edu.ucu;

import java.util.Arrays;
import ua.edu.ucu.functions.MyComparator;
import ua.edu.ucu.functions.MyFunction;
import ua.edu.ucu.functions.MyPredicate;
import ua.edu.ucu.smartarr.*;

public class SmartArrayApp {

    public static Integer[]
            filterPositiveIntegersSortAndMultiplyBy2(Integer[] integers) {
                
        MyPredicate pr = t -> ((Integer) t) > 0;

        MyComparator cmp = (o1, o2) -> ((Integer) o1) - ((Integer) o2);

        MyFunction func = t -> 2 * ((Integer) t);

        // Input: [-1, 2, 0, 1, -5, 3]
        SmartArray sa = new BaseArray(integers);

        sa = new FilterDecorator(sa, pr); // Result: [2, 1, 3];
        sa = new SortDecorator(sa, cmp); // Result: [1, 2, 3]
        sa = new MapDecorator(sa, func); // Result: [2, 4, 6]

        Object[] result = sa.toArray();
        return Arrays.copyOf(result, result.length, Integer[].class);
    }

    public static String[]
            findDistinctStudentNamesFrom2ndYearWithGPAgt4AndOrderedBySurname(Student[] students) {

        MyPredicate prYear = t -> ((Student) t).getYear() == 2;

        MyPredicate prGPA = t -> ((Student) t).getGPA() >= 4;

        MyComparator cmp = (o1, o2) -> ((Student) o1).getSurname().
                compareTo(((Student) o2).getSurname());

        MyFunction createString = t -> ((Student) t).getSurname() + " " + ((Student) t).getName();

        SmartArray studentSmartArray = new BaseArray(students);

        // remove duplicates
        studentSmartArray = new DistinctDecorator(studentSmartArray);
        // filter by year == 2
        studentSmartArray = new FilterDecorator(studentSmartArray, prYear);
        // filter by GPA > 4
        studentSmartArray = new FilterDecorator(studentSmartArray, prGPA);
        // sort by surname
        studentSmartArray = new SortDecorator(studentSmartArray, cmp);

        // map to string
        studentSmartArray = new MapDecorator(studentSmartArray, createString);

        Object[] result = studentSmartArray.toArray();

        return Arrays.copyOf(result, result.length, String[].class);
    }
}
