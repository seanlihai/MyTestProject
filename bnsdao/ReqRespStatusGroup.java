
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReqRespStatusGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReqRespStatusGroup">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="requestStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="returnCodes" type="{http://xsd.bns.com/types/kycservice/v001}ReturnCodesList" minOccurs="0"/>
 *         <element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReqRespStatusGroup", namespace = "http://xsd.bns.com/types/kycservice/v001", propOrder = {

})
public class ReqRespStatusGroup {

    protected boolean requestStatus;
    protected ReturnCodesList returnCodes;
    protected String reason;

    /**
     * Gets the value of the requestStatus property.
     * 
     */
    public boolean isRequestStatus() {
        return requestStatus;
    }

    /**
     * Sets the value of the requestStatus property.
     * 
     */
    public void setRequestStatus(boolean value) {
        this.requestStatus = value;
    }

    /**
     * Gets the value of the returnCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnCodesList }
     *     
     */
    public ReturnCodesList getReturnCodes() {
        return returnCodes;
    }

    /**
     * Sets the value of the returnCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnCodesList }
     *     
     */
    public void setReturnCodes(ReturnCodesList value) {
        this.returnCodes = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
