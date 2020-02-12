import java.util.*;
public class Stack_Ex{

  public static void main(String[]args){
  // So Stacks work like a linkedlist/arraylist, except for one important exception
    // it can only put things ontop of the list, and remove it from the top
    // it works by a Last In First Out system, and is useful to think of a stack of books
    
    // Stack<TEMPLATE> stack => so the template just means any type of object
    // using the regular java.util.stack; can import it
    
    Stack<Integer> stackInt = new Stack<>();
    stackInt.push(3); // pushing is putting integers on
    System.out.println(stack.pop()); // takes off the top and returns the integer => output is 3
  
    stackInt.push(4); 
    stackInt.push(3);
    stackInt.push(5);
    System.out.println(stackInt.pop()); // what should the output be?
    
  }

}
