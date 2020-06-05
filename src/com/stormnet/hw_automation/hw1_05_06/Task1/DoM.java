package com.stormnet.hw_automation.hw1_05_06.Task1;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DoM {

    private static ArrayList<Med_Employee> employees = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(new File("Med_Employees.xml"));

        NodeList employeeM = document.getDocumentElement().getElementsByTagName("employee");
        for (int i = 0; i < employeeM.getLength(); i++) {
            Node employee = employeeM.item(i);
            NamedNodeMap atr = employee.getAttributes();
            employees.add(new Med_Employee(atr.getNamedItem("name").getNodeValue(), atr.getNamedItem("surname").getNodeValue(), atr.getNamedItem("position").getNodeValue(), atr.getNamedItem("department").getNodeValue(), atr.getNamedItem("experience").getNodeValue()));
        }

        for (Med_Employee employee : employees) {
            System.out.println(String.format("Name: %s;\nSurname: %s;\nPosition: %s;\nDepartment: %s;\nExperience: %s;\n", employee.getName(), employee.getSurname(), employee.getPosition(), employee.getDepartment(), employee.getExperience()));
        }

        printEmployee("Ivan", "Ivanov");
    }
    private static void printEmployee(String name, String surname) {

        for (Med_Employee employee : employees) {

            if (employee.getName().equals(name) && employee.getSurname().equals(surname)) {
                System.out.println ("\n" +
                        "Запрашиваемый сотрудник:"+(String.format("\n" + "Name: %s;\nSurname: %s;\nPosition: %s;\nDepartment: %s;\nExperience: %s;\n", employee.getName(), employee.getSurname(), employee.getPosition(), employee.getDepartment(), employee.getExperience())));
            }
        }
    }
}