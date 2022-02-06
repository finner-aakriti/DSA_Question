package linked_list;


public class Reverse {
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
		}
	}
	public void insert_at_end(int v)
	  {
		  Node new_node = new Node(v);
		  new_node.next = null;
		  
		  if(head==null)
		  {
			  head=new_node;
		  }
		  else
		  {
			Node n=head;
			  while(n!=null)
			  {
				  if(n.next==null)
				  {
					  break;
				  }
				  n=n.next;
			  }
			  n.next = new_node;
		  }
		  
	  }
	public void list_traverse()
	  {
		  Node n = head;
		  while(n!=null)
		  {
			  System.out.print(n.data +" ");
			  n= n.next;
		  }
		  System.out.println();
	  }
	void reverse()
	{
		Node cur = head;
		Node prev = null;
		Node n = head.next;
		while(cur!=null)
		{
			n = cur.next;
			cur.next = prev;
			prev = cur;
			cur= n;
		}
		head= prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse ob = new Reverse();
		ob.insert_at_end(3);
		ob.insert_at_end(5);
		ob.insert_at_end(20);
		ob.insert_at_end(14);
		ob.insert_at_end(1);
		ob.list_traverse();
		ob.reverse();
		ob.list_traverse();
		

	}

}
