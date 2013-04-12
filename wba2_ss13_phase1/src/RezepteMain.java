import generated.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.stream.StreamSource;

import java.util.Scanner;


public class RezepteMain {
	
	private static final String XML_DOC = "./misc/aufgabe3d.xml";
	private static Scanner in;

	public static void listeRezepte(ArrayList<RezeptType> list){

		int count = 1;

		System.out.println();
		System.out.println("[---- Rezepte ----]");
		System.out.println();

		for(RezeptType rezept : list){
			System.out.println((count++) + ". " + rezept.getTitel() + " (" + rezept.getSubtitel() + ")");
		}

	}

	public static void listeRezept(RezeptType rezept){

		ArrayList<FotoType> fotos = (ArrayList<FotoType>) rezept.getFotos().getFoto();

		System.out.print("\n> " + rezept.getTitel());

		if(rezept.getSubtitel() != null)
			System.out.print(" (" + rezept.getSubtitel() + ")\n\r");

		System.out.println("\nFotos:");


		for(FotoType foto : fotos){
			System.out.println("\t" + foto.getBildadresse() + " | " + foto.getBenutzer());
		}

		System.out.println("\nInfo:");

		if(rezept.getArbeitszeit().getValue() != null){
			System.out.println("\tArbeitszeit: " + rezept.getArbeitszeit().getValue() + " " + rezept.getArbeitszeit().getEinheit());
		}else{
			System.out.println("\tArbeitszeit: n/a");
		}

		System.out.println("\tSchwierigkeitsgrad: " + rezept.getSchwierigkeitsgrad().value());	

		if(rezept.getBrennwert().getValue() != null){
			System.out.println("\tBrennwert: " + rezept.getBrennwert().getValue() + " " + rezept.getBrennwert().getEinheit());
		}else{
			System.out.println("\tBrennwert: n/a");
		}

		System.out.println("\nZutaten:");

		ArrayList<ZutatType> zutaten = (ArrayList<ZutatType>) rezept.getZutaten().getZutat();

		for(ZutatType zutat : zutaten){
			System.out.print("\r\t");
			if(zutat.getMenge() != null)
				System.out.print(zutat.getMenge());
			if(zutat.getEinheit() != null)
				System.out.print("\t" + zutat.getEinheit());
			System.out.print("\t" + zutat.getZutatenart());
		}

		System.out.println("\n\nZubereitung:");

		System.out.println("\n\t" + rezept.getZubereitung());

		ArrayList<KommentarType> kommentare = (ArrayList<KommentarType>) rezept.getKommentare().getKommentar();

		System.out.println("\nKommentare:\n");

		if(!kommentare.isEmpty()){
			for(KommentarType kommentar : kommentare){
				System.out.println("\tName: " + "\t\t\t" + kommentar.getVerfasser());
				System.out.println("\tFoto: " + "\t\t\t" + kommentar.getAvatar());
				System.out.println("\tNachricht: " + "\t\t" + kommentar.getNachricht());
				Date kommentar_datum = kommentar.getErstellungsdatum().toGregorianCalendar().getTime();
				System.out.println("\tGeschrieben am: " + "\t" + new SimpleDateFormat("dd.MM.yy HH:mm:ss").format(kommentar_datum));
				System.out.println();
			}
		}else{
			System.out.println("\tKeine Kommentare!");
		}

	}

	public static void kommentiereRezept(ArrayList<KommentarType> kommentare){
		System.out.print("\nName: ");
		String benutzerName = in.next();
		in.nextLine();
		System.out.print("Nachricht: ");
		String nachricht = in.nextLine();

		KommentarType neuerKommentar = new KommentarType();

		neuerKommentar.setVerfasser(benutzerName);
		neuerKommentar.setAvatar("http://www.url.com/"+benutzerName+"/avatar.jpg");
		neuerKommentar.setNachricht(nachricht);

		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(new Date());

		XMLGregorianCalendar newCal;

		try{
			newCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			neuerKommentar.setErstellungsdatum(newCal);
		} catch(DatatypeConfigurationException e) {}

		kommentare.add(neuerKommentar);
	}


	public static void main(String[] args) throws JAXBException {

		in = new Scanner(System.in);

		String xmlfile = XML_DOC;

		JAXBContext context = JAXBContext.newInstance(RezepteType.class);
        Unmarshaller um = context.createUnmarshaller();
        
        RezepteType rezepte = (RezepteType) um.unmarshal(new StreamSource(new File(xmlfile)), RezepteType.class).getValue();
        ArrayList<RezeptType> rezeptList = (ArrayList<RezeptType>) rezepte.getRezept();

        if(rezeptList.isEmpty()) {
            System.err.println("Keine Rezepte gefunden!");
            System.exit(1);
        }


        int auswahl = -1;

        do {
            System.out.println();
            System.out.println("[---- Rezeptsammlung ----]");
            System.out.println();
            System.out.println("1. Alle Rezepte");
            System.out.println("2. Rezept anzeigen");
            System.out.println("3. Rezept kommentieren");
            System.out.println("4. Programm beenden");
            System.out.println();
            System.out.println("Auswahl: ");

            auswahl = in.nextInt();
    
            System.out.println();
    
            int rezeptauswahl = -1;
    
            switch(auswahl) {
                case 1:
                	listeRezepte(rezeptList);
                break;
                case 2:
                	System.out.println("Rezeptauswahl: ");
                	rezeptauswahl = in.nextInt();
                	if((rezeptauswahl > 0) && (rezeptauswahl <= rezeptList.size())){
                		listeRezept(rezeptList.get(rezeptauswahl - 1));
                	} else {
                		System.out.println("Rezept nicht vorhanden!");
                	}
                break;
                case 3:
                	System.out.println("Rezeptauswahl: ");
                	rezeptauswahl = in.nextInt();
                	if((rezeptauswahl > 0) && (rezeptauswahl <= rezeptList.size())){
                		ArrayList<KommentarType> kommentare = (ArrayList<KommentarType>) rezeptList.get(rezeptauswahl - 1).getKommentare().getKommentar();
                    	kommentiereRezept(kommentare);
                	}
                	Marshaller m = context.createMarshaller();
                    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                    m.marshal(new ObjectFactory().createRezepte(rezepte), new File(xmlfile));
                break;
                default:
                    continue;
            }

        }
        while(auswahl != 4);
	}

}