
// Java program to demonstrate working of Collections.sort()
package SQLMONGO;
import java.util.*;
 
public class Collectionsorting
{
    public static void main(String[] args)
    {
        // Create a list of strings
        ArrayList<String> al = new ArrayList<String>();
        al.add("Geeks For Geeks");
        al.add("Friends");
        al.add("Dear");
        al.add("Is");
        al.add("Superb");
        
         ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(8);
        a2.add(7);
        a2.add(3);
        a2.add(2);
        a2.add(12);
        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(a2);
       
        // Let us print the sorted list
        System.out.println("List after the use of" +
                        " Collection.sort() :\n" + a2);
    }
}