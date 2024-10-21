package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

    private int id;
    private String name;
    private int age;
    private String position;

    @XmlElement
    public int getId() {
        return id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    @XmlElement
    public int getAge() {
        return age;
    }

    @XmlElement
    public String getPosition() {
        return position;
    }
}

