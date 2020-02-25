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
  
  public void addNode(int value, int pos){
    
    if(pos > this.size){
     System.err.println("ERROR - out of bounds"); 
      return;
    }
    
    Node newNode = new Node(value);
    if(pos == 0){
     newNode.next = this.head;
    }
    
    Node nodeIn = head;
    
    for(int i = 1; i < pos; i++){
      nodeIn = nodeIn.next;
    }
    
    newNode.next = nodeIn.next;
    nodeIn.next = newNode;
    this.size++;
    
  }
  
  public void recurAddNode(int value, int pos, Node next){
    
    if(pos == 0){
      Node a = new Node(value, next);
      this.size++;
      return;
    }
    
    if(pos == 1){
      Node a = new Node(value, next.next);
      next.next = a;
      this.size++;
    }
    
    recurAddNode(value, pos-1, next.next);
    
  }
  
}
