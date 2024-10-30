
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponsePayload001 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ResponsePayload001">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="header" type="{http://xsd.bns.com/types/common}ResponseHeader001"/>
 *         <element name="payload" type="{http://xsd.bns.com/types/common}Payload001" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsePayload001", propOrder = {
    "header",
    "payload"
})
public class ResponsePayload001 {

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
