package autoCompleteMe;

import java.util.ArrayList;
import java.util.Collections;

public class Main
{

    public static void main(String[] args)
    {
        //Initialize some terms in an ArrayList
        ArrayList<Term> list = new ArrayList<>();

        list.add(new Term("banana", 1113.0));
        list.add(new Term("apple", 1114.0));
        list.add(new Term("apricot", 101.0));
        list.add(new Term("mushroom", 1234.0));
        list.add(new Term("pizzaPie", 2001.0));

        //print arrayList
        System.out.println("Natural Order: ");
        for (Term el : list)
        {
            System.out.println(el.toString());
        }

        Collections.sort(list, new Term.ReverseWeightOrder());
        System.out.println("\nReverse Weight Order: ");
        for (Term el : list)
        {
            System.out.println(el.toString());
        }

	    //Test Term Compare to Function
    }
}
