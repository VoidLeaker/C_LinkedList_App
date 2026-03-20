// C_LinkedList.java
// program demonstrating the implementation and use of a circular linked-list in java.
// This variation contains a dummy or sentinel node to simplify and accelerate some of the list-handling algorithms.
// This node marks the start of the list (and end of the list).
// head always points to the dummy/sentinel node. A 1-based indexing system is used.
// adapted from Problem Solving with Java by Elliot Koffman and Ursula Woltz
// ADS class

package c_linkedlist_app;

public class C_LinkedList
{
    // Data fields (member variable)
    ListNode head;	// pointer to dummy/sentinel node in list. This marks the start of the list.

    // default constructor - creates an empty list with only a sentinel node containing sentinel value 999
    // head points towards the dummy/sentinel node
    public C_LinkedList()
    {
        ListNode newNode = new ListNode(999);
        head = newNode;
        newNode.next = head;
    }
    
    
    // Constructor - creates a circular list from an array. The array and its size are passed as parameters
    // head points towards the dummy/sentinel node
    public C_LinkedList(int[] a)
    {
        ListNode last = null;
        ListNode newNode = null;
        ListNode prev = null;
        int size = a.length;
        for (int i = 1; i <= size; i++)
        {
            newNode = new ListNode(a[size - i], prev);
            if (i == 1)
              last = newNode;
            prev = newNode;
        }
        head = new ListNode(999, newNode);
        last.next = head;
    }
   
    
    // Methods
    
    // Method to check if circular linked lists is empty
  //  public boolean isEmpty()
    {
    //YOUR CODE GOES HERE
    }
    
    
    // postcondition: Adds a node storing obj at front of this list.
    public void addFirst(int obj)
    {
        // YOUR CODE GOES HERE
    }

    
    // postcondition: Adds a node storing obj at end of this list.
    public void addLast(int obj)
    {
        // YOUR CODE GOES HERE
    }
    
    
    // precondition: a list must exist with at least one node
    // postcondition: Adds a node storing obj after position index in list.
//    public boolean addAfterPos(int obj, int index)
    {
        // YOUR CODE GOES HERE
    }


    // postcondition: Returns int stored at head of this list.
//    public int getFirst()
    {
        // YOUR CODE GOES HERE
    }

    
    // postcondition: Returns int stored at end of this list.
//    public int getLast()
    {
        // YOUR CODE GOES HERE
    }
    
    
    // postcondition: retrieves the data stored in node at position index of list.
//    public int getAtPos(int index)
    {
        // YOUR CODE GOES HERE
    }
    
    
    // postcondition: Returns the length of this list.
//    public int getSize()
    {
        // YOUR CODE GOES HERE
    }

    
    // precondition: The last link node has a link to head.
    // postcondition: Returns a string formed by concatenating the 
    //	data fields of all list nodes.
//    @Override
//    public String toString()
    {
        // YOUR CODE GOES HERE
    }


    
    // precondition: list is pointed to by the dummy node's link pointer; the link pointer of the last node, if it exists, points to head
    // postcondition: nth node is deleted if it exists. A 1-based index is used.
//    public boolean delete(int n)
    {
        // YOUR CODE GOES HERE
    }// end of delete() method
    
    
    // precondition: list is pointed to by the dummy node's link pointer; the link pointer of the last node, if it exists, points to head
    // postcondition: returns a pointer to node containing a desired value, or null if not found
//    public ListNode searchPointer(int n)
    {
        // YOUR CODE GOES HERE
    }// end of method searchPointer()
    
    
    // precondition: list is pointed to by the dummy node's link pointer; the link pointer of the last node, if it exists, points to head
    // postcondition: returns a one-based index to node containing a desired value, or -1 if not found
//    public int searchIndex(int n)
    {
        // YOUR CODE GOES HERE
    }// end of method searchIndex()
    
    
    // Method used in print statements
    public String ordinality(int n)
    {
        String pos;
          
        if ((n%10 == 1) && (n != 11))
            pos = "st";
        else if ((n%10 == 2) && (n != 12))
            pos = "nd";
        else if ((n%10 == 3) && (n != 13))
            pos = "rd";
        else
            pos = "th";
        
        return pos;
    }
        
} // end of class C_LinkedList
