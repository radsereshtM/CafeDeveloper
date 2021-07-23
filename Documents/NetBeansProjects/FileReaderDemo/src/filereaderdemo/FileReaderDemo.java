/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereaderdemo;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author MRadsereshT
 */
public class FileReaderDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
                BufferedReader br=new BufferedReader(new FileReader("C:\\myFile\\file.txt"));
                while(br.ready()){
                    System.out.println(br.readLine());
                }
                br.close();
        
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
