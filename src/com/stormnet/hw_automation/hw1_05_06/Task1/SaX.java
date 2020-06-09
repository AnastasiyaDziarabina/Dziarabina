package com.stormnet.hw_automation.hw1_05_06.Task1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class SaX {

    private static ArrayList<Med_Employee> employees = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        XMLHandler handler = new XMLHandler();
        parser.parse(new File("Med_Employees.xml"), handler);

        for (Med_Employee employee : employees) {
            System.out.println(String.format("\nName: %s;\nSurname: %s;\nPosition: %s;\nDepartment: %s;\nExperience: %s;\n", employee.getName(), employee.getSurname(), employee.getPosition(), employee.getDepartment(), employee.getExperience()));
        }
    }

    private static class XMLHandler extends DefaultHandler {
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (qName.equals("employee")) {
                String name = attributes.getValue("name");
                String surname = attributes.getValue("surname");
                String position = attributes.getValue("position");
                String department = attributes.getValue("department");
                String experience = attributes.getValue("experience");
                employees.add(new Med_Employee(name, surname, position, department, experience));
            }
        }
    }
}