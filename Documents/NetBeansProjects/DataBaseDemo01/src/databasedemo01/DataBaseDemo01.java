/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasedemo01;

import dbd.Category;
import dbd.DatabaseHelper;
import java.util.Scanner;

/**
 *
 * @author MRadsereshT
 */
public class DataBaseDemo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String name;
        int categoryId;
        DatabaseHelper db=new DatabaseHelper();
        while (true) {
            System.out.println("1-New");
            System.out.println("2-Print");
            System.out.println("3-Update");
            System.out.println("4-Delete");
            System.out.println("5-Exit");
            int selectMode = sc.nextInt();
            switch (selectMode) {
                case 1:
                    System.out.println("name:");
                    name=sc.next();
                    db.addCategory(name);
                    System.out.println("name added to DataBase!");
                    break;
                case 2:
                    for(Category category:db.getCategories()){
                        System.out.println("\n"+category+"\n");
                    }
                    break;
                case 3:
                    System.out.println("Enter categoryId:");
                    categoryId=sc.nextInt();
                    System.out.println("Enter Name:");
                    name=sc.next();
                    db.updateCategory(categoryId, name);
                    System.out.println("Database Updated...");
                    break;
                case 4:
                    System.out.println("Enter categoryId:");
                    categoryId=sc.nextInt();
                    db.deleteCategory(categoryId);
                    System.out.println("Row Deleted...");
                case 5:
                  return;
            }
        }
    }

}
