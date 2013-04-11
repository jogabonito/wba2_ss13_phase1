//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.11 um 05:35:53 PM CEST 
//


package generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für rezept_type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="rezept_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}titel"/>
 *         &lt;element ref="{}subtitel" minOccurs="0"/>
 *         &lt;element ref="{}fotos"/>
 *         &lt;element ref="{}portionen"/>
 *         &lt;element ref="{}zutaten"/>
 *         &lt;element ref="{}arbeitszeit"/>
 *         &lt;element ref="{}schwierigkeitsgrad"/>
 *         &lt;element ref="{}brennwert"/>
 *         &lt;element ref="{}zubereitung"/>
 *         &lt;element ref="{}kommentare"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rezept_type", propOrder = {
    "titel",
    "subtitel",
    "fotos",
    "portionen",
    "zutaten",
    "arbeitszeit",
    "schwierigkeitsgrad",
    "brennwert",
    "zubereitung",
    "kommentare"
})
public class RezeptType {

    @XmlElement(required = true)
    protected String titel;
    protected String subtitel;
    @XmlElement(required = true)
    protected FotosType fotos;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger portionen;
    @XmlElement(required = true)
    protected ZutatenType zutaten;
    @XmlElement(required = true)
    protected ArbeitszeitType arbeitszeit;
    @XmlElement(required = true)
    protected SchwierigkeitsgradType schwierigkeitsgrad;
    @XmlElement(required = true)
    protected BrennwertType brennwert;
    @XmlElement(required = true)
    protected String zubereitung;
    @XmlElement(required = true)
    protected KommentareType kommentare;

    /**
     * Ruft den Wert der titel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Legt den Wert der titel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitel(String value) {
        this.titel = value;
    }

    /**
     * Ruft den Wert der subtitel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtitel() {
        return subtitel;
    }

    /**
     * Legt den Wert der subtitel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtitel(String value) {
        this.subtitel = value;
    }

    /**
     * Ruft den Wert der fotos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FotosType }
     *     
     */
    public FotosType getFotos() {
        return fotos;
    }

    /**
     * Legt den Wert der fotos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FotosType }
     *     
     */
    public void setFotos(FotosType value) {
        this.fotos = value;
    }

    /**
     * Ruft den Wert der portionen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPortionen() {
        return portionen;
    }

    /**
     * Legt den Wert der portionen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPortionen(BigInteger value) {
        this.portionen = value;
    }

    /**
     * Ruft den Wert der zutaten-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ZutatenType }
     *     
     */
    public ZutatenType getZutaten() {
        return zutaten;
    }

    /**
     * Legt den Wert der zutaten-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ZutatenType }
     *     
     */
    public void setZutaten(ZutatenType value) {
        this.zutaten = value;
    }

    /**
     * Ruft den Wert der arbeitszeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArbeitszeitType }
     *     
     */
    public ArbeitszeitType getArbeitszeit() {
        return arbeitszeit;
    }

    /**
     * Legt den Wert der arbeitszeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArbeitszeitType }
     *     
     */
    public void setArbeitszeit(ArbeitszeitType value) {
        this.arbeitszeit = value;
    }

    /**
     * Ruft den Wert der schwierigkeitsgrad-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SchwierigkeitsgradType }
     *     
     */
    public SchwierigkeitsgradType getSchwierigkeitsgrad() {
        return schwierigkeitsgrad;
    }

    /**
     * Legt den Wert der schwierigkeitsgrad-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SchwierigkeitsgradType }
     *     
     */
    public void setSchwierigkeitsgrad(SchwierigkeitsgradType value) {
        this.schwierigkeitsgrad = value;
    }

    /**
     * Ruft den Wert der brennwert-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BrennwertType }
     *     
     */
    public BrennwertType getBrennwert() {
        return brennwert;
    }

    /**
     * Legt den Wert der brennwert-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BrennwertType }
     *     
     */
    public void setBrennwert(BrennwertType value) {
        this.brennwert = value;
    }

    /**
     * Ruft den Wert der zubereitung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZubereitung() {
        return zubereitung;
    }

    /**
     * Legt den Wert der zubereitung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZubereitung(String value) {
        this.zubereitung = value;
    }

    /**
     * Ruft den Wert der kommentare-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link KommentareType }
     *     
     */
    public KommentareType getKommentare() {
        return kommentare;
    }

    /**
     * Legt den Wert der kommentare-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link KommentareType }
     *     
     */
    public void setKommentare(KommentareType value) {
        this.kommentare = value;
    }

}
