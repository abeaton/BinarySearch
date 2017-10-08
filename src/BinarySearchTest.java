import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void TestAreEqual_Equal(){
        Integer element1 = 50;
        Integer element2 = 50;
        boolean areEqual = BinarySearch.AreEqual(element1, element2);
        Assert.assertTrue(areEqual);
    }

    @Test
    public void TestAreEqual_LessThan(){
        Double element1 = 1.23333;
        Double element2 = 1.23334;
        boolean areEqual = BinarySearch.AreEqual(element1, element2);
        Assert.assertFalse(areEqual);
    }

    @Test
    public void TestAreEqual_GreaterThan(){
        String element1 = "z";
        String element2 = "y";
        boolean areEqual = BinarySearch.AreEqual(element1, element2);
        Assert.assertFalse(areEqual);
    }
}