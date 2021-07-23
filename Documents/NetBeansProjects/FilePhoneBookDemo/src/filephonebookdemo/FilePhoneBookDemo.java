/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filephonebookdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author MRadsereshT
 */
public class FilePhoneBookDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1-New:");
            System.out.println("2-Print:");
            System.out.println("3-Search:");
            System.out.println("4-Exit:");

            int selectMode = sc.nextInt();
            switch (selectMode) {
                case 1:
                    System.out.println("family:");
                    String family = sc.next();
                    System.out.println("name:");
                    String name = sc.next();
                    System.out.println("phone:");
                    String phone = sc.next();
                    try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter("phoneBook.txt", true));
                        writer.write(String.format("\n%s,%s,%s\n", family, name, phone));
                        writer.newLine();
                        writer.close();

                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 2:
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader("phoneBook.txt"));
                        while (reader.ready()) {
                            String[] filesInfo = reader.readLine().split(",");
                            System.out.printf("%s | %s | %s", filesInfo);
                        }
                        reader.close();
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("family:");
                    String familySearch = sc.next();
                    System.out.println("name:");
                    String nameSearch = sc.next();
                    System.out.println("\n");
                    try {
                        BufferedReader searchReader = new BufferedReader(new FileReader("phoneBook.txt"));
                        while (searchReader.ready()) {
                            String[] fileContent = searchReader.readLine().split(",");
                            if (fileContent[0].contains(familySearch) && fileContent[1].contains(nameSearch)) {
                                System.out.printf("%s|%s|%s\n", fileContent);

                            }
                        }
                        searchReader.close();
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 4:

                    return;
            }
        }
    }

}
