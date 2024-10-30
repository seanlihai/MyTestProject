
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
 *                   <element name="clientAccountInfoList" type="{http://xsd.bns.com/types/kycservice/v001}ClientAccountInfoList"/>
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
@XmlRootElement(name = "GetAccountListRs", namespace = "http://xsd.bns.com/msgs/kycservice/v001")
public class GetAccountListRs
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
     *         <element name="clientAccountInfoList" type="{http://xsd.bns.com/types/kycservice/v001}ClientAccountInfoList"/>
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
        "clientAccountInfoList"
    })
    public static class ResponsePayload {

        @XmlElement(namespace = "http://xsd.bns.com/msgs/kycservice/v001", required = true)
        protected ReqRespStatusGroup respStatusGroup;
        @XmlElement(namespace = "http://xsd.bns.com/msgs/kycservice/v001", required = true)
        protected ClientAccountInfoList clientAccountInfoList;

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
         * Gets the value of the clientAccountInfoList property.
         * 
         * @return
         *     possible object is
         *     {@link ClientAccountInfoList }
         *     
         */
        public ClientAccountInfoList getClientAccountInfoList() {
            return clientAccountInfoList;
        }

        /**
         * Sets the value of the clientAccountInfoList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ClientAccountInfoList }
         *     
         */
        public void setClientAccountInfoList(ClientAccountInfoList value) {
            this.clientAccountInfoList = value;
        }

    }

}
