package com.bridagelabz.MyFirstSpringProject.MyFirstSpringProject;

import com.bridagelabz.MyFirstSpringProject.MyFirstSpringProject.Scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyFirstSpringProjectApplication {
    private static Logger LOGGER=
            LoggerFactory.getLogger(MyFirstSpringProjectApplication.class);
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MyFirstSpringProjectApplication.class, args);
        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
LOGGER.info("{}",personDAO);
LOGGER.info("{}",personDAO.getJdBCconnection());
        LOGGER.info("{}",personDAO1);
        LOGGER.info("{}",personDAO1.getJdBCconnection());
        System.out.println(personDAO);
        System.out.println(personDAO1);

    }

}
