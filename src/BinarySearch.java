import java.lang.reflect.MalformedParametersException;

public class BinarySearch {
    public static final int NonExistantIndex = -1;

    /**
     * A recursive implementation of the binary search algorithm
     * @param elementToFind => The element in the array to find the index of
     * @param array => a non-empty, sorted array that is being searched
     * @param <T> => Comparable, which ensures an implementation of compareTo
     * @return => the index that elementToFind is located at in array, otherwise -1
     */
    public static <T extends Comparable> int Find(T elementToFind, T[] array){
        if(array == null || array.length == 0){
            throw new MalformedParametersException();
        }

        return Find(elementToFind, array, 0, array.length -1);
    }

    private static <T extends Comparable> int Find(T elementToFind, T[] array, int firstIndex, int lastIndex){
        if(firstIndex > lastIndex){
            throw new MalformedParametersException("This should never be hit as this is a private function");
        }

        int currentIndex = (firstIndex + lastIndex) / 2;
        T currentElement = array[currentIndex];

        if(AreEqual(elementToFind, currentElement))
        {
            return currentIndex;
        }
        else
        {
            if(firstIndex == lastIndex)
            {
                return NonExistantIndex;
            }
            else
            {
                int comparison = elementToFind.compareTo(currentElement);
                if(comparison < 0)
                {
                    return Find(elementToFind, array, firstIndex, currentIndex);
                }
                else
                {
                    return Find(elementToFind, array, currentIndex+1, lastIndex);
                }
            }
        }
    }

    /**
     * Wrapper around Comparable's compareTo to abstract the check of zero
     * @param <T> => Comparable, which ensures an implementation of compareTo
     * @return => true if the two elements are equal, otherwise false
     */
    public static <T extends Comparable> boolean AreEqual(T element1, T element2){
        return element1.compareTo(element2) == 0;
    }
}
