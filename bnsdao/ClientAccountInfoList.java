
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ClientAccountInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClientAccountInfoList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="clientInfo" type="{http://xsd.bns.com/types/kycservice/v001}ClientAccountInfo" maxOccurs="100" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientAccountInfoList", namespace = "http://xsd.bns.com/types/kycservice/v001", propOrder = {
    "clientInfo"
})
public class ClientAccountInfoList {

    protected List<ClientAccountInfo> clientInfo;

    /**
     * Gets the value of the clientInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clientInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientAccountInfo }
     * 
     * 
     * @return
     *     The value of the clientInfo property.
     */
    public List<ClientAccountInfo> getClientInfo() {
        if (clientInfo == null) {
            clientInfo = new ArrayList<>();
        }
        return this.clientInfo;
    }

}
