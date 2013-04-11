//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.11 um 05:35:53 PM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für schwierigkeitsgrad_type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="schwierigkeitsgrad_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="leicht"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="schwer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "schwierigkeitsgrad_type")
@XmlEnum
public enum SchwierigkeitsgradType {

    @XmlEnumValue("leicht")
    LEICHT("leicht"),
    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("schwer")
    SCHWER("schwer");
    private final String value;

    SchwierigkeitsgradType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SchwierigkeitsgradType fromValue(String v) {
        for (SchwierigkeitsgradType c: SchwierigkeitsgradType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
