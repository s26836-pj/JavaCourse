package org.example;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XMLValidation {

    public static void main(String[] args) {

        String xmlFile = "java/example.xml";
        String xsdFile = "java/example.xsd";

       if(validateXMLSchema(xsdFile,xmlFile)){
           System.out.println("xml correct");
       }else {
           System.out.println("xml not correct");
       }
    }

    public static boolean validateXMLSchema(String xsdPath, String xmlPath) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (IOException | SAXException e) {
            System.out.println("Validation error: " + e.getMessage());
            return false;
        }
        return true;
    }
}
