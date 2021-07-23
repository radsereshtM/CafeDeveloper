/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbd;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author MRadsereshT
 */
public class DatabaseHelper {

    private Session session;

    public DatabaseHelper() {
            session=Session6HibernateUtil.getSessionFactory().openSession();
    }
    
    public void addCategory(String name){
        Transaction transaction=session.beginTransaction();
        session.createSQLQuery("INSERT  INTO Category(Name) VALUES (:name)")
                .setParameter("name", name)
                .executeUpdate();
        transaction.commit();
                
    }
    public void deleteCategory(int categoryId){
        Transaction transaction=session.beginTransaction();
        session.createSQLQuery("DELETE FROM Category WHERE CategoryId=:categoryId")
                .setParameter("categoryId",categoryId)
                .executeUpdate();
        transaction.commit();
    }
    public void updateCategory(int categoryId,String name){
        Transaction transaction=session.beginTransaction();
        session.createSQLQuery("UPDATE Category SET Name=:name WHERE CategoryId=:categoryId")
                .setParameter("categoryId",categoryId)
                .setParameter("name", name)
                .executeUpdate();
        transaction.commit();
    }
    public List<Category> getCategories(){
        return session.createQuery("FROM Category").list();
    }

    
}
