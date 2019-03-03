# AutocompleteMe
Assignment AutocompleteMe from CSIS 2420 Algorithms Course.
/******************************************************************************
 *  Name: Cody Henry   
 *  NetID:    
 *  Precept:  
 *
 *  Partner Name:  Bradley Rohbock       
 *  Partner NetID:      
 *  Partner Precept:    
 *
 *  Hours to complete assignment (optional):
 * 2 hours
 ******************************************************************************/

Programming Assignment 3: Autocomplete


/******************************************************************************
 *  Describe how your firstIndexOf() method in BinarySearchDeluxe.java
 *  finds the first index of a key that equals the search key.
 *****************************************************************************/
This index will search for any term that matches that term, and then will keep setting the range to that and search until lo == mid, 
in which case I know that that term is the first one.

/******************************************************************************
 *  What is the order of growth of the number of compares (in the
 *  worst case) that each of the operations in the Autocomplete
 *  data type make, as a function of the number of terms n and the
 *  number of matching terms m?
 *
 *  Recall that with order-of-growth notation, you should discard
 *  leading coefficients and lower-order terms, e.g., m^2 + m log n.
 *****************************************************************************/

constructor: N log N

allMatches(): N log N

numberOfMatches(): log N




/******************************************************************************
 *  Known bugs / limitations.
 *****************************************************************************/
We couldn't get it to run from command line, but tested independently.

/******************************************************************************
 *  Describe whatever help (if any) that you received.
 *  Don't include readings, lectures, and precepts, but do
 *  include any help from people (including course staff, lab TAs,
 *  classmates, and friends) and attribute them by name.
 *
 *  Also include any resources (including the web) that you may
 *  may have used in creating your design.
 *****************************************************************************/
https://stackoverflow.com/questions/6676360/first-occurrence-in-a-binary-search
https://www.chegg.com/homework-help/questions-and-answers/autocomplete-programming-assignment-partnering-permitted-assignment-partnering-read-cos-22-q30092020
/******************************************************************************
 *  Describe any serious problems you encountered.                    
 *****************************************************************************/
problems with trying to compile in command line and run, we can't seem to figure out how it works.

/******************************************************************************
 *  If you worked with a partner, assert below that you followed
 *  the protocol as described on the assignment page. Give one
 *  sentence explaining what each of you contributed.
 *****************************************************************************/

Brad: AutoComplete, Term, and client

Cody: BinarySearch, prefixOrder comparator, and tested.




/******************************************************************************
 *  List any other comments here. Feel free to provide any feedback   
 *  on how much you learned from doing the assignment, and whether    
 *  you enjoyed doing it.                                             
 *****************************************************************************/

  
