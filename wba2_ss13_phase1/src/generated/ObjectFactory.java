//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.11 um 05:35:53 PM CEST 
//


package generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Einheit_QNAME = new QName("", "einheit");
    private final static QName _Brennwert_QNAME = new QName("", "brennwert");
    private final static QName _Rezept_QNAME = new QName("", "rezept");
    private final static QName _Erstellungsdatum_QNAME = new QName("", "erstellungsdatum");
    private final static QName _Bildadresse_QNAME = new QName("", "bildadresse");
    private final static QName _Rezepte_QNAME = new QName("", "rezepte");
    private final static QName _Avatar_QNAME = new QName("", "avatar");
    private final static QName _Zutatenart_QNAME = new QName("", "zutatenart");
    private final static QName _Portionen_QNAME = new QName("", "portionen");
    private final static QName _Zubereitung_QNAME = new QName("", "zubereitung");
    private final static QName _Titel_QNAME = new QName("", "titel");
    private final static QName _Kommentare_QNAME = new QName("", "kommentare");
    private final static QName _Zutat_QNAME = new QName("", "zutat");
    private final static QName _Benutzer_QNAME = new QName("", "benutzer");
    private final static QName _Schwierigkeitsgrad_QNAME = new QName("", "schwierigkeitsgrad");
    private final static QName _Menge_QNAME = new QName("", "menge");
    private final static QName _Zutaten_QNAME = new QName("", "zutaten");
    private final static QName _Kommentar_QNAME = new QName("", "kommentar");
    private final static QName _Foto_QNAME = new QName("", "foto");
    private final static QName _Arbeitszeit_QNAME = new QName("", "arbeitszeit");
    private final static QName _Fotos_QNAME = new QName("", "fotos");
    private final static QName _Subtitel_QNAME = new QName("", "subtitel");
    private final static QName _Verfasser_QNAME = new QName("", "verfasser");
    private final static QName _Nachricht_QNAME = new QName("", "nachricht");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BrennwertType }
     * 
     */
    public BrennwertType createBrennwertType() {
        return new BrennwertType();
    }

    /**
     * Create an instance of {@link RezeptType }
     * 
     */
    public RezeptType createRezeptType() {
        return new RezeptType();
    }

    /**
     * Create an instance of {@link RezepteType }
     * 
     */
    public RezepteType createRezepteType() {
        return new RezepteType();
    }

    /**
     * Create an instance of {@link KommentareType }
     * 
     */
    public KommentareType createKommentareType() {
        return new KommentareType();
    }

    /**
     * Create an instance of {@link ZutatType }
     * 
     */
    public ZutatType createZutatType() {
        return new ZutatType();
    }

    /**
     * Create an instance of {@link KommentarType }
     * 
     */
    public KommentarType createKommentarType() {
        return new KommentarType();
    }

    /**
     * Create an instance of {@link ZutatenType }
     * 
     */
    public ZutatenType createZutatenType() {
        return new ZutatenType();
    }

    /**
     * Create an instance of {@link ArbeitszeitType }
     * 
     */
    public ArbeitszeitType createArbeitszeitType() {
        return new ArbeitszeitType();
    }

    /**
     * Create an instance of {@link FotoType }
     * 
     */
    public FotoType createFotoType() {
        return new FotoType();
    }

    /**
     * Create an instance of {@link FotosType }
     * 
     */
    public FotosType createFotosType() {
        return new FotosType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "einheit")
    public JAXBElement<String> createEinheit(String value) {
        return new JAXBElement<String>(_Einheit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BrennwertType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "brennwert")
    public JAXBElement<BrennwertType> createBrennwert(BrennwertType value) {
        return new JAXBElement<BrennwertType>(_Brennwert_QNAME, BrennwertType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RezeptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rezept")
    public JAXBElement<RezeptType> createRezept(RezeptType value) {
        return new JAXBElement<RezeptType>(_Rezept_QNAME, RezeptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "erstellungsdatum")
    public JAXBElement<XMLGregorianCalendar> createErstellungsdatum(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Erstellungsdatum_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "bildadresse")
    public JAXBElement<String> createBildadresse(String value) {
        return new JAXBElement<String>(_Bildadresse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RezepteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rezepte")
    public JAXBElement<RezepteType> createRezepte(RezepteType value) {
        return new JAXBElement<RezepteType>(_Rezepte_QNAME, RezepteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "avatar")
    public JAXBElement<String> createAvatar(String value) {
        return new JAXBElement<String>(_Avatar_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "zutatenart")
    public JAXBElement<String> createZutatenart(String value) {
        return new JAXBElement<String>(_Zutatenart_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "portionen")
    public JAXBElement<BigInteger> createPortionen(BigInteger value) {
        return new JAXBElement<BigInteger>(_Portionen_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "zubereitung")
    public JAXBElement<String> createZubereitung(String value) {
        return new JAXBElement<String>(_Zubereitung_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "titel")
    public JAXBElement<String> createTitel(String value) {
        return new JAXBElement<String>(_Titel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KommentareType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kommentare")
    public JAXBElement<KommentareType> createKommentare(KommentareType value) {
        return new JAXBElement<KommentareType>(_Kommentare_QNAME, KommentareType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZutatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "zutat")
    public JAXBElement<ZutatType> createZutat(ZutatType value) {
        return new JAXBElement<ZutatType>(_Zutat_QNAME, ZutatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "benutzer")
    public JAXBElement<String> createBenutzer(String value) {
        return new JAXBElement<String>(_Benutzer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchwierigkeitsgradType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "schwierigkeitsgrad")
    public JAXBElement<SchwierigkeitsgradType> createSchwierigkeitsgrad(SchwierigkeitsgradType value) {
        return new JAXBElement<SchwierigkeitsgradType>(_Schwierigkeitsgrad_QNAME, SchwierigkeitsgradType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "menge")
    public JAXBElement<BigDecimal> createMenge(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Menge_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZutatenType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "zutaten")
    public JAXBElement<ZutatenType> createZutaten(ZutatenType value) {
        return new JAXBElement<ZutatenType>(_Zutaten_QNAME, ZutatenType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KommentarType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kommentar")
    public JAXBElement<KommentarType> createKommentar(KommentarType value) {
        return new JAXBElement<KommentarType>(_Kommentar_QNAME, KommentarType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FotoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "foto")
    public JAXBElement<FotoType> createFoto(FotoType value) {
        return new JAXBElement<FotoType>(_Foto_QNAME, FotoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArbeitszeitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arbeitszeit")
    public JAXBElement<ArbeitszeitType> createArbeitszeit(ArbeitszeitType value) {
        return new JAXBElement<ArbeitszeitType>(_Arbeitszeit_QNAME, ArbeitszeitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FotosType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fotos")
    public JAXBElement<FotosType> createFotos(FotosType value) {
        return new JAXBElement<FotosType>(_Fotos_QNAME, FotosType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "subtitel")
    public JAXBElement<String> createSubtitel(String value) {
        return new JAXBElement<String>(_Subtitel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "verfasser")
    public JAXBElement<String> createVerfasser(String value) {
        return new JAXBElement<String>(_Verfasser_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nachricht")
    public JAXBElement<String> createNachricht(String value) {
        return new JAXBElement<String>(_Nachricht_QNAME, String.class, null, value);
    }

}
