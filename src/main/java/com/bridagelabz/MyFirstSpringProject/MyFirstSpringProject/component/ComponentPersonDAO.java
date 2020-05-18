package com.bridagelabz.MyFirstSpringProject.MyFirstSpringProject.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentPersonDAO {
    @Autowired
    ComponentJdBCconnection JDBCconnectionComponent;

    public ComponentJdBCconnection getJdBCconnection() {
        return JDBCconnectionComponent;
    }
}
