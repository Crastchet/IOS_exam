
package coilliaux.thibault.generated;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-11-29T15:48:23.704+01:00
 * Generated source version: 3.2.0
 */

@WebFault(name = "VeloNonLoueParClientException", targetNamespace = "http://server.thibault.coilliaux/")
public class VeloNonLoueParClientException_Exception extends Exception {
    
    private coilliaux.thibault.generated.VeloNonLoueParClientException veloNonLoueParClientException;

    public VeloNonLoueParClientException_Exception() {
        super();
    }
    
    public VeloNonLoueParClientException_Exception(String message) {
        super(message);
    }
    
    public VeloNonLoueParClientException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public VeloNonLoueParClientException_Exception(String message, coilliaux.thibault.generated.VeloNonLoueParClientException veloNonLoueParClientException) {
        super(message);
        this.veloNonLoueParClientException = veloNonLoueParClientException;
    }

    public VeloNonLoueParClientException_Exception(String message, coilliaux.thibault.generated.VeloNonLoueParClientException veloNonLoueParClientException, Throwable cause) {
        super(message, cause);
        this.veloNonLoueParClientException = veloNonLoueParClientException;
    }

    public coilliaux.thibault.generated.VeloNonLoueParClientException getFaultInfo() {
        return this.veloNonLoueParClientException;
    }
}
