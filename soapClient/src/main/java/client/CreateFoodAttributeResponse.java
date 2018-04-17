
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour createFoodAttributeResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="createFoodAttributeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FoodAttributeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createFoodAttributeResponse", propOrder = {
    "foodAttributeId"
})
public class CreateFoodAttributeResponse {

    @XmlElement(name = "FoodAttributeId")
    protected int foodAttributeId;

    /**
     * Obtient la valeur de la propriété foodAttributeId.
     * 
     */
    public int getFoodAttributeId() {
        return foodAttributeId;
    }

    /**
     * Définit la valeur de la propriété foodAttributeId.
     * 
     */
    public void setFoodAttributeId(int value) {
        this.foodAttributeId = value;
    }

}
