// this file will be creating your own linkedlist data structure

class Node {

  int value;
  Node next;
  
  public Node(){
    
    value = 0;
    next = null;
    
  }

  public Node(int vle){
   value = vle; 
  }
  
  public Node(int vle, Node nxt){
    value = vle;
    next = nxt;
  }
  
}

public class myLinkedList {
  Node head;
  int size;
  
  public myLinkedList(){
    head = new Node();
    size = 0;
  }
  
  public myLinkedList(Node head){
    this.head = head; 
  }
  
}
