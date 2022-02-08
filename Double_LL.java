package linked_list;



public class Double_LL {
	Node head;
	class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int d)
		{
			data = d;
		}
	}
	void append(int data)
	{
		Node new_node = new Node(data);
		Node last = head;
		new_node.next= null;
		if(head==null)
		{
			new_node.prev = null; 
            head = new_node; 
            return;
		}
		while (last.next != null) 
            last = last.next; 
		
		last.next = new_node;
		new_node.prev = last;
	}
	public void printlist(Node node) 
    { 
        Node last = null; 

        System.out.println("Traversal in forward Direction"); 
        while (node != null) { 
            System.out.print(node.data + " "); 
            last = node; 
            node = node.next; 
        } 
        System.out.println(); 
       
        System.out.println("Traversal in reverse direction"); 
        while (last != null) { 
            System.out.print(last.data + " "); 
            last = last.prev; 
        } 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double_LL ob = new Double_LL();
		ob.append(2);
		ob.append(5);
		ob.append(10);
		ob.append(12);
		ob.append(1);
    System.out.println("Linked list is");
        ob.printlist(ob.head);

	}

}
