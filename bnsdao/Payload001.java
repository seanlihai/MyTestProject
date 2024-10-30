
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Payload001 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Payload001">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="payloadObject" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="payloadExtension" type="{http://xsd.bns.com/types/common}PayloadExtension001" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payload001", propOrder = {
    "payloadObject",
    "payloadExtension"
})
public class Payload001 {

    protected List<Object> payloadObject;
    protected List<PayloadExtension001> payloadExtension;

    /**
     * Gets the value of the payloadObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the payloadObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayloadObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     * @return
     *     The value of the payloadObject property.
     */
    public List<Object> getPayloadObject() {
        if (payloadObject == null) {
            payloadObject = new ArrayList<>();
        }
        return this.payloadObject;
    }

    /**
     * Gets the value of the payloadExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the payloadExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayloadExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayloadExtension001 }
     * 
     * 
     * @return
     *     The value of the payloadExtension property.
     */
    public List<PayloadExtension001> getPayloadExtension() {
        if (payloadExtension == null) {
            payloadExtension = new ArrayList<>();
        }
        return this.payloadExtension;
    }

}
