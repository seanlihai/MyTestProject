
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * Customer information stored on various software systems.
 * 
 * <p>Java class for CustomerSystemInfo001 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CustomerSystemInfo001">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sysId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="infoId" type="{http://xsd.bns.com/types/common}CustomerInfoId001" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSystemInfo001", propOrder = {
    "sysId",
    "infoId"
})
public class CustomerSystemInfo001 {

    @XmlElement(required = true)
    protected String sysId;
    protected List<CustomerInfoId001> infoId;

    /**
     * Gets the value of the sysId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysId() {
        return sysId;
    }

    /**
     * Sets the value of the sysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysId(String value) {
        this.sysId = value;
    }

    /**
     * Gets the value of the infoId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the infoId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerInfoId001 }
     * 
     * 
     * @return
     *     The value of the infoId property.
     */
    public List<CustomerInfoId001> getInfoId() {
        if (infoId == null) {
            infoId = new ArrayList<>();
        }
        return this.infoId;
    }

}
