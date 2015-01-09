package org.borrowmybike.dao;

import java.util.List;

import org.borrowmybike.model.Person;
 
public interface PersonDAO {
 
    public void save(Person p);
     
    public List<Person> list();   
}
