package autoCompleteMe;

/***
 * CSIS 2420
 * Assignment AutoComplete Me
 * Cody Henry
 * Brad Rohbock
 *
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class Term implements Comparable<Term>
{
    private String query;
    private double weight;


    // Initialize a term with the given query string and weight.
    public Term(String query, double weight)
    {
        if (query.equals(null)) throw new NullPointerException();
        else
        {
            this.query = query;
        }
        if (weight < -1) throw new IllegalArgumentException();
        else
        {
            this.weight = weight;
        }
    }

    public static class ReverseWeightOrder implements Comparator<Term>
    {

        @Override
        public int compare(Term o1, Term o2)
        {
            if (o1.weight > o2.weight) return -1;
            if (o1.weight == o2.weight) return 0;
            return 1;
        }
    }

    // Compare the terms in descending order by weight.
    public static void byReverseWeightOrder(ArrayList<Term> list)
    {
        Collections.sort(list, new ReverseWeightOrder());
    }

    public static class PrefixOrder implements Comparator<Term>
    {
        private int pre;
        public PrefixOrder(int prefix){
            pre = prefix;
        }

        @Override
        public int compare(Term o1, Term o2)
        {
            String term1 = o1.query.substring(0,pre);
            String term2 = o2.query.substring(0, pre);
            return term1.compareTo(term2);
        }
    }

    // Compare the terms in lexicographic order but using only the first r characters of each query.
    public static Comparator<Term> byPrefixOrder(int r)
    {
        return new PrefixOrder(r);
    }

    // Compare the terms in lexicographic order by query.
    public int compareTo(Term that)
    {
        if (this.query.compareTo(that.query) < 0) return -1;
        if (this.query.compareTo(that.query) == 0) return 0;
        return 1;
    }

    // Return a string representation of the term in the following format:
    // the weight, followed by a tab, followed by the query.
    public String toString()
    {
        return "query: " + this.query + " weight: " + this.weight;
    }
}
