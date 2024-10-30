
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="version" type="{http://xsd.bns.com/types/common}version"/>
 *         <element name="connectionID" type="{http://xsd.bns.com/types/common}stringOpt50" minOccurs="0"/>
 *         <element name="requestID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="request" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "version",
    "connectionID",
    "requestID",
    "request"
})
@XmlRootElement(name = "RequestList")
public class RequestList {

    @XmlElement(required = true)
    protected String version;
    protected String connectionID;
    protected int requestID;
    @XmlElement(required = true)
    protected List<Object> request;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the connectionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionID() {
        return connectionID;
    }

    /**
     * Sets the value of the connectionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionID(String value) {
        this.connectionID = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     */
    public int getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     */
    public void setRequestID(int value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the request property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     * @return
     *     The value of the request property.
     */
    public List<Object> getRequest() {
        if (request == null) {
            request = new ArrayList<>();
        }
        return this.request;
    }

}
