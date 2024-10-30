
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Request002 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Request002">
 *   <complexContent>
 *     <extension base="{http://xsd.bns.com/types/common}Request001">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request002")
@XmlSeeAlso({
    GetAccountKycStatusRq.class,
    GetAccountListRq.class,
    GetClientInfoRq.class
})
public class Request002
    extends Request001
{


}
