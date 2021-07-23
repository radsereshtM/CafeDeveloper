/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedemo1;

import java.io.File;

/**
 *
 * @author MRadsereshT
 */
public class FileDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File[]roots=File.listRoots();
        for(File fl:roots){System.out.println(fl);}
    }
    
}
