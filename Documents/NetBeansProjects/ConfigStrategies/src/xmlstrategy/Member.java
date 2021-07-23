/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlstrategy;

import org.springframework.stereotype.Component;

/**
 *
 * @author MRadsereshT
 */
@Component
public class Member {

    private String name, family;
    private MemberType type;

    public MemberType getType() {
        return type;
    }

    public void setType(MemberType type) {
        this.type = type;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }
    @Override
    public String toString(){
        return "Member "
                + "[name : "+ name  
                + "\tfamily : " + family 
                + "\tType : " + type.getTitle()+ "]";
    }
        

}


