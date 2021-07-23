/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayobjdemo;

import java.util.Arrays;

/**
 *
 * @author MRadsereshT
 */
public class ArrayobjDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person[] persons = new Person[3];
        
        persons[0] = new Person();
        persons[0].family = "sweet";
        persons[0].name = "nakene";

        persons[1] = new Person();
        persons[1].family = "lopez";
        persons[1].name = "alina";
        
        persons[2] = new Person();
         persons[2].family="Devile";
        persons[2].name="Cherie";
        
        Arrays.sort(persons);
        for(Person p:persons){
            System.out.println(p);
        }
        
        
    }

}
