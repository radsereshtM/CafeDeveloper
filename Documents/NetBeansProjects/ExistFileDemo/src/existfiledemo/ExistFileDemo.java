/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package existfiledemo;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author MRadsereshT
 */
public class ExistFileDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while(true){
        String address=JOptionPane.showInputDialog("Enter Address:....");
        File file=new File(address);
        String[]list=file.list();
        for(String name:list){
            System.out.println(name);
        }
        }
    }
    
}
