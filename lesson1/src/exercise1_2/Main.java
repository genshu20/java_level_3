package exercise1_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TestArray<Integer> testArray=new TestArray<>();
        Integer[]integers={1,2,3};
        testArray.setArray(integers);
        System.out.println(Arrays.toString(testArray.replace(integers)));
        System.out.println(testArray.arrayToList(integers));
    }
}
