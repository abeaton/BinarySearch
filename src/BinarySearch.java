public class BinarySearch {
    public static <T extends Comparable> int Find(T element, T[] array){
        return -1;
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
