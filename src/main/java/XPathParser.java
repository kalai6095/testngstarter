import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XPathParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document d = builder.parse("people2.xml");
			XPath xp = XPathFactory.newInstance().newXPath();

			NodeList nl = (NodeList) xp.compile("//education").evaluate(d, XPathConstants.NODESET);
			System.out.println("education length" + nl.getLength());
			for (int i = 0; i < nl.getLength(); i++) {
				NodeList nn = nl.item(i).getChildNodes();
				for (int j = 0; j < nn.getLength(); j++) {
					Node n = nn.item(j);
					if (n.getNodeType() == Node.ELEMENT_NODE)
						System.out.println(n.getNodeName() + "==================>" + n.getTextContent());
				}

			}

		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
