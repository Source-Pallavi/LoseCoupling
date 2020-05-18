package com.bridagelabz.MyFirstSpringProject.MyFirstSpringProject.XML;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


public class XMLJDBCconnection {
    public XMLJDBCconnection() {
        System.out.println("JDBC connection");
    }
}
