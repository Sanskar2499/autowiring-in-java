package com.sf.resources;

import com.sf.beans.Address;
import com.sf.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.BeanProperty;

@Configuration
public class SpringConfigFile {

    @Bean
    public Address createAddrObj1(){
        Address address = new Address();
        address.setHouse_no(119);
        address.setCity("Delhi");
        address.setPincode(452019);
        return address;
    }

    @Bean
    public Address createAddrObj2(){
        Address address = new Address();
        address.setHouse_no(118);
        address.setCity("Indore");
        address.setPincode(452018);
        return address;
    }

    @Bean
    public Student createStdObj(){
        Student student = new Student();
        student.setName("sam");
        student.setRollno(12);
//        student.setAddress(createAddrObj()); // dependency injection is done manually currently
        return student;
    }

}
