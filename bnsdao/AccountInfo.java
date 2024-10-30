
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for AccountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="accountNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="personalAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="legalEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="businessLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="accountAccessLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="primaryOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="accountKind" type="{http://xsd.bns.com/types/kycservice/v001}AccountKind"/>
 *         <element name="accountTypeStatusList" type="{http://xsd.bns.com/types/kycservice/v001}AccountTypeStatusList"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountInfo", namespace = "http://xsd.bns.com/types/kycservice/v001", propOrder = {

})
public class AccountInfo {

    @XmlElement(required = true)
    protected String accountNbr;
    @XmlElement(required = true)
    protected String personalAccount;
    protected String legalEntityName;
    @XmlElement(required = true)
    protected String businessLine;
    @XmlElement(required = true)
    protected String accountAccessLevel;
    @XmlElement(required = true)
    protected String primaryOwner;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AccountKind accountKind;
    @XmlElement(required = true)
    protected AccountTypeStatusList accountTypeStatusList;

    /**
     * Gets the value of the accountNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNbr() {
        return accountNbr;
    }

    /**
     * Sets the value of the accountNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNbr(String value) {
        this.accountNbr = value;
    }

    /**
     * Gets the value of the personalAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalAccount() {
        return personalAccount;
    }

    /**
     * Sets the value of the personalAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalAccount(String value) {
        this.personalAccount = value;
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
     * Gets the value of the businessLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessLine() {
        return businessLine;
    }

    /**
     * Sets the value of the businessLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessLine(String value) {
        this.businessLine = value;
    }

    /**
     * Gets the value of the accountAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAccessLevel() {
        return accountAccessLevel;
    }

    /**
     * Sets the value of the accountAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAccessLevel(String value) {
        this.accountAccessLevel = value;
    }

    /**
     * Gets the value of the primaryOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOwner() {
        return primaryOwner;
    }

    /**
     * Sets the value of the primaryOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOwner(String value) {
        this.primaryOwner = value;
    }

    /**
     * Gets the value of the accountKind property.
     * 
     * @return
     *     possible object is
     *     {@link AccountKind }
     *     
     */
    public AccountKind getAccountKind() {
        return accountKind;
    }

    /**
     * Sets the value of the accountKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountKind }
     *     
     */
    public void setAccountKind(AccountKind value) {
        this.accountKind = value;
    }

    /**
     * Gets the value of the accountTypeStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link AccountTypeStatusList }
     *     
     */
    public AccountTypeStatusList getAccountTypeStatusList() {
        return accountTypeStatusList;
    }

    /**
     * Sets the value of the accountTypeStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountTypeStatusList }
     *     
     */
    public void setAccountTypeStatusList(AccountTypeStatusList value) {
        this.accountTypeStatusList = value;
    }

}
