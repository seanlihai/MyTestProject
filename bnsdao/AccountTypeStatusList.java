
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for AccountTypeStatusList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountTypeStatusList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="accountTypeStatus" type="{http://xsd.bns.com/types/kycservice/v001}AccountTypeStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountTypeStatusList", namespace = "http://xsd.bns.com/types/kycservice/v001", propOrder = {
    "accountTypeStatus"
})
public class AccountTypeStatusList {

    protected List<AccountTypeStatus> accountTypeStatus;

    /**
     * Gets the value of the accountTypeStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the accountTypeStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountTypeStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountTypeStatus }
     * 
     * 
     * @return
     *     The value of the accountTypeStatus property.
     */
    public List<AccountTypeStatus> getAccountTypeStatus() {
        if (accountTypeStatus == null) {
            accountTypeStatus = new ArrayList<>();
        }
        return this.accountTypeStatus;
    }

}
