/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shutdowndemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author MRadsereshT
 */
public class ShutdownDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Runtime runtime = Runtime.getRuntime();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
        System.out.print("Enter No. of Seconds after which You want your Computer to Shutdown :");
        long a=Long.parseLong(br.readLine());
		
        Process proc = runtime.exec("shutdown -s -t " +a);
		
        System.exit(0);
        }catch(Exception io){
            
        }
    }
    
}
