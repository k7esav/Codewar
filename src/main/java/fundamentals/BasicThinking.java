package fundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicThinking {

    // Just think if we can use the builtin methods
    public static String removeSpaceCharacters(String str) {

        return str.replace(" ", "");
    }

    // Always avoid loops with single condition
    public static int sumOfPositive(int[] arr) {

        return Arrays.stream(arr).filter(elt -> elt > 0).sum();
    }

    public static int multiplyArray(int[] arr) {

        // [1, 2, 3] -> 1 * 2 * 3
        return Arrays.stream(arr).reduce(1, (a, b) -> a * b);
    }

    // Spend some time on the Problem itself
    public static int centuryOfTheYear(int year) {
        return (year + 99) / 100;
    }

    public static int liters(double time) {
        // (int) Math.floor( time * 0.5 );
        return (int) time / 2;
    }

    // For Codewar
    public static int[] toPrimitiveArray(List<Integer> array) {

        return array.stream().mapToInt(x -> x).toArray();
    }

    public static int[] reverseArray(long number) {
        //if you were given this problem, always go with string soln
        //StringBuilder has an reverse method
        return new StringBuilder().append(number)
                .reverse()
                .chars().map(Character::getNumericValue).toArray();
    }
}
