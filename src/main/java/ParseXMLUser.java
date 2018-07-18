import Entity.Link;
import Entity.Person;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParseXMLUser {

    public ParseXMLUser(){

    }

    public Map<Person, List<Link>> runParse() {

        Map<Person, List<Link>> users = new HashMap<>();

        try {
            File xmlFile = new File("src/Base/Users.xml");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(xmlFile);
            document.getDocumentElement().normalize();

            NodeList nodeList = document.getElementsByTagName(document.getDocumentElement().getChildNodes().item(1).getNodeName());

            for (int i = 0; i < nodeList.getLength(); i++) {

                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE)
                {
                    String firstName;
                    String lastName;
                    String eMail;
                    String password;

                    Element element = (Element)node;

                    firstName = element.getElementsByTagName("firstName").item(0).getChildNodes().item(0).getNodeValue();
                    lastName = element.getElementsByTagName("lastName").item(0).getChildNodes().item(0).getNodeValue();
                    eMail = element.getElementsByTagName("eMail").item(0).getChildNodes().item(0).getNodeValue();
                    password = element.getElementsByTagName("password").item(0).getChildNodes().item(0).getNodeValue();

                    List<Link> links = new ArrayList<>();
                    users.put(new Person(firstName, lastName, eMail, password), links);
                }

            }
        }
        catch (Exception e)
        {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }

        return users;

    }

}