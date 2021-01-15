/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_list;

/**
 *
 * @author Bader
 */
public class TestMyArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new ArrayList
        ArrayList l1 = new ArrayList(10);
        ArrayList l2 = new ArrayList(10);
        l1.add("red");
        l1.add("green");
        l1.add("blue");
        l2.add("red");
        l2.add("yellow");
        l2.add("orange");
        l2.complement(l1, l2);
        l2.print();
    }
}
