package org.example;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class XMLParser {

    public static void main(String[] args) {

        try {
            File inputFile = new File("example.xml");

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            System.out.println("main element: " + doc.getDocumentElement().getNodeName());

            NodeList employeeList = doc.getElementsByTagName("employee");

            for (int i = 0; i < employeeList.getLength(); i++) {
                Node employeeNode = employeeList.item(i);

                if (employeeNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element employeeElement = (Element) employeeNode;

                    String id = employeeElement.getElementsByTagName("id").item(0).getTextContent();
                    String name = employeeElement.getElementsByTagName("name").item(0).getTextContent();
                    String age = employeeElement.getElementsByTagName("age").item(0).getTextContent();
                    String position = employeeElement.getElementsByTagName("position").item(0).getTextContent();

                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("Position: " + position);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
