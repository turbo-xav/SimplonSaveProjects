
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getFoodAttributeByIdResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getFoodAttributeByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FoodAttribute" type="{http://soap.workshop.java.simplon.co/}foodAttribute" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFoodAttributeByIdResponse", propOrder = {
    "foodAttribute"
})
public class GetFoodAttributeByIdResponse {

    @XmlElement(name = "FoodAttribute")
    protected FoodAttribute foodAttribute;

    /**
     * Obtient la valeur de la propriété foodAttribute.
     * 
     * @return
     *     possible object is
     *     {@link FoodAttribute }
     *     
     */
    public FoodAttribute getFoodAttribute() {
        return foodAttribute;
    }

    /**
     * Définit la valeur de la propriété foodAttribute.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodAttribute }
     *     
     */
    public void setFoodAttribute(FoodAttribute value) {
        this.foodAttribute = value;
    }

}
