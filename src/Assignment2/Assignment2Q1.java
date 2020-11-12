/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * @author User
 */
public class Assignment2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
    }
}
class assignment2{
 
static node head1 ;
static node head2 ;
   

static class node
{
  node next;
}
  

static node mergingLinkedLists()
{
  node tail = head1;
  while (tail != null) 
  {
    if (tail.next == null && head2 != null)
         
    {
      tail.next = head2;
      break;
    }
    tail = tail.next;
  }
  return head1;
}
 public abstract class LinkedList1 implements list {


     private class Node {
     
         Object value1;
         Node next1;
     
        public Node (Object value){
        
            this.value1=value1;
     }
     
     }
     private Node head1;
     private Node tail1;
 }
 public abstract class LinkedList2 implements list {


     private class Node {
     
         Object value2;
         Node next2;
     
        public Node (Object value){
        
            this.value2=value2;
     }
     
     }
     private Node head2;
     private Node tail2;
 }


}
