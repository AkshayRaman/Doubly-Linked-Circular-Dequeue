/**
* The Node class implements an node
* that stores one integer as data, and a link to the previous and next node in the DLCDQ
*
* @author  Akshay R
* @version 1.0
* @since   2014-07-23 
*/

public class Node {
	
	int data;
	Node prev;
	Node next;
	
	public Node(int x)
	{
		data = x;
		next = null;
		prev = null;
	}
	
	//function to print the node details
	public void print()
	{
		String prev_data="NULL", next_data= "NULL";
		
		if(prev != null)
			prev_data = String.valueOf(prev.data);
		
		if(next != null)
			next_data = String.valueOf(next.data);
			
		System.out.println(prev_data + " <= " + data + " => " + next_data);
	}

}
