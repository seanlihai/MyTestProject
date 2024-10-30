
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientInfoGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClientInfoGroup">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="accountIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="initial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="socialInsuranceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="legalEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="homePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="workPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="workPhoneNumberExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mobilePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="address" type="{http://xsd.bns.com/types/kycservice/v001}Address"/>
 *         <element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientInfoGroup", namespace = "http://xsd.bns.com/types/kycservice/v001", propOrder = {

})
public class ClientInfoGroup {

    @XmlElement(required = true)
    protected String accountNumber;
    @XmlElement(required = true)
    protected String accountIndicator;
    protected String title;
    protected String firstName;
    protected String initial;
    protected String lastName;
    protected String socialInsuranceNumber;
    protected String legalEntityName;
    protected String contactName;
    protected String homePhoneNumber;
    protected String workPhoneNumber;
    protected String workPhoneNumberExtension;
    protected String mobilePhoneNumber;
    @XmlElement(required = true)
    protected Address address;
    protected String emailAddress;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountIndicator() {
        return accountIndicator;
    }

    /**
     * Sets the value of the accountIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountIndicator(String value) {
        this.accountIndicator = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the initial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitial() {
        return initial;
    }

    /**
     * Sets the value of the initial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitial(String value) {
        this.initial = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the socialInsuranceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialInsuranceNumber() {
        return socialInsuranceNumber;
    }

    /**
     * Sets the value of the socialInsuranceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialInsuranceNumber(String value) {
        this.socialInsuranceNumber = value;
    }

    /**
     * Gets the value of the legalEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalEntityName() {
        return legalEntityName;
    }

    /**
     * Sets the value of the legalEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalEntityName(String value) {
        this.legalEntityName = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the homePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    /**
     * Sets the value of the homePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhoneNumber(String value) {
        this.homePhoneNumber = value;
    }

    /**
     * Gets the value of the workPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    /**
     * Sets the value of the workPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhoneNumber(String value) {
        this.workPhoneNumber = value;
    }

    /**
     * Gets the value of the workPhoneNumberExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhoneNumberExtension() {
        return workPhoneNumberExtension;
    }

    /**
     * Sets the value of the workPhoneNumberExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhoneNumberExtension(String value) {
        this.workPhoneNumberExtension = value;
    }

    /**
     * Gets the value of the mobilePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * Sets the value of the mobilePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhoneNumber(String value) {
        this.mobilePhoneNumber = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

}
