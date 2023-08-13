import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void validPartitionTestTrue1() {
        int[] nums = {4, 4, 4, 5, 6};
        boolean actual = new Solution().validPartition(nums);

        Assert.assertTrue(actual);
    }

    @Test
    public void validPartitionTestFalse1() {
        int[] nums = {1, 1, 1, 2};
        boolean actual = new Solution().validPartition(nums);

        Assert.assertFalse(actual);
    }
}
