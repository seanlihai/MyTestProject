
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
 *     <extension base="{http://xsd.bns.com/types/common}Response002">
 *       <sequence>
 *         <element name="ResponsePayload" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="respStatusGroup" type="{http://xsd.bns.com/types/kycservice/v001}ReqRespStatusGroup"/>
 *                   <element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="accountType" type="{http://xsd.bns.com/types/kycservice/v001}AccountTypeCode"/>
 *                   <element name="accountStatus" type="{http://xsd.bns.com/types/kycservice/v001}AccountStatus"/>
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
    "responsePayload"
})
@XmlRootElement(name = "GetAccountKycStatusRs", namespace = "http://xsd.bns.com/msgs/kycservice/v001")
public class GetAccountKycStatusRs
    extends Response002
{

    @XmlElement(name = "ResponsePayload", namespace = "http://xsd.bns.com/msgs/kycservice/v001")
    protected ResponsePayload responsePayload;

    /**
     * Gets the value of the responsePayload property.
     *
     * @return
     *     possible object is
     *     {@link ResponsePayload }
     *
     */
    public ResponsePayload getResponsePayload() {
        return responsePayload;
    }

    /**
     * Sets the value of the responsePayload property.
     *
     * @param value
     *     allowed object is
     *     {@link ResponsePayload }
     *
     */
    public void setResponsePayload(ResponsePayload value) {
        this.responsePayload = value;
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
     *         <element name="respStatusGroup" type="{http://xsd.bns.com/types/kycservice/v001}ReqRespStatusGroup"/>
     *         <element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="accountType" type="{http://xsd.bns.com/types/kycservice/v001}AccountTypeCode"/>
     *         <element name="accountStatus" type="{http://xsd.bns.com/types/kycservice/v001}AccountStatus"/>
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
        "respStatusGroup",
        "accountNumber",
        "accountType",
        "accountStatus"
    })
    public static class ResponsePayload {

        @XmlElement(namespace = "http://xsd.bns.com/msgs/kycservice/v001", required = true)
        protected ReqRespStatusGroup respStatusGroup;
        @XmlElement(namespace = "http://xsd.bns.com/msgs/kycservice/v001", required = true)
        protected String accountNumber;
        @XmlElement(namespace = "http://xsd.bns.com/msgs/kycservice/v001", required = true)
        @XmlSchemaType(name = "string")
        protected AccountTypeCode accountType;
        @XmlElement(namespace = "http://xsd.bns.com/msgs/kycservice/v001", required = true)
        @XmlSchemaType(name = "string")
        protected AccountStatus accountStatus;

        /**
         * Gets the value of the respStatusGroup property.
         * 
         * @return
         *     possible object is
         *     {@link ReqRespStatusGroup }
         *     
         */
        public ReqRespStatusGroup getRespStatusGroup() {
            return respStatusGroup;
        }

        /**
         * Sets the value of the respStatusGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReqRespStatusGroup }
         *     
         */
        public void setRespStatusGroup(ReqRespStatusGroup value) {
            this.respStatusGroup = value;
        }

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

}
