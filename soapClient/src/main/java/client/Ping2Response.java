
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ping2Response complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ping2Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PingResult2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ping2Response", propOrder = {
    "pingResult2"
})
public class Ping2Response {

    @XmlElement(name = "PingResult2")
    protected int pingResult2;

    /**
     * Obtient la valeur de la propriété pingResult2.
     * 
     */
    public int getPingResult2() {
        return pingResult2;
    }

    /**
     * Définit la valeur de la propriété pingResult2.
     * 
     */
    public void setPingResult2(int value) {
        this.pingResult2 = value;
    }

}
