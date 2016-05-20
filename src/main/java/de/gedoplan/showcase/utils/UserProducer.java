package de.gedoplan.showcase.utils;

import de.gedoplan.showcase.models.User;
import javax.enterprise.inject.Produces;

/**
 *
 * @author Dominik Mathmann
 */
public class UserProducer {
    
    @Produces
    public static User getUser(){
        User user=new User("Injected User", "ALFAA");
        return user;
    }
}
