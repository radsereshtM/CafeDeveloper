/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayobjdemo;

/**
 *
 * @author MRadsereshT
 */
public class Person {
String family;
String name;

    @Override
    public String toString() {
        return String.format("%s - %s",family,name);
    }

}
