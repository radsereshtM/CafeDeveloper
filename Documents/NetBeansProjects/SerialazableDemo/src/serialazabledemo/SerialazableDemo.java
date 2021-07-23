/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialazabledemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author MRadsereshT
 */
public class SerialazableDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String[] name = new String[]{"java", "C#", "html"};
         try {
         ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("name.txt"));
         objectOutputStream.writeObject(name);
         objectOutputStream.close();
         } catch (Exception ex) {
         System.out.println(ex.getMessage());
         }*/
        try {
            ObjectInputStream inputstrm = new ObjectInputStream(new FileInputStream("name.txt"));
            String[] name=(String[])
            inputstrm.readObject();
            inputstrm.close();
            for(String names:name){
                System.out.println(names);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}
