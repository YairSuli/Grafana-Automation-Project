package utilitiess;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Config {
    private static Document doc;

    private static void readXmlFile() {
        DocumentBuilder dBuilder;
        File fXmlFile = new File("Configuration.XML");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlFile);
        } catch (Exception e) {
            System.out.println("Exception in reading XML file: " + e);
        }
        doc.getDocumentElement().normalize();
    }

    public static String get(String value) {
        if (doc == null) {
            readXmlFile();
        }
        return doc.getElementsByTagName(value).item(0).getTextContent();
    }

    public static int getInt(String value) {
        return Integer.parseInt(get(value));
    }

    public static Boolean getBoolean(String value) {
        return Boolean.valueOf(get(value));
    }
}
