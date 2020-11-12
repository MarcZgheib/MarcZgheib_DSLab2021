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
public class Assignment2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int[] Array1 = {3,32,521,321,45,21,2};
        int[] Array2 = {42,1,551,6,76,342,1,7};
        int[] Array3 = new int[Array1.length + Array2.length];
        
        System.arraycopy(Array1, 0, Array3, 0, Array1.length);
        System.arraycopy(Array2, 0, Array3, Array1.length, Array2.length);
        for (int i = 0; i < Array1.length + Array2.length; i++) {
            System.out.println(Array3[i]);
        }
    }
}
