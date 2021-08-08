import com.griesner.arrays.*;
import com.griesner.tests.Predicate;
import com.griesner.tests.TestingZone;

// import jdk.internal.org.jline.utils.InputStreamReader;

import java.util.logging.Logger;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;

public class App {
    private final static Logger LOGGER = Logger.getLogger(App.class.getName());

    private static void firstTest() {
        // Two Sum
        LOGGER.info("Test - TwoSum");
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);
        LOGGER.info(Arrays.toString(result));

        // Primitive types
        LOGGER.info("Test - TwoSum");
        boolean aBool = true;
        byte aByte = 10;
        short aShort = 111;
        int aInt = 45874;
        long aLong = 56454554;
        float aFloat = 7578;
        double aDouble = 5445;
        char aChar = 'r';

        // Non primitive types
        LOGGER.info("Test - TwoSum");
        Integer x1 = 400;
        Integer x2 = 400;
        LOGGER.info(x1 == x2 ? "ok" : "Test - TwoSum");

        // // Input stream
        LOGGER.info("Test - TwoSum");
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LOGGER.info("Test - TwoSum");
        int[] a = { 14, 15 };
        LOGGER.info("Test - TwoSum");
        System.out.println(a.length);

        // recursive
        LOGGER.info("Test - TwoSum");
        TwoNumbers.printN(10);
    }

    private static void secondTest_predicate_lambda() {
        class MyPredicateEven implements Predicate<Integer> {
            public boolean test(Integer x) {
                return (x % 2 == 0);
            }
        }
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(10, 5, 3, 7, 4, 3));
        TestingZone.print(al, new MyPredicateEven());
    }

    private static void thirdTest_generateSubsets() {
        GenerateSubsets.generate("ABC", "", 0);
    }

    public static void main(String[] args) throws Exception {
        LOGGER.setLevel(Level.INFO);

        // App.firstTest();
        // App.secondTest_predicate_lambda();
        App.thirdTest_generateSubsets();
    }
}
