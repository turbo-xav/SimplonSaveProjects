
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour pingResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="pingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PingResult1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pingResponse", propOrder = {
    "pingResult1"
})
public class PingResponse {

    @XmlElement(name = "PingResult1")
    protected int pingResult1;

    /**
     * Obtient la valeur de la propriété pingResult1.
     * 
     */
    public int getPingResult1() {
        return pingResult1;
    }

    /**
     * Définit la valeur de la propriété pingResult1.
     * 
     */
    public void setPingResult1(int value) {
        this.pingResult1 = value;
    }

}
