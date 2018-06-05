package com;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParserClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("people.xml");
			NodeList persionNodeList = doc.getElementsByTagName("person");
			for (int i = 0; i < persionNodeList.getLength(); i++) {
				Node p = persionNodeList.item(i);
				if (p.getNodeType() == Node.ELEMENT_NODE) {
					Element person = (Element) p;
					String id = person.getAttribute("id");
					NodeList nameList = person.getChildNodes();
					for (int j = 0; j < nameList.getLength(); j++) {
						Node n=nameList.item(j);
						if(n.getNodeType()==Node.ELEMENT_NODE) {
							Element name=(Element) n;
							System.out.println(name.getTagName() +"-------"+name.getTextContent());
						}
					}
				}
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
