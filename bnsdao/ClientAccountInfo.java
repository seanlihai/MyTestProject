
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ClientAccountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClientAccountInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="clientUserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dob" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="scotiaCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="language" type="{http://xsd.bns.com/types/kycservice/v001}Language" minOccurs="0"/>
 *         <element name="accountInfoList" type="{http://xsd.bns.com/types/kycservice/v001}AccountInfoList"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientAccountInfo", namespace = "http://xsd.bns.com/types/kycservice/v001", propOrder = {

})
public class ClientAccountInfo {

    @XmlElement(required = true)
    protected String clientUserId;
    protected String firstName;
    protected String lastName;
    protected String sin;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dob;
    protected String scotiaCard;
    @XmlSchemaType(name = "string")
    protected Language language;
    @XmlElement(required = true)
    protected AccountInfoList accountInfoList;

    /**
     * Gets the value of the clientUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientUserId() {
        return clientUserId;
    }

    /**
     * Sets the value of the clientUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientUserId(String value) {
        this.clientUserId = value;
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
     * Gets the value of the sin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSin() {
        return sin;
    }

    /**
     * Sets the value of the sin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSin(String value) {
        this.sin = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDob() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDob(XMLGregorianCalendar value) {
        this.dob = value;
    }

    /**
     * Gets the value of the scotiaCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScotiaCard() {
        return scotiaCard;
    }

    /**
     * Sets the value of the scotiaCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScotiaCard(String value) {
        this.scotiaCard = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLanguage(Language value) {
        this.language = value;
    }

    /**
     * Gets the value of the accountInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInfoList }
     *     
     */
    public AccountInfoList getAccountInfoList() {
        return accountInfoList;
    }

    /**
     * Sets the value of the accountInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInfoList }
     *     
     */
    public void setAccountInfoList(AccountInfoList value) {
        this.accountInfoList = value;
    }

}
