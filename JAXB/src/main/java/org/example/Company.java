package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

@XmlRootElement
public class Company {

    private String name;
    private Date founded;
    private List<Employee> employeeList;


    @XmlElement
    public String getName() {
        return name;
    }

    @XmlElement
    public Date getFounded() {
        return founded;
    }

    @XmlElementWrapper(name = "employeeList")
    @XmlElement(name = "employee")
    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}

