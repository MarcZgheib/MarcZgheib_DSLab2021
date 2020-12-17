/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular_doubly_linked_list;

/**
 *
 * @author User
 */
public class Node {

    private Object value;
    private Node next;
    private Node previous;

    public Node(Object value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public Node(Object value, Node next, Node previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void printNode() {
        System.out.println("Node's Value: " + value
                + ", previous node is: " + previous.getValue()
                + ", next node is: " + next.getValue());
    }
}

