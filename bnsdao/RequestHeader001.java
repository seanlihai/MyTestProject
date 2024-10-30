
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for RequestHeader001 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequestHeader001">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="userID" type="{http://xsd.bns.com/types/common}stringReq30"/>
 *         <element name="organization" type="{http://xsd.bns.com/types/common}stringReq30" minOccurs="0"/>
 *         <element name="countryCode" type="{http://xsd.bns.com/types/common}stringFixed2" minOccurs="0"/>
 *         <element name="languageCode" type="{http://xsd.bns.com/types/common}stringFixed2" minOccurs="0"/>
 *         <element name="userLocation" type="{http://xsd.bns.com/types/common}stringOpt20" minOccurs="0"/>
 *         <element name="customerID" type="{http://xsd.bns.com/types/common}stringOpt20" minOccurs="0"/>
 *         <element name="customerLocation" type="{http://xsd.bns.com/types/common}stringOpt20" minOccurs="0"/>
 *         <element name="transactionID" type="{http://xsd.bns.com/types/common}transactionID" minOccurs="0"/>
 *         <element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="userServer" type="{http://xsd.bns.com/types/common}stringOpt100" minOccurs="0"/>
 *         <element name="channel" type="{http://xsd.bns.com/types/common}stringOpt30" minOccurs="0"/>
 *         <element name="application" type="{http://xsd.bns.com/types/common}stringOpt10" minOccurs="0"/>
 *         <element name="clientSessionID" type="{http://xsd.bns.com/types/common}stringOpt250" minOccurs="0"/>
 *         <element name="userDevice" type="{http://xsd.bns.com/types/common}stringOpt100" minOccurs="0"/>
 *         <element name="userDeviceDetails" type="{http://xsd.bns.com/types/common}userDeviceDetails_Type" maxOccurs="5" minOccurs="0"/>
 *         <element name="reload" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="local" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="caching" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ttl">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="0"/>
 *               <maxInclusive value="180000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="customer" type="{http://xsd.bns.com/types/common}CustomerInfo001" minOccurs="0"/>
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
@XmlType(name = "RequestHeader001", propOrder = {
    "userID",
    "organization",
    "countryCode",
    "languageCode",
    "userLocation",
    "customerID",
    "customerLocation",
    "transactionID",
    "timestamp",
    "userServer",
    "channel",
    "application",
    "clientSessionID",
    "userDevice",
    "userDeviceDetails",
    "reload",
    "local",
    "caching",
    "ttl",
    "customer",
    "headerExtension"
})
public class RequestHeader001 {

    @XmlElement(required = true)
    protected String userID;
    protected String organization;
    protected String countryCode;
    protected String languageCode;
    protected String userLocation;
    protected String customerID;
    protected String customerLocation;
    protected String transactionID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    protected String userServer;
    protected String channel;
    protected String application;
    protected String clientSessionID;
    protected String userDevice;
    protected List<UserDeviceDetailsType> userDeviceDetails;
    protected boolean reload;
    protected boolean local;
    protected boolean caching;
    protected int ttl;
    protected CustomerInfo001 customer;
    protected List<Extension001> headerExtension;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the userLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLocation() {
        return userLocation;
    }

    /**
     * Sets the value of the userLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLocation(String value) {
        this.userLocation = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the customerLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLocation() {
        return customerLocation;
    }

    /**
     * Sets the value of the customerLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLocation(String value) {
        this.customerLocation = value;
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
     * Gets the value of the userServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserServer() {
        return userServer;
    }

    /**
     * Sets the value of the userServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserServer(String value) {
        this.userServer = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the clientSessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSessionID() {
        return clientSessionID;
    }

    /**
     * Sets the value of the clientSessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSessionID(String value) {
        this.clientSessionID = value;
    }

    /**
     * Gets the value of the userDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDevice() {
        return userDevice;
    }

    /**
     * Sets the value of the userDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDevice(String value) {
        this.userDevice = value;
    }

    /**
     * Gets the value of the userDeviceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the userDeviceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDeviceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDeviceDetailsType }
     * 
     * 
     * @return
     *     The value of the userDeviceDetails property.
     */
    public List<UserDeviceDetailsType> getUserDeviceDetails() {
        if (userDeviceDetails == null) {
            userDeviceDetails = new ArrayList<>();
        }
        return this.userDeviceDetails;
    }

    /**
     * Gets the value of the reload property.
     * 
     */
    public boolean isReload() {
        return reload;
    }

    /**
     * Sets the value of the reload property.
     * 
     */
    public void setReload(boolean value) {
        this.reload = value;
    }

    /**
     * Gets the value of the local property.
     * 
     */
    public boolean isLocal() {
        return local;
    }

    /**
     * Sets the value of the local property.
     * 
     */
    public void setLocal(boolean value) {
        this.local = value;
    }

    /**
     * Gets the value of the caching property.
     * 
     */
    public boolean isCaching() {
        return caching;
    }

    /**
     * Sets the value of the caching property.
     * 
     */
    public void setCaching(boolean value) {
        this.caching = value;
    }

    /**
     * Gets the value of the ttl property.
     * 
     */
    public int getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     */
    public void setTtl(int value) {
        this.ttl = value;
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
