
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ResponseHeader001 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ResponseHeader001">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="serviceID" type="{http://xsd.bns.com/types/common}serviceID"/>
 *         <element name="transactionID" type="{http://xsd.bns.com/types/common}transactionID" minOccurs="0"/>
 *         <element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="status" type="{http://xsd.bns.com/types/common}status"/>
 *         <element name="customer" type="{http://xsd.bns.com/types/common}CustomerInfo001" minOccurs="0"/>
 *         <element name="exception" type="{http://xsd.bns.com/types/common}Exception001" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="headerExtension" type="{http://xsd.bns.com/types/common}Extension001" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseHeader001", propOrder = {
    "serviceID",
    "transactionID",
    "timestamp",
    "status",
    "customer",
    "exception",
    "headerExtension"
})
public class ResponseHeader001 {

    @XmlElement(required = true)
    protected String serviceID;
    protected String transactionID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    protected int status;
    protected CustomerInfo001 customer;
    protected List<Exception001> exception;
    protected List<Extension001> headerExtension;

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfo001 }
     *     
     */
    public CustomerInfo001 getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfo001 }
     *     
     */
    public void setCustomer(CustomerInfo001 value) {
        this.customer = value;
    }

    /**
     * Gets the value of the exception property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the exception property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Exception001 }
     * 
     * 
     * @return
     *     The value of the exception property.
     */
    public List<Exception001> getException() {
        if (exception == null) {
            exception = new ArrayList<>();
        }
        return this.exception;
    }

    /**
     * Gets the value of the headerExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the headerExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaderExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension001 }
     * 
     * 
     * @return
     *     The value of the headerExtension property.
     */
    public List<Extension001> getHeaderExtension() {
        if (headerExtension == null) {
            headerExtension = new ArrayList<>();
        }
        return this.headerExtension;
    }

}
