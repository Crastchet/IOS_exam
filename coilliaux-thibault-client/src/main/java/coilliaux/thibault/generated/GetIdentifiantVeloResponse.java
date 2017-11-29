
package coilliaux.thibault.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getIdentifiantVeloResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getIdentifiantVeloResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIdentifiantVeloResponse", propOrder = {
    "_return"
})
public class GetIdentifiantVeloResponse {

    @XmlElement(name = "return")
    protected long _return;

    /**
     * Obtient la valeur de la propriété return.
     * 
     */
    public long getReturn() {
        return _return;
    }

    /**
     * Définit la valeur de la propriété return.
     * 
     */
    public void setReturn(long value) {
        this._return = value;
    }

}
