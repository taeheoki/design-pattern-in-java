package shop.taeheoki.designpatterns._01_creational_patterns._03_abstract_factory._03_java;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DocumentBuilderFacotryExample {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doccument = builder.parse(new File("src/main/resources/config.xml"));
        System.out.println(doccument.getDocumentElement());
    }
}
