/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

/**
 *
 * @author User
 */
public class ArrayListTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ArrayList list = new ArrayList();
        System.out.println(list.size());
        list.add("Marc");
        list.add("Charbel");
        list.add("Elie");
        list.add("Joe");
        list.print();
        System.out.println(list.size());
        list.remove();
        list.print();
        System.out.println(list.size());
        list.remove(0);
        list.print();
        System.out.println(list.size());
        list.remove("Elie");
        list.print();
        System.out.println(list.size());
        
    }
}
