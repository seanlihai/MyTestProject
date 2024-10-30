
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Language.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Language">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ENGLISH"/>
 *     <enumeration value="FRENCH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Language", namespace = "http://xsd.bns.com/types/kycservice/v001")
@XmlEnum
public enum Language {

    ENGLISH,
    FRENCH;

    public String value() {
        return name();
    }

    public static Language fromValue(String v) {
        return valueOf(v);
    }

}
