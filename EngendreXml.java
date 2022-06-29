package projet.java.fr;

import org.jdom2.Document;
import org.jdom2.Element;

public class EngendreXml {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Element racine = new Element("cli"); 
		Document doc = new Document(racine); 
		
		
		Element argument1 = new Element("argument"); 
		argument1.addContent("Valeur de alpha"); //addAttribute
		Element acces1 = new Element("acces"); 
		argument1.addContent(acces1); 
		Element nb1 = new Element("nb"); 
		argument1.addContent(nb1); 
		
		Element argument2 = new Element("argument"); 
		argument2.addContent("Valeur de indice");//addAttribute 
		Element acces2 = new Element("acces"); 
		argument2.addContent(acces1); 
		Element nb2 = new Element("nb"); 
		argument2.addContent(nb2);
		
		
		Element argument3 = new Element("argument"); 
		argument3.addContent("Mode matrice pleine"); 
		Element acces3 = new Element("acces"); 
		argument3.addContent(acces3); 
		Element nb3 = new Element("nb"); 
		argument3.addContent(nb3);
		
		
	}

}
