/*
 * CS2852
 * Spring 2017
 * Lab 6 - Recursion
 * Name: 
 * Created: 3/30/2017
 */
package zupkeim;

import java.util.Collection;
import java.util.List;

/**
 * Tests the ArrayList and LinkedList implementations for the
 * CS2852 Lab 6 assignment.
 */
public class Tester {
    private final static String[] EMPTY_STRINGS = {};
    private final static String[] STRINGS1 = {"this"};
    private final static String[] STRINGS2 = {"this", "will"};
    private final static String[] STRINGS3 = {"this", "will", "be"};
    private final static String[] STRINGS4 = {"this", "will", "be", "interesting"};
    private final static String[] STRINGS5 = {"this", null, "will", "be", "interesting"};

    private final static int[] EMPTY_INTS = {};
    private final static int[] INTS1 = {-1};
    private final static int[] INTS2 = {-1, 2};
    private final static int[] INTS3 = {-1, 2, 8};
    private final static int[] INTS4 = {-1, 2, 8, Integer.MAX_VALUE};

    /**
     * Calls all of the test methods
     * @param ignored Not used
     */
    public static void main(String[] ignored) {

        //NAMING CONVENTION FOR METHODS https://dzone.com/articles/7-popular-unit-test-naming
        // ListType_MethodName_DataTypeUsed_ExpectedResult_StateUnderTest
        // ArrayListGetStrings
        // LinkedListSizeIntsPrintsIfReturnIsntSame



        // Testing only size
        String description = "ArrayList constructor collection of Strings of size: ";
        test(description + 0, ArrayListSizeStrings(EMPTY_STRINGS));
        test(description + 1, ArrayListSizeStrings(STRINGS1));
        test(description + 2, ArrayListSizeStrings(STRINGS2));
        test(description + 3, ArrayListSizeStrings(STRINGS3));
        test(description + 4, ArrayListSizeStrings(STRINGS4));
        test(description + 5, ArrayListSizeStrings(STRINGS5));

        // Testing only size
        description = "ArrayList constructor collection of Integers of size: ";
        test(description + 0, ArrayListSizeInts(EMPTY_INTS));
        test(description + 1, ArrayListSizeInts(INTS1));
        test(description + 2, ArrayListSizeInts(INTS2));
        test(description + 3, ArrayListSizeInts(INTS3));
        test(description + 4, ArrayListSizeInts(INTS4));

        description = "ArrayList testing indexOf: ";
        test(description + 0, ArrayListIndexOfStrings(EMPTY_STRINGS));
        test(description + 1, ArrayListIndexOfStrings(STRINGS1));
        test(description + 2, ArrayListIndexOfStrings(STRINGS2));
        test(description + 3, ArrayListIndexOfStrings(STRINGS3));
        test(description + 4, ArrayListIndexOfStrings(STRINGS4));
        test(description + 5, ArrayListIndexOfStrings(STRINGS5));

        description = "LinkedList testing indexOf: ";
        test(description + 0, ArrayListIndexOfStrings(EMPTY_INTS));
        test(description + 1, ArrayListIndexOfStrings(INTS1));
        test(description + 2, ArrayListIndexOfStrings(INTS2));
        test(description + 3, ArrayListIndexOfStrings(INTS3));
        test(description + 4, ArrayListIndexOfStrings(INTS4));
    }

    /**
     * Displays an error if the test fails
     * @param description Description of the test
     * @param passed true if the test passed
     */
    private static void test(String description, boolean passed) {
        if(!passed) {
            System.out.println("Test failed: " + description);
        }
    }

    /**
     * Tests the constructor that accepts a collection of elements.
     * After the ArrayList is instantiated, the size is compared with
     * the size of the collection.
     * @param strings An array of Strings to be added to the ArrayList
     * @return true if test passed
     */
    private static boolean arrayListSizeStrings(String[] strings) {
        Collection<String> input = new java.util.ArrayList<>();
        for(String string : strings) {
            input.add(string);
        }
        List<String> list = new ArrayList<>(input);
        return list.size()==input.size();
    }

    /**
     * Tests the constructor that accepts a collection of elements.
     * After the ArrayList is instantiated, the size is compared with
     * the size of the collection.
     * @param numbers An array of ints to be added to the ArrayList
     * @return true if test passed
     */
    private static boolean arrayListSizeInts(int[] numbers) {
        Collection<Integer> input = new java.util.ArrayList<>();
        for(int number : numbers) {
            input.add(number);
        }
        List<Integer> list = new ArrayList<>(input);
        return list.size()==input.size();
    }

    private static boolean arrayListIndexOfStrings(String[] strings){
        java.util.ArrayList<String> input = new java.util.ArrayList<>();
        boolean passed = true;
        for(String string : strings){
            input.add(string);
        }
        List<String> list = new ArrayList<>(input);
        for(String string: strings){
            passed = passed ? list.indexOf(strings) == input.indexOf(strings) : false;
        }
        return passed;
    }
    private static boolean arrayListIndexOfStrings(int[] numbers){
        java.util.ArrayList<Integer> input = new java.util.ArrayList<>();
        boolean passed = true;
        for(int ints : numbers) {
            input.add(ints);
        }
        List<Integer> list = new ArrayList<>(input);
        for(int ints : numbers){
            passed = passed ? list.indexOf(ints) == input.indexOf(ints) : false;
        }
        return passed;
    }




}
