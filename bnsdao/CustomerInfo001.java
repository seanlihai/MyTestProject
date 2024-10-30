
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Customer of the client system
 * 
 * <p>Java class for CustomerInfo001 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CustomerInfo001">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="custId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="custSysInfo" type="{http://xsd.bns.com/types/common}CustomerSystemInfo001" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerInfo001", propOrder = {
    "custId",
    "cardNumber",
    "custSysInfo"
})
public class CustomerInfo001 {

    protected String custId;
    protected String cardNumber;
    protected List<CustomerSystemInfo001> custSysInfo;

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustId(String value) {
        this.custId = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the custSysInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the custSysInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustSysInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSystemInfo001 }
     * 
     * 
     * @return
     *     The value of the custSysInfo property.
     */
    public List<CustomerSystemInfo001> getCustSysInfo() {
        if (custSysInfo == null) {
            custSysInfo = new ArrayList<>();
        }
        return this.custSysInfo;
    }

}
