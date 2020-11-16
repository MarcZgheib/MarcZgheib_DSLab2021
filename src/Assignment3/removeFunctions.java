/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

/**
 *
 * @author User
 */
public abstract class removeFunctions implements list {
     
     private class Node {
     
         Object value;
         Node next;
     
        public Node (Object value){
        
            this.value=value;
     }
     
     }
     private Node head;
     
     @Override
     public int size()
     {
         int count = 0;
        Node current = head;
        while(current != null)
        {
            current = current.next;
            count++;
        }
        return count;
     }
     
    @Override
    public Object remove(int index) {
        
        Node currentNode = head;
        Node previousNode;
        int counter=0;
        while(currentNode!=null)
        {
            if(counter == index)
            {
                previousNode = currentNode.next;
                currentNode = null;
                return currentNode;
                
            }
            counter++;
            currentNode=currentNode.next;
        }
        throw new ArrayIndexOutOfBoundsException("index not found: " +index );
    }

    @Override
    public boolean remove(Object element) {
        Node currentNode = head;
        Node previousNode;
        while(currentNode != null)
        {
            if(currentNode.value.equals(element))
            {
                previousNode = currentNode.next;
                currentNode = null;
                return true; 
            }
            currentNode=currentNode.next;
        }
        
        return false;
    }
   
    public Object remove()
    {
        if (this.size() == 0)
        {
            throw new RuntimeException("List is empty");
        }
        else
        {
            Node currentNode = head;
            while(currentNode != null)
                {
                    if(currentNode.next == null)
                        {
                            currentNode = null;
                        }
                    currentNode = currentNode.next;
           
            }
       }
        return null;
    }
     
 }
