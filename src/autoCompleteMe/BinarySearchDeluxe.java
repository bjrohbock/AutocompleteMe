
package autoCompleteMe;

/***
 * CSIS 2420
 * Assignment AutoComplete Me
 * Cody Henry
 * Brad Rohbock
 *
 */

import java.lang.NullPointerException;
import java.util.Comparator;

public class BinarySearchDeluxe
{
    /**
     * Return the index of the first key in a[] that equals the search key, or -1 if no such key.
     * @param a
     * @param key
     * @param comparator
     * @param <Key>
     * @return location of firstIndex
     */
    public static <Key> int firstIndexOf(Key[] a, Key key, Comparator<Key> comparator)
    {
        try
        {
            if ((a) != null && (key) != null && (comparator) != null)
            {
                //Binary search code modified from BinarySearch.java in algs4
                int lo = 0;
                int hi = a.length - 1;
                while (lo <= hi)
                {
                    // Key is in a[lo..hi] or not present.
                    int mid = lo + (hi - lo) / 2;
                    int comp = comparator.compare(key, a[mid]);
                    if (comp < 0) hi = mid - 1;
                    else if (comp > 0) lo = mid + 1;
                        //if the entire range hasn't been scanned,then set the hi to whatever mid is and keep going
                    else if (mid != lo) hi = mid;
                    else return mid;
                }


            } else
            {
                throw new java.lang.NullPointerException();
            }
        } catch (NullPointerException e)
        {
            System.err.println("One of the arguments is null.");

        }
        return -1;
    }

    /***
     *Return the index of the last key in a[] that equals the search key, or -1 if no such key.
     * @param a
     * @param key
     * @param comparator
     * @param <Key>
     * @return location of lastIndex
     */
    public static <Key> int lastIndexOf(Key[] a, Key key, Comparator<Key> comparator)
    {
        try
        {
            if ((a) != null && (key) != null && (comparator) != null)
            {
                //Binary searth code modified from BinarySearch.java in algs4
                int lo = 0;
                int hi = a.length - 1;
                while (lo <= hi)
                {
                    // Key is in a[lo..hi] or not present.
                    int mid = lo + (hi - lo) / 2;
                    int comp = comparator.compare(key, a[mid]);
                    if (comp < 0) hi = mid - 1;
                    else if (comp > 0) lo = mid + 1;
                        //if the entire range hasn't been scanned,then set the lo to whatever mid is and keep going
                    else if (mid != hi) lo = mid;
                    else return mid;
                }

            } else
            {
                throw new java.lang.NullPointerException();
            }
        } catch (NullPointerException e)
        {
            System.err.println("One of the arguments is null.");

        }
        return -1;
    }
}
