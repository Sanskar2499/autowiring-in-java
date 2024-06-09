package com.sf.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

    private int rollno;
    private String name;
    @Autowired
    @Qualifier("createAddrObj1")
    private Address address;

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

//    public Address getAddress() {
//        return address;
//    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void setAddress(Address address) {
//        this.address = address;
//    }


    public void display(){
        System.out.println(this.name);
        System.out.println(this.rollno);
        System.out.println(this.address );
    }
}
