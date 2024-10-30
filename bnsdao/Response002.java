
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response002 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Response002">
 *   <complexContent>
 *     <extension base="{http://xsd.bns.com/types/common}Response001">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response002")
@XmlSeeAlso({
    GetAccountKycStatusRs.class,
    GetAccountListRs.class,
    GetClientInfoRs.class
})
public class Response002
    extends Response001
{


}
