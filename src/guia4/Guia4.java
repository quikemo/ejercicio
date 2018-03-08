/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import javax.swing.JOptionPane;

public class Guia4 {

    public static void main(String[] args) {
       
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
        
        if (num<100){
        JOptionPane.showMessageDialog(null,"ella no te ama");
            System.out.println("hola mundo");
        }
    }
    
}
