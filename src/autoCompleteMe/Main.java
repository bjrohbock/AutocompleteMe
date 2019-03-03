package autoCompleteMe;

/***
 * CSIS 2420
 * Assignment AutoComplete Me
 * Cody Henry
 * Brad Rohbock
 *
 */

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main
{

    public static void main(String[] args)
    {
	/*
        //Initialize some terms in an ArrayList
        Term[] termList = new Term[5];

        termList[0] = new Term("banana", 1113.0);
        termList[1] = new Term("jam", 1114.0);
        termList[2] = new Term("jar", 101.0);
        termList[3] = new Term("mushroom", 1234.0);
        termList[4] = new Term("pizzaPie", 2001.0);

        //print arrayList
        System.out.println("Natural Order: ");
        for (int i = 0; i < termList.length; i++)
        {
            System.out.println(termList[i].toString());
        }

        Arrays.sort(termList, new Term.ReverseWeightOrder());
        System.out.println("\nReverse Weight Order: ");
        for (Term el : termList)
        {
            System.out.println(el.toString());
        }

	    //Test Term Compare to Function
        System.out.println();
        System.out.println(termList[2]);
        System.out.println(termList[3]);

        Comparator<Term> prefixComp = new Term.PrefixOrder(3);
        System.out.println(prefixComp.compare(termList[2], termList[3]));
    }
    */
	
            // read in the terms from a file
        String filename = args[0];
        In in = new In(filename);
        int N = (int) in.readInt();
        Term[] terms = new Term[N];
        for (int i = 0; i < N; i++) {
            double weight = in.readDouble();       // read the next weight
            in.readChar();                         // scan past the tab
            String query = in.readLine();          // read the next query
            terms[i] = new Term(query, weight);    // construct the term
        }

        // read in queries from standard input and print out the top k matching terms
        int k = Integer.parseInt(args[1]);
        Autocomplete autocomplete = new Autocomplete(terms);
        while (StdIn.hasNextLine()) {
            String prefix = StdIn.readLine();
            Term[] results = autocomplete.allMatches(prefix);
            for (int i = 0; i < Math.min(k, results.length); i++)
                StdOut.println(results[i]);
        }
    }
}
