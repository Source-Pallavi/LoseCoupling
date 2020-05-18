package com.bridagelabz.MyFirstSpringProject.MyFirstSpringProject;

import com.bridagelabz.MyFirstSpringProject.MyFirstSpringProject.Basic.BinarySearchAlgoImpl;
import com.bridagelabz.MyFirstSpringProject.MyFirstSpringProject.Scope.PersonDAO;
import com.bridagelabz.MyFirstSpringProject.MyFirstSpringProject.XML.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Configuration
@ComponentScan
public class XMLMyFirstSpringProjectApplication {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext applicationContext =
                            new ClassPathXmlApplicationContext("XMLApplicationContext.xml"))
        {
            XMLPersonDAO personDAO=
                    applicationContext.getBean(XMLPersonDAO.class);

            System.out.println( personDAO.getJdBCconnection());
        }


    }

}
