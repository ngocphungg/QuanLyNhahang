
package ChitietHD;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for countOrderDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="countOrderDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idhoadon" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countOrderDetails", propOrder = {
    "idhoadon"
})
public class CountOrderDetails {

    protected int idhoadon;

    /**
     * Gets the value of the idhoadon property.
     * 
     */
    public int getIdhoadon() {
        return idhoadon;
    }

    /**
     * Sets the value of the idhoadon property.
     * 
     */
    public void setIdhoadon(int value) {
        this.idhoadon = value;
    }

}
