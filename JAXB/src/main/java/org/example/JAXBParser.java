package org.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBParser {

    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Company.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            File xmlFile = new File("src/main/resources/example.xml");
            Company company = (Company) unmarshaller.unmarshal(xmlFile);

            System.out.println("Company Name: " + company.getName());
            System.out.println("Founded: " + company.getFounded());
            System.out.println("Employees:");

            for (Employee employee : company.getEmployeeList()) {
                System.out.println("ID: " + employee.getId());
                System.out.println("Name: " + employee.getName());
                System.out.println("Age: " + employee.getAge());
                System.out.println("Position: " + employee.getPosition());
            }

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

