import com.griesner.arrays.*;

// import jdk.internal.org.jline.utils.InputStreamReader;

import java.util.logging.Logger;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.logging.Level;

public class App {
    private final static Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) throws Exception {
        LOGGER.setLevel(Level.INFO);

        // Two Sum
        LOGGER.info("Test - TwoSum");
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(result));

        // Primitive types
        boolean aBool = true;
        byte aByte = 10;
        short aShort = 111;
        int aInt = 45874;
        long aLong = 56454554;
        float aFloat = 7578;
        double aDouble = 5445;
        char aChar = 'r';

        // Non primitive types
        Integer x1 = 400;
        Integer x2 = 400;
        if (x1 == x2) {
            System.out.println("ok");
        } else {
            System.out.println("ko");
        }

        // // Input stream
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = { 14, 15 };
        System.out.println(a.length);
    }
}
