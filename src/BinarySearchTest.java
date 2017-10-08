import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.MalformedParametersException;

public class BinarySearchTest {
    @Test (expected = MalformedParametersException.class)
    public void TestFind_NullArray(){
        BinarySearch.Find(2, null);
    }

    @Test (expected = MalformedParametersException.class)
    public void TestFind_EmptyArray(){
        BinarySearch.Find(2, new Integer[0]);
    }

    @Test
    public void TestFind_Exists_ArrayLengthOne(){
        Double[] array = { 2.5 };
        int index = BinarySearch.Find(2.5, array);
        Assert.assertEquals(0, index);
    }

    @Test
    public void TestFind_NotExists_ArrayLengthOne(){
        Double[] array = { 2.5 };
        int index = BinarySearch.Find(2.51, array);
        Assert.assertEquals(BinarySearch.NonExistantIndex, index);
    }

    @Test
    public void TestFind_Exists_ArrayLengthTwo_Index0(){
        Double[] array = { 2.5, 4.3 };

        int index = BinarySearch.Find(2.5, array);
        Assert.assertEquals(0, index);
    }

    @Test
    public void TestFind_Exists_ArrayLengthTwo_Index1(){
        String[] array = { "a", "z" };

        int index = BinarySearch.Find("z", array);
        Assert.assertEquals(1, index);
    }

    @Test
    public void TestFind_NotExists_ArrayLengthTwo(){
        Double[] array = { 2.5, 4.3 };
        int index = BinarySearch.Find(1.1, array);
        Assert.assertEquals(BinarySearch.NonExistantIndex, index);
    }

    @Test
    public void TestFind_ArrayLength3(){
        Integer[] array = { 1, 2, 3 };

        int index0 = BinarySearch.Find(array[0], array);
        Assert.assertEquals(0, index0);

        int index1 = BinarySearch.Find(array[1], array);
        Assert.assertEquals(1, index1);

        int index2 = BinarySearch.Find(array[2], array);
        Assert.assertEquals(2, index2);

        int indexNotExists = BinarySearch.Find(50, array);
        Assert.assertEquals(BinarySearch.NonExistantIndex, indexNotExists);
    }

    @Test
    public void TestFind_ArrayLength4(){
        Integer[] array = { 1, 2, 3, 4 };

        int index0 = BinarySearch.Find(array[0], array);
        Assert.assertEquals(0, index0);

        int index1 = BinarySearch.Find(array[1], array);
        Assert.assertEquals(1, index1);

        int index2 = BinarySearch.Find(array[2], array);
        Assert.assertEquals(2, index2);

        int index3 = BinarySearch.Find(array[3], array);
        Assert.assertEquals(3, index3);

        int indexNotExists = BinarySearch.Find(50, array);
        Assert.assertEquals(BinarySearch.NonExistantIndex, indexNotExists);
    }

    @Test
    public void TestFind_ArrayLength5(){
        Integer[] array = { 1, 2, 3, 4, 5 };

        int index0 = BinarySearch.Find(array[0], array);
        Assert.assertEquals(0, index0);

        int index1 = BinarySearch.Find(array[1], array);
        Assert.assertEquals(1, index1);

        int index2 = BinarySearch.Find(array[2], array);
        Assert.assertEquals(2, index2);

        int index3 = BinarySearch.Find(array[3], array);
        Assert.assertEquals(3, index3);

        int index4 = BinarySearch.Find(array[4], array);
        Assert.assertEquals(4, index4);

        int indexNotExists = BinarySearch.Find(50, array);
        Assert.assertEquals(BinarySearch.NonExistantIndex, indexNotExists);
    }

    @Test
    public void TestFind_Long(){
        int elementToFind = 23;
        Integer[] array = { -5, -3, -1, 3, 6, 7, 19, 21, elementToFind, 26, 27, 30, 39, 40 };

        int index = BinarySearch.Find(elementToFind, array);
        Assert.assertEquals(8, index);
    }

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