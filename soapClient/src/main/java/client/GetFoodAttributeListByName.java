
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getFoodAttributeListByName complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getFoodAttributeListByName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nameFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFoodAttributeListByName", propOrder = {
    "nameFilter"
})
public class GetFoodAttributeListByName {

    protected String nameFilter;

    /**
     * Obtient la valeur de la propriété nameFilter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFilter() {
        return nameFilter;
    }

    /**
     * Définit la valeur de la propriété nameFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFilter(String value) {
        this.nameFilter = value;
    }

}
