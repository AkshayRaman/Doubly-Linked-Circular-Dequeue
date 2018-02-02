/**
* The DoublyLinkedCircularDequeue (DLCDQ) class uses two nodes, a front and rear
* and the size of the DLCDQ.
* Contains methods to perform insertion, deletion and traversal.
* 
* @author  Akshay R
* @version 1.0
* @since   2014-07-23 
*/

class DoublyLinkedCircularDequeue
{
	
	private Node front, rear;
	private int size;
	
	public DoublyLinkedCircularDequeue()
	{
		front = rear = null;
		size = 0;
	}
	
	boolean isEmpty()
	{
		return size==0;
	}
	
	public void makeCircular()
	{

		rear.next = front;
		front.prev = rear;
	}
	
	public void insertAtFront(int x)
	{
		Node t = new Node(x);
		if(isEmpty())
		{
			front = t;
		}
		
		else
		{
			if(size==1)
			{
				rear = front;
				front = t;
				
				front.next = rear;
				rear.prev = front;
			}
			else
			{
				t.next = front;
				t.prev = rear;
				
				rear.next = t;
				front.prev = t;
				front = t;
				
				
			}
			makeCircular();
		}
		
		size++;
		System.out.println(x+" was inserted at the front.");
	}
	
	public void insertAtRear(int x)
	{
		Node t = new Node(x);
		if(isEmpty())
		{
			front = t;
		}
		
		else
		{
			if(size==1)
			{
				rear = t;
				front.next = rear;
				rear.prev = front;
			}
			else
			{
				t.prev = rear;
				rear.next = t;
				rear = rear.next;
			}
			
			makeCircular();
		}
		
		size++;
		System.out.println(x+" was inserted at the rear.");
	}
	
	public void deleteFromFront()
	{
		if(isEmpty())
		{
			System.out.println("The DLCDQ is empty!");
			return;
		}
		
		else
		{
			int x = front.data;
			if(size==1){
				front = rear = null;
			}
			else
			{
				front = front.next;
			    makeCircular();	
			}
			System.out.println(x+" was deleted from the front!");
		}
		
		size--;
		
	}
	
	public void deleteFromRear()
	{
		if(isEmpty())
		{
			System.out.println("The DLCDQ is empty!");
			return;
		}
		
		else
		{
			int x=-1;
			if(size==1){
				x = front.data;
				front = rear = null;
			}
			else
			{
				x = rear.data;
				rear = rear.prev;
			    makeCircular();	
			}
			System.out.println(x+" was deleted from the rear!");
		}
		
		size--;
	}

	
	//To handle DLCDQs with only one element
	public void printFront()
	{
		System.out.println(front.data);
		printLine();
	}	
	
	public void printForward()
	{
		printLine();
		System.out.println("Using the count, the DLCDQ contents are:");
		
		if(size==1)
		{
			printFront();
			return;
		}
		
		int i = 0;
		Node t = front;
				
		while(i<size)
		{
			System.out.println(t.data);
			t = t.next;
			i++;
		}
		
		printLine();
	}
	
	public void printReverse()
	{
		printLine();
		System.out.println("Using the count, the DLCDQ contents in reverse are:");
		
		if(size==1)
		{
			printFront();
			return;
		}
		
		int i = 0;
		Node t = rear;
				
		while(i<size)
		{
			System.out.println(t.data);
			t = t.prev;
			i++;
		}
		
		printLine();
	}
	
	
	public void printForwardNoCount()
	{
		printLine();
		System.out.println("The DLCDQ contents are:");
		
		if(size==1)
		{
			printFront();
			return;
		}
		
		Node t = front;
					
		do
		{
			System.out.println(t.data);
			t = t.next;
		}while(t!=front);
		
		printLine();
	}
	
	public void printReverseNoCount()
	{
		printLine();
		System.out.println("The DLCDQ contents in reverse are:");
		
		if(size==1)
		{
			printFront();
			return;
		}
		
		Node t = rear;
		
		do
		{
			System.out.println(t.data);
			t = t.prev;
		}while(t!=rear);
		
		printLine();
	}
	
	public void printDetails()
	{
		int i=0;
		
		Node t = front;
		
		printLine();
		System.out.println("The DLCDQ details are:");
		System.out.println("Size: "+size);
				
		while(i<size)
		{
			t.print(); //print Node
			t = t.next;
			i++;
		}
		
		printLine();
	}
	
	public void printLine()
	{
		System.out.println("--------------------------------------------------");
	}
	
}
