package com.hn.mybatis.dao;

import com.hn.mybatis.bean.Person;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface PersonMapper {


    public void deletePerson(Integer id);

//    public Person getPersonByNameAndGender(String username, String gender);


//    public Person getPersonByNameAndGender(Person person);

//    public Person getPersonByNameAndGender(Map<String,Object> param);

    public Person getPersonByNameAndGender(@Param("username") String username, @Param("gender") String gender);


    //    public Person getPersonByCollection(Collection list);
    public Person getPersonByCollection(@Param("test") int[] ids);


    public List<Person> getPersonsByIds(int[] ids);

    public int addPersons(@Param("persons") List<Person> persons);

    public int addPerson(Person person);


    public List<Person> getAllPersons();

}
