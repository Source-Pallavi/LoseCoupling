package com.bridagelabz.MyFirstSpringProject.MyFirstSpringProject.Scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {
    @Autowired
    JdBCconnection JDBCconnection;

    public JdBCconnection getJdBCconnection() {
        return JDBCconnection;
    }
}
