package com.sf.main;

import com.sf.beans.Student;
import com.sf.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[]args){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
//        Student std = (Student) context.getBean("createStdObj");
        Student std = context.getBean(Student.class);
        std.display();

    }
}
