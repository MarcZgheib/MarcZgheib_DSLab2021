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
public class CDLL_withTailAndSize implements CDLL_Interface {

    private Node head;
    private Node tail;
    private int size;

    public CDLL_withTailAndSize() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public CDLL_withTailAndSize(Node head) {
        this.head = this.tail = head;
        this.size = 1;

    }

    public CDLL_withTailAndSize(Object headValue) {
        this.head = this.tail = new Node(headValue);
        this.size = 1;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    public void makeEmpty() {
        this.head = this.tail = head;
        this.size = 0;
    }

    public Node getHeadNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty! Can't fetch head.");
        } else {
            return this.head;
        }
    }

    public Object getHeadValue() {
        return this.getHeadNode().getValue();
    }

    public Node getTailNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty! Can't fetch tail.");
        } else {
            return this.tail;
        }
    }

    public Object getTailValue() {
        return this.getTailNode().getValue();
    }

    public Node getNode(int index) {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (isEmpty()) {
            throw new RuntimeException("Cannot fetch node, list is empty!");
        } else {
            Node currentNode = this.head;
            int counter = 0;
            while (currentNode != this.tail) { 
                if (counter == index) {
                    return currentNode;
                }
                counter++;
                currentNode = currentNode.getNext();
            }
            throw new RuntimeException("Object at given index is not found!");
        }
    }

    @Override
    public Object get(int index) {
        return this.getNode(index).getValue();
    }

    @Override
    public int indexOf(Object element) {
        Node currentNode = this.head;
        int counter = 0;
        while (currentNode != this.tail) {
            if (currentNode.getValue().equals(element)) {
                return counter;
            }
            currentNode = currentNode.getNext();
            counter++;

        }
        return -1;
    }

    @Override
    public void insertAtBack(Object newElement) {
        if (isEmpty()) {
            this.head = this.tail = new Node(newElement);
        } else {
            Node nodeToAdd = new Node(newElement, this.head, this.tail);
            this.tail.setNext(nodeToAdd);
            this.head.setPrevious(nodeToAdd);
            this.tail = nodeToAdd;

        }
        this.size++;
    }

    @Override
    public void insertAtFront(Object newElement) {
        if (isEmpty()) {
            this.head = this.tail = new Node(newElement);
        } else {
            Node nodeToAdd = new Node(newElement, this.head, this.tail);
            this.tail.setNext(nodeToAdd);
            this.head.setPrevious(nodeToAdd);
            this.head = nodeToAdd;

        }
        this.size++;
    }

    @Override
    public void removeFromBack() {
        if (isEmpty()) {
            throw new RuntimeException("Cannot remove from empty list");
        } else if (this.head.getNext() == null) { 
            makeEmpty();
        } else {
            Node beforeTail = tail.getPrevious();
            beforeTail.setNext(null);
            head.setPrevious(null);
            this.tail = beforeTail;
            this.size--;

        }
    }

    @Override
    public void removeFromFront() {

        if (isEmpty()) {
            throw new RuntimeException("Cannot remove from empty list");
        } else if (this.head.getNext() == null) { 
            makeEmpty();
        } else {
            Node afterHead = this.head.getNext();
            afterHead.setPrevious(null);
            this.tail.setNext(null);
            this.head = afterHead;
            this.size--;
        }
    }


@Override
public void print() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            Node currentNode = head;
            int counter = 0; 
            while (counter<size) {
                System.out.print(currentNode.getValue() + " --> ");
                currentNode = currentNode.getNext();
                counter++;
            }
            System.out.println("");
        }
    }

}
