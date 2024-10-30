
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APOR"/>
 *     <enumeration value="APPR"/>
 *     <enumeration value="CLOS"/>
 *     <enumeration value="DECL"/>
 *     <enumeration value="PANO"/>
 *     <enumeration value="PEND"/>
 *     <enumeration value="PO"/>
 *     <enumeration value="REST"/>
 *     <enumeration value="SCAP"/>
 *     <enumeration value="TANO"/>
 *     <enumeration value="TEMP"/>
 *     <enumeration value="UREV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountStatus", namespace = "http://xsd.bns.com/types/kycservice/v001")
@XmlEnum
public enum AccountStatus {

    APOR,
    APPR,
    CLOS,
    DECL,
    PANO,
    PEND,
    PO,
    REST,
    SCAP,
    TANO,
    TEMP,
    UREV;

    public String value() {
        return name();
    }

    public static AccountStatus fromValue(String v) {
        return valueOf(v);
    }

}
