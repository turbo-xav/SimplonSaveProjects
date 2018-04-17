
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour foodAttribute complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="foodAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="category" type="{http://soap.workshop.java.simplon.co/}foodCategory" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="energy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="carb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foodAttribute", propOrder = {
    "id",
    "category",
    "name",
    "energy",
    "prot",
    "fat",
    "carb"
})
public class FoodAttribute {

    protected int id;
    protected FoodCategory category;
    protected String name;
    protected int energy;
    protected int prot;
    protected int fat;
    protected int carb;

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété category.
     * 
     * @return
     *     possible object is
     *     {@link FoodCategory }
     *     
     */
    public FoodCategory getCategory() {
        return category;
    }

    /**
     * Définit la valeur de la propriété category.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodCategory }
     *     
     */
    public void setCategory(FoodCategory value) {
        this.category = value;
    }

    /**
     * Obtient la valeur de la propriété name.
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
     * Définit la valeur de la propriété name.
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
     * Obtient la valeur de la propriété energy.
     * 
     */
    public int getEnergy() {
        return energy;
    }

    /**
     * Définit la valeur de la propriété energy.
     * 
     */
    public void setEnergy(int value) {
        this.energy = value;
    }

    /**
     * Obtient la valeur de la propriété prot.
     * 
     */
    public int getProt() {
        return prot;
    }

    /**
     * Définit la valeur de la propriété prot.
     * 
     */
    public void setProt(int value) {
        this.prot = value;
    }

    /**
     * Obtient la valeur de la propriété fat.
     * 
     */
    public int getFat() {
        return fat;
    }

    /**
     * Définit la valeur de la propriété fat.
     * 
     */
    public void setFat(int value) {
        this.fat = value;
    }

    /**
     * Obtient la valeur de la propriété carb.
     * 
     */
    public int getCarb() {
        return carb;
    }

    /**
     * Définit la valeur de la propriété carb.
     * 
     */
    public void setCarb(int value) {
        this.carb = value;
    }

}
