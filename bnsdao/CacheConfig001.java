
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CacheConfig001 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CacheConfig001">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="maxSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="shrinkEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="shrinkIntervalSecs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="maxIdleTimeSecs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="maxLifeSecs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CacheConfig001", propOrder = {
    "name",
    "maxSize",
    "shrinkEnabled",
    "shrinkIntervalSecs",
    "maxIdleTimeSecs",
    "maxLifeSecs"
})
public class CacheConfig001 {

    @XmlElement(required = true)
    protected String name;
    protected int maxSize;
    protected boolean shrinkEnabled;
    protected int shrinkIntervalSecs;
    protected int maxIdleTimeSecs;
    protected int maxLifeSecs;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the maxSize property.
     * 
     */
    public int getMaxSize() {
        return maxSize;
    }

    /**
     * Sets the value of the maxSize property.
     * 
     */
    public void setMaxSize(int value) {
        this.maxSize = value;
    }

    /**
     * Gets the value of the shrinkEnabled property.
     * 
     */
    public boolean isShrinkEnabled() {
        return shrinkEnabled;
    }

    /**
     * Sets the value of the shrinkEnabled property.
     * 
     */
    public void setShrinkEnabled(boolean value) {
        this.shrinkEnabled = value;
    }

    /**
     * Gets the value of the shrinkIntervalSecs property.
     * 
     */
    public int getShrinkIntervalSecs() {
        return shrinkIntervalSecs;
    }

    /**
     * Sets the value of the shrinkIntervalSecs property.
     * 
     */
    public void setShrinkIntervalSecs(int value) {
        this.shrinkIntervalSecs = value;
    }

    /**
     * Gets the value of the maxIdleTimeSecs property.
     * 
     */
    public int getMaxIdleTimeSecs() {
        return maxIdleTimeSecs;
    }

    /**
     * Sets the value of the maxIdleTimeSecs property.
     * 
     */
    public void setMaxIdleTimeSecs(int value) {
        this.maxIdleTimeSecs = value;
    }

    /**
     * Gets the value of the maxLifeSecs property.
     * 
     */
    public int getMaxLifeSecs() {
        return maxLifeSecs;
    }

    /**
     * Sets the value of the maxLifeSecs property.
     * 
     */
    public void setMaxLifeSecs(int value) {
        this.maxLifeSecs = value;
    }

}
