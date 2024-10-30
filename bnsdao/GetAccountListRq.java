
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
 *                   <element name="scotiaCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="socialInsuranceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="clientLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="clientFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="legalEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "GetAccountListRq", namespace = "http://xsd.bns.com/msgs/kycservice/v001")
public class GetAccountListRq
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
     *         <element name="scotiaCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="socialInsuranceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="clientLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="clientFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="legalEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "scotiaCardNumber",
        "socialInsuranceNumber",
        "clientLastName",
        "clientFirstName",
        "accountNumber",
        "legalEntityName"
    })
    public static class RequestPayload {

        @XmlElement(namespace = "http://xsd.bns.com/msgs/kycservice/v001")
        protected String scotiaCardNumber;
        @XmlElement(namespace = "http://xsd.bns.com/msgs/kycservice/v001")
        protected String socialInsuranceNumber;
        @XmlElement(namespace = "http://xsd.bns.com/msgs/kycservice/v001")
        protected String clientLastName;
        @XmlElement(namespace = "http://xsd.bns.com/msgs/kycservice/v001")
        protected String clientFirstName;
        @XmlElement(namespace = "http://xsd.bns.com/msgs/kycservice/v001")
        protected String accountNumber;
        @XmlElement(namespace = "http://xsd.bns.com/msgs/kycservice/v001")
        protected String legalEntityName;

        /**
         * Gets the value of the scotiaCardNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScotiaCardNumber() {
            return scotiaCardNumber;
        }

        /**
         * Sets the value of the scotiaCardNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScotiaCardNumber(String value) {
            this.scotiaCardNumber = value;
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
         * Gets the value of the clientLastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientLastName() {
            return clientLastName;
        }

        /**
         * Sets the value of the clientLastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientLastName(String value) {
            this.clientLastName = value;
        }

        /**
         * Gets the value of the clientFirstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientFirstName() {
            return clientFirstName;
        }

        /**
         * Sets the value of the clientFirstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientFirstName(String value) {
            this.clientFirstName = value;
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

    }

}
