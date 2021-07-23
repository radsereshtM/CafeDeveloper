/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlstrategy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author MRadsereshT
 */
public class ConfigStrategies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        Member m= (Member) ctx.getBean(Member.class);
        MemberType mt=(MemberType) ctx.getBean("typeid");
        m.setFamily("lopez");
        m.setName("alina");
        mt.setTitle("ass");
        m.setType(mt);
        
        System.out.println(m.toString());
    }
    
}
