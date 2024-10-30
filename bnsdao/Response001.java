
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for Response001 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Response001">
 *   <complexContent>
 *     <extension base="{http://xsd.bns.com/types/common}Response">
 *       <sequence>
 *         <element name="header" type="{http://xsd.bns.com/types/common}ResponseHeader001"/>
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
@XmlType(name = "Response001", propOrder = {
    "header",
    "payload"
})
@XmlSeeAlso({
    Response002 .class
})
public class Response001
    extends Response
{

    @XmlElement(required = true)
    protected ResponseHeader001 header;
    protected Payload001 payload;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseHeader001 }
     *     
     */
    public ResponseHeader001 getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseHeader001 }
     *     
     */
    public void setHeader(ResponseHeader001 value) {
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
