/*
 * CS2852-021
 * Spring 2017
 * Lab 6 - Recursion
 * Name: Isaiah Zupke
 * Partner: Rock Boynton
 * Created: 3/30/2017 | Edited: 04/23/2018
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

    private static boolean testsPassed = true;

    /**
     * Calls all of the test methods
     * @param ignored Not used
     */
    public static void main(String[] ignored) {
        boolean allPassed = true;
        //TESTING ARRAYLIST SIZE()
        String description = "ArrayList test, size(), strings: ";
        test(description + 0, arrayListSizeStrings(EMPTY_STRINGS));
        test(description + 1, arrayListSizeStrings(STRINGS1));
        test(description + 2, arrayListSizeStrings(STRINGS2));
        test(description + 3, arrayListSizeStrings(STRINGS3));
        test(description + 4, arrayListSizeStrings(STRINGS4));
        test(description + 5, arrayListSizeStrings(STRINGS5));
        description = "ArrayList test, size(), ints: ";
        test(description + 0, arrayListSizeInts(EMPTY_INTS));
        test(description + 1, arrayListSizeInts(INTS1));
        test(description + 2, arrayListSizeInts(INTS2));
        test(description + 3, arrayListSizeInts(INTS3));
        test(description + 4, arrayListSizeInts(INTS4));

        //TESTING ARRAYLIST CONTAINS()
        description = "ArrayList test, contains(), strings: ";
        test(description + 0, arrayListContainsStrings(EMPTY_STRINGS));
        test(description + 1, arrayListContainsStrings(STRINGS1));
        test(description + 2, arrayListContainsStrings(STRINGS2));
        test(description + 3, arrayListContainsStrings(STRINGS3));
        test(description + 4, arrayListContainsStrings(STRINGS4));
        test(description + 5, arrayListContainsStrings(STRINGS5));
        description = "ArrayList test, contains(), ints: ";
        test(description + 0, arrayListContainsInts(EMPTY_INTS));
        test(description + 1, arrayListContainsInts(INTS1));
        test(description + 2, arrayListContainsInts(INTS2));
        test(description + 3, arrayListContainsInts(INTS3));
        test(description + 4, arrayListContainsInts(INTS4));

        //TESTING ARRAYLIST INDEXOF()
        description = "ArrayList test, indexOf(), strings: ";
        test(description + 0, arrayListIndexOfStrings(EMPTY_STRINGS));
        test(description + 1, arrayListIndexOfStrings(STRINGS1));
        test(description + 2, arrayListIndexOfStrings(STRINGS2));
        test(description + 3, arrayListIndexOfStrings(STRINGS3));
        test(description + 4, arrayListIndexOfStrings(STRINGS4));
        test(description + 5, arrayListIndexOfStrings(STRINGS5));
        description = "ArrayList test, indexOf(), ints: ";
        test(description + 0, arrayListIndexOfInts(EMPTY_INTS));
        test(description + 1, arrayListIndexOfInts(INTS1));
        test(description + 2, arrayListIndexOfInts(INTS2));
        test(description + 3, arrayListIndexOfInts(INTS3));
        test(description + 4, arrayListIndexOfInts(INTS4));

        //TESTING ARRAYLIST GET()
//        description = "ArrayList test, get(), strings: ";
//        test(description + 0, arrayListGetStrings(EMPTY_STRINGS));
//        test(description + 1, arrayListGetStrings(STRINGS1));
//        test(description + 2, arrayListGetStrings(STRINGS2));
//        test(description + 3, arrayListGetStrings(STRINGS3));
//        test(description + 4, arrayListGetStrings(STRINGS4));
//        test(description + 5, arrayListGetStrings(STRINGS5));
//        description = "ArrayList test, get(), ints: ";
//        test(description + 0, arrayListGetInts(EMPTY_INTS));
//        test(description + 1, arrayListGetInts(INTS1));
//        test(description + 2, arrayListGetInts(INTS2));
//        test(description + 3, arrayListGetInts(INTS3));
//        test(description + 4, arrayListGetInts(INTS4));

        //TESTING LINKEDLIST SIZE()
        description = "LinkedList test, size(), strings: ";
        test(description + 0, linkedListSizeStrings(EMPTY_STRINGS));
        test(description + 1, linkedListSizeStrings(STRINGS1));
        test(description + 2, linkedListSizeStrings(STRINGS2));
        test(description + 3, linkedListSizeStrings(STRINGS3));
        test(description + 4, linkedListSizeStrings(STRINGS4));
        test(description + 5, linkedListSizeStrings(STRINGS5));
        description = "LinkedList test, size(), ints: ";
        test(description + 0, linkedListSizeInts(EMPTY_INTS));
        test(description + 1, linkedListSizeInts(INTS1));
        test(description + 2, linkedListSizeInts(INTS2));
        test(description + 3, linkedListSizeInts(INTS3));
        test(description + 4, linkedListSizeInts(INTS4));

        //TESTING LINKEDLIST CONTAINS()
        description = "LinkedList test, contains(), strings: ";
        test(description + 0, linkedListContainsStrings(EMPTY_STRINGS));
        test(description + 1, linkedListContainsStrings(STRINGS1));
        test(description + 2, linkedListContainsStrings(STRINGS2));
        test(description + 3, linkedListContainsStrings(STRINGS3));
        test(description + 4, linkedListContainsStrings(STRINGS4));
        test(description + 5, linkedListContainsStrings(STRINGS5));
        description = "LinkedList test, contains(), ints: ";
        test(description + 0, linkedListContainsInts(EMPTY_INTS));
        test(description + 1, linkedListContainsInts(INTS1));
        test(description + 2, linkedListContainsInts(INTS2));
        test(description + 3, linkedListContainsInts(INTS3));
        test(description + 4, linkedListContainsInts(INTS4));

        //TESTING LINKEDLIST INDEXOF()
        description = "LinkedList test, indexOf(), strings: ";
        test(description + 0, linkedListIndexOfStrings(EMPTY_STRINGS));
        test(description + 1, linkedListIndexOfStrings(STRINGS1));
        test(description + 2, linkedListIndexOfStrings(STRINGS2));
        test(description + 3, linkedListIndexOfStrings(STRINGS3));
        test(description + 4, linkedListIndexOfStrings(STRINGS4));
        test(description + 5, linkedListIndexOfStrings(STRINGS5));
        description = "LinkedList test, indexOf(), ints: ";
        test(description + 0, linkedListIndexOfInts(EMPTY_INTS));
        test(description + 1, linkedListIndexOfInts(INTS1));
        test(description + 2, linkedListIndexOfInts(INTS2));
        test(description + 3, linkedListIndexOfInts(INTS3));
        test(description + 4, linkedListIndexOfInts(INTS4));

        //TESTING LINKEDLIST GET()
        description = "LinkedList test, get(), strings: ";
        test(description + 0, linkedListGetStrings(EMPTY_STRINGS));
        test(description + 1, linkedListGetStrings(STRINGS1));
        test(description + 2, linkedListGetStrings(STRINGS2));
        test(description + 3, linkedListGetStrings(STRINGS3));
        test(description + 4, linkedListGetStrings(STRINGS4));
        test(description + 5, linkedListGetStrings(STRINGS5));
        description = "LinkedList test, get(), ints: ";
        test(description + 0, linkedListGetInts(EMPTY_INTS));
        test(description + 1, linkedListGetInts(INTS1));
        test(description + 2, linkedListGetInts(INTS2));
        test(description + 3, linkedListGetInts(INTS3));
        test(description + 4, linkedListGetInts(INTS4));

        if(allPassed){
            System.out.println("All tests passed");
        }
    }

    /**
     * Displays an error if the test fails
     * @param description Description of the test
     * @param passed true if the test passed
     */
    private static void test(String description, boolean passed) {
        if(!passed) {
            testsPassed = false;
            System.out.println("Test failed: " + description);
        }
    }


    //TESTING ARRAYLIST SIZE()
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

    //TESTING ARRAYLIST CONTAINS()
    private static boolean arrayListContainsStrings(String[] strings){
        boolean testState = true;
        List<String> input = new java.util.ArrayList<>();
        for(String string : strings) {
            input.add(string);
        }
        List<String> list = new ArrayList<>(input);
        for(int i = 0; testState && i < strings.length; i++){
            testState = list.contains(strings[i]) == input.contains(strings[i]);
        }
        return testState;
    }

    private static boolean arrayListContainsInts(int[] numbers){
        boolean testState = true;
        List<Integer> input = new java.util.ArrayList<>();
        for(int currentInt : numbers) {
            input.add(currentInt);
        }
        List<Integer> list = new ArrayList<>(input);
        for(int i = 0; testState && i < numbers.length; i++){
            testState = list.contains(numbers[i]) == input.contains(numbers[i]);
        }
        return testState;
    }

    //TESTING ARRAYLIST INDEXOF()
    private static boolean arrayListIndexOfStrings(String[] strings){
        boolean testState = true;
        List<String> input = new java.util.ArrayList<>();
        for(String string : strings){
            input.add(string);
        }
        List<String> list = new ArrayList<>(input);

        for(int i=0;testState && i<strings.length; i++){
            testState = input.indexOf(strings[i]) == list.indexOf(strings[i]);
        }

        return testState;
    }

    private static boolean arrayListIndexOfInts(int[] numbers){
        boolean testState = true;
        List<Integer> input = new java.util.ArrayList<>();
        for(int num : numbers){
            input.add(num);
        }
        List<Integer> list = new ArrayList<>(input);

        for(int i=0;testState && i<numbers.length; i++){
            testState = input.indexOf(numbers[i]) == list.indexOf(numbers[i]);
        }

        return testState;
    }

    //TESTING ARRAYLIST GET()
    private static boolean arrayListGetStrings(String[] strings){
        boolean testState = true;
        List<String> input = new java.util.ArrayList<>();
        for(String string : strings) {
            input.add(string);
        }
        List<String> list = new ArrayList<>(input);
        String listValue;
        String inputValue;
        for(int i = 0; testState && i < strings.length; i++){
            listValue = list.get(i);
            inputValue = input.get(i);
            if(listValue == null || inputValue == null){
                testState = listValue == inputValue;
            } else {
                testState = list.get(i).equals(input.get(i));
            }
        }
        return testState;
    }

    private static boolean arrayListGetInts(int[] numbers){
        boolean testState = true;
        List<Integer> input = new java.util.ArrayList<>();
        for(int currentInt : numbers) {
            input.add(currentInt);
        }
        List<Integer> list = new ArrayList<>(input);
        for(int i = 0; testState && i < numbers.length; i++){
            testState = list.get(i) == input.get(i);
        }
        return testState;
    }

    //TESTING LINKEDLIST SIZE()
    private static boolean linkedListSizeStrings(String[] strings) {
        Collection<String> input = new java.util.LinkedList<>();
        for(String string : strings) {
            input.add(string);
        }
        List<String> list = new LinkedList<>(input);
        return list.size()==input.size();
    }

    private static boolean linkedListSizeInts(int[] numbers) {
        Collection<Integer> input = new java.util.LinkedList<>();
        for(int number : numbers) {
            input.add(number);
        }
        List<Integer> list = new LinkedList<>(input);
        return list.size()==input.size();
    }

    //TESTING LINKEDLIST CONTAINS()
    private static boolean linkedListContainsStrings(String[] strings) {
        boolean testState = true;
        List<String> input = new java.util.LinkedList<>();
        for(String string : strings) {
            input.add(string);
        }
        List<String> list = new LinkedList<>(input);
        for(int i = 0; testState && i < strings.length; i++){
            testState = list.contains(strings[i]) == input.contains(strings[i]);
        }
        return testState;
    }

    private static boolean linkedListContainsInts(int[] numbers) {
        boolean testState = true;
        List<Integer> input = new java.util.LinkedList<>();
        for(int currentInt : numbers) {
            input.add(currentInt);
        }
        List<Integer> list = new LinkedList<>(input);
        for(int i = 0; testState && i < numbers.length; i++){
            testState = list.contains(numbers[i]) == input.contains(numbers[i]);
        }
        return testState;
    }

    //TESTING LINKEDLIST INDEXOF()
    private static boolean linkedListIndexOfStrings(String[] strings){
        boolean testState = true;
        List<String> input = new java.util.LinkedList<>();
        for(String string : strings) {
            input.add(string);
        }
        List<String> list = new LinkedList<>(input);
        for(int i = 0; testState && i < strings.length; i++){
            testState = list.indexOf(strings[i]) == input.indexOf(strings[i]);
        }
        return testState;
    }

    private static boolean linkedListIndexOfInts(int[] numbers){
        boolean testState = true;
        List<Integer> input = new java.util.LinkedList<>();
        for(int currentInt : numbers) {
            input.add(currentInt);
        }
        List<Integer> list = new LinkedList<>(input);
        for(int i = 0; testState && i < numbers.length; i++){
            testState = list.indexOf(numbers[i]) == input.indexOf(numbers[i]);
        }
        return testState;
    }

    //TESTING LINKEDLIST GET()
    private static boolean linkedListGetStrings(String[] strings){
        boolean testState = true;
        List<String> input = new java.util.LinkedList<>();
        for(String string : strings) {
            input.add(string);
        }
        List<String> list = new LinkedList<>(input);
        String listValue;
        String inputValue;
        for(int i = 0; testState && i < strings.length; i++){
            listValue = list.get(i);
            inputValue = input.get(i);
            if(listValue == null || inputValue == null){
                testState = listValue == inputValue;
            } else {
                testState = list.get(i).equals(input.get(i));
            }
        }
        return testState;
    }

    private static boolean linkedListGetInts(int[] numbers){
        boolean testState = true;
        List<Integer> input = new java.util.LinkedList<>();
        for(int currentInt : numbers) {
            input.add(currentInt);
        }
        List<Integer> list = new LinkedList<>(input);
        for(int i = 0; testState && i < numbers.length; i++){
            testState = list.get(i) == input.get(i);
        }
        return testState;
    }
}
