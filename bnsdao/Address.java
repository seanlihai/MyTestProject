
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Address">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="addressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="unitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="unitNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="provinceTerritory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="postalCodeZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", namespace = "http://xsd.bns.com/types/kycservice/v001", propOrder = {

})
public class Address {

    @XmlElement(required = true)
    protected String addressLine1;
    protected String addressLine2;
    protected String unitType;
    protected String unitNumber;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(required = true)
    protected String provinceTerritory;
    @XmlElement(required = true)
    protected String country;
    protected String postalCodeZipCode;

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitType(String value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the unitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitNumber() {
        return unitNumber;
    }

    /**
     * Sets the value of the unitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitNumber(String value) {
        this.unitNumber = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the provinceTerritory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceTerritory() {
        return provinceTerritory;
    }

    /**
     * Sets the value of the provinceTerritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceTerritory(String value) {
        this.provinceTerritory = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the postalCodeZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCodeZipCode() {
        return postalCodeZipCode;
    }

    /**
     * Sets the value of the postalCodeZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCodeZipCode(String value) {
        this.postalCodeZipCode = value;
    }

}
