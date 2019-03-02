package autoCompleteMe;

/***
 * CSIS 2420
 * Assignment AutoComplete Me
 * Cody Henry
 * Brad Rohbock
 *
 */

import java.util.Arrays;
import java.util.Comparator;

public class Autocomplete
{

    public Term[] terms;

    // Initialize the data structure from the given array of terms.
    public Autocomplete(Term[] terms)
    {
        if (terms == null)
        {
            throw new NullPointerException();
        }
        this.terms = terms;
        Arrays.sort(terms);
    }

    // Return all terms that start with the given prefix, in descending order of weight.

    /***
     *Using binary search deluxe take the alphabetically sorted array find the first index that matches
     * and the last index that matches then put all those terms in an array, sort that array by reverse
     * weight order and return the array.
     * @param prefix
     * @return matching terms
     */
    public Term[] allMatches(String prefix)
    {
        if (prefix == null)
        {
            throw new NullPointerException();
        }

        Term temp = new Term(prefix, 0);

        int firstInd = BinarySearchDeluxe.firstIndexOf(terms, temp, Term.byPrefixOrder(prefix.length()));
        int lastInd = BinarySearchDeluxe.lastIndexOf(terms, temp, Term.byPrefixOrder(prefix.length()));

        if (firstInd == -1 || lastInd == -1)
        {
            throw new NullPointerException();
        }

        Term[] termsMatched = new Term[lastInd - firstInd + 1];
        termsMatched = Arrays.copyOfRange(terms, firstInd, lastInd);
        Arrays.sort(termsMatched, new Term.ReverseWeightOrder());
        return termsMatched;
    }

    // Return the number of terms that start with the given prefix.

    /***
     * Take the difference of last and first index from the BinarySearchDeluxe methods to calculate a count
     * of matches
     * @param prefix
     * @return
     */
    public int numberOfMatches(String prefix)
    {
        if (prefix == null)
        {
            throw new NullPointerException();
        }

        Term temp = new Term(prefix, 0);
        int firstInd = BinarySearchDeluxe.firstIndexOf(terms, temp, new Term.PrefixOrder(prefix.length()));
        int lastInd = BinarySearchDeluxe.lastIndexOf(terms, temp, new Term.PrefixOrder(prefix.length()));
        return lastInd - firstInd;
    }
}
