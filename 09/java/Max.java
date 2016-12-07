/* Max.java uses the Java Collection Framework
 * to explore operations on a linked list
 *
 * Begun By: Serita Nelesen
 * Completed By:
 * Date:
 */

import java.util.LinkedList;
import java.util.Iterator;
//Replace this line with an import for the Collections package


class Max{

    // Replace this line with print function (and documentation)

    
    public static void main(String [] args){
	// Define list1, list2 and list3

	
	list1.add(new Integer(99)); // max is first
	list1.add(new Integer(88)); // 99 88 77 66 55
	list1.add(new Integer(77));
	list1.add(new Integer(66));
	list1.add(new Integer(55));

	list2.add(55);  // max is last
	list2.add(66);  // uses implicit type conversion of int
	list2.add(77);  //     to Integer
	list2.add(88);  // 55 66 77 88 99
	list2.add(99);

	list3.add(55);  // max is in the middle
	list3.add(77);  // implicit type conversion
	list3.add(99);  // 55 77 99 88 66 
	list3.add(88);
	list3.add(66);

	print(list1);
	print(list2);
	print(list3);

	// Display maxima of the 3 lists...
    
    }
}
