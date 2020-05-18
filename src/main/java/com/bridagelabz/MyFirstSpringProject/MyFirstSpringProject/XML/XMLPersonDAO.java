package com.bridagelabz.MyFirstSpringProject.MyFirstSpringProject.XML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class XMLPersonDAO {
    XMLJDBCconnection xmljdbCconnection;

    public XMLJDBCconnection getJdBCconnection() {
        return xmljdbCconnection;
    }

    public void setXmljdbCconnection(XMLJDBCconnection xmljdbCconnection) {
        this.xmljdbCconnection = xmljdbCconnection;
    }
}

