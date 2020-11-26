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
public interface List {

   
    int size();
    
   
    boolean isEmpty();
    
    
    void add (Object newElement);
    
    
    Object get(int index);
    
    
    int indexOf(Object element);
    
    
    void remove();
    
    
    Object remove (int index);
    
    
    Object remove (Object element);
}


