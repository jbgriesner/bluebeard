import com.griesner.arrays.*;
import java.util.logging.Logger;
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

    }
}
