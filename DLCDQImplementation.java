/**
* The DLCDQImplementation class does just that - implements the DLCDQ
* This class just illustrates the working of the DLCDQ, and you can replace
* the hard-coded input with user-defined input using Scanner or BufferedReader, and create a menu-driven program.
*
* @author  Akshay R
* @version 1.0
* @since   2014-07-23 
*/

public class DLCDQImplementation {

	public static void main(String[] args)
	{
		DoublyLinkedCircularDequeue dlcdq1 = new DoublyLinkedCircularDequeue();
		
		dlcdq1.insertAtRear(1);
		dlcdq1.insertAtFront(2);
		dlcdq1.insertAtFront(3);
		dlcdq1.insertAtRear(4);
		dlcdq1.insertAtRear(5);
		dlcdq1.insertAtFront(6);
		dlcdq1.insertAtFront(7);
		dlcdq1.insertAtRear(8);
		dlcdq1.insertAtFront(9);
		dlcdq1.insertAtRear(10);
		
		dlcdq1.printForward();
		dlcdq1.printReverse();
		
		dlcdq1.printForwardNoCount();
		dlcdq1.printReverseNoCount();
		
		dlcdq1.printDetails();
		
	}

}
