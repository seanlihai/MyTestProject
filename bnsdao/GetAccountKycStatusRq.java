
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://xsd.bns.com/types/common}Request002">
 *       <sequence>
 *         <element name="RequestPayload">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="accountType" type="{http://xsd.bns.com/types/kycservice/v001}AccountTypeCode"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestPayload"
})
@XmlRootElement(name = "GetAccountKycStatusRq", namespace = "http://xsd.bns.com/msgs/kycservice/v001")
public class GetAccountKycStatusRq
    extends Request002
{

    @XmlElement(name = "RequestPayload", namespace = "http://xsd.bns.com/msgs/kycservice/v001", required = true)
    protected RequestPayload requestPayload;

    /**
     * Gets the value of the requestPayload property.
     * 
     * @return
     *     possible object is
     *     {@link RequestPayload }
     *     
     */
    public RequestPayload getRequestPayload() {
        return requestPayload;
    }

    /**
     * Sets the value of the requestPayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestPayload }
     *     
     */
    public void setRequestPayload(RequestPayload value) {
        this.requestPayload = value;
    }


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
     *         <element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="accountType" type="{http://xsd.bns.com/types/kycservice/v001}AccountTypeCode"/>
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
        "accountNumber",
        "accountType"
    })
    public static class RequestPayload {

        @XmlElement(namespace = "http://xsd.bns.com/msgs/kycservice/v001", required = true)
        protected String accountNumber;
        @XmlElement(namespace = "http://xsd.bns.com/msgs/kycservice/v001", required = true)
        @XmlSchemaType(name = "string")
        protected AccountTypeCode accountType;

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
         * Gets the value of the accountType property.
         * 
         * @return
         *     possible object is
         *     {@link AccountTypeCode }
         *     
         */
        public AccountTypeCode getAccountType() {
            return accountType;
        }

        /**
         * Sets the value of the accountType property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccountTypeCode }
         *     
         */
        public void setAccountType(AccountTypeCode value) {
            this.accountType = value;
        }

    }

}
