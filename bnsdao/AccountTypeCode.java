
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountTypeCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="MARGIN_LONG"/>
 *     <enumeration value="DIVIDEND_INCOME"/>
 *     <enumeration value="QSSP_INCOME"/>
 *     <enumeration value="MARGIN_SHORT"/>
 *     <enumeration value="QSSP_CASH"/>
 *     <enumeration value="OLTS_MONEY_MARKET"/>
 *     <enumeration value="DAP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountTypeCode", namespace = "http://xsd.bns.com/types/kycservice/v001")
@XmlEnum
public enum AccountTypeCode {

    CASH,
    MARGIN_LONG,
    DIVIDEND_INCOME,
    QSSP_INCOME,
    MARGIN_SHORT,
    QSSP_CASH,
    OLTS_MONEY_MARKET,
    DAP;

    public String value() {
        return name();
    }

    public static AccountTypeCode fromValue(String v) {
        return valueOf(v);
    }

}
