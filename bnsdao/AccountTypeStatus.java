
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for AccountTypeStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountTypeStatus">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="accountTypeCode" type="{http://xsd.bns.com/types/kycservice/v001}AccountTypeCode"/>
 *         <element name="accountStatus" type="{http://xsd.bns.com/types/kycservice/v001}AccountStatus"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountTypeStatus", namespace = "http://xsd.bns.com/types/kycservice/v001", propOrder = {

})
public class AccountTypeStatus {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AccountTypeCode accountTypeCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AccountStatus accountStatus;

    /**
     * Gets the value of the accountTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountTypeCode }
     *     
     */
    public AccountTypeCode getAccountTypeCode() {
        return accountTypeCode;
    }

    /**
     * Sets the value of the accountTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountTypeCode }
     *     
     */
    public void setAccountTypeCode(AccountTypeCode value) {
        this.accountTypeCode = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatus }
     *     
     */
    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatus }
     *     
     */
    public void setAccountStatus(AccountStatus value) {
        this.accountStatus = value;
    }

}
