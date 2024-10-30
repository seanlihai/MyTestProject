
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for Request001 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Request001">
 *   <complexContent>
 *     <extension base="{http://xsd.bns.com/types/common}Request">
 *       <sequence>
 *         <element name="header" type="{http://xsd.bns.com/types/common}RequestHeader001"/>
 *         <element name="payload" type="{http://xsd.bns.com/types/common}Payload001" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request001", propOrder = {
    "header",
    "payload"
})
@XmlSeeAlso({
    Request002 .class
})
public class Request001
    extends Request
{

    @XmlElement(required = true)
    protected RequestHeader001 header;
    protected Payload001 payload;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader001 }
     *     
     */
    public RequestHeader001 getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader001 }
     *     
     */
    public void setHeader(RequestHeader001 value) {
        this.header = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link Payload001 }
     *     
     */
    public Payload001 getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payload001 }
     *     
     */
    public void setPayload(Payload001 value) {
        this.payload = value;
    }

}
