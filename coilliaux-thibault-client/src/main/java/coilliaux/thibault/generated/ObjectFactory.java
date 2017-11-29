
package coilliaux.thibault.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the coilliaux.thibault.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EnregistrerLocation_QNAME = new QName("http://server.thibault.coilliaux/", "enregistrerLocation");
    private final static QName _EnregistrerLocationResponse_QNAME = new QName("http://server.thibault.coilliaux/", "enregistrerLocationResponse");
    private final static QName _GetIdentifiantClient_QNAME = new QName("http://server.thibault.coilliaux/", "getIdentifiantClient");
    private final static QName _GetIdentifiantClientResponse_QNAME = new QName("http://server.thibault.coilliaux/", "getIdentifiantClientResponse");
    private final static QName _GetIdentifiantVelo_QNAME = new QName("http://server.thibault.coilliaux/", "getIdentifiantVelo");
    private final static QName _GetIdentifiantVeloResponse_QNAME = new QName("http://server.thibault.coilliaux/", "getIdentifiantVeloResponse");
    private final static QName _RemettreVelo_QNAME = new QName("http://server.thibault.coilliaux/", "remettreVelo");
    private final static QName _RemettreVeloResponse_QNAME = new QName("http://server.thibault.coilliaux/", "remettreVeloResponse");
    private final static QName _VeloNonLoueParClientException_QNAME = new QName("http://server.thibault.coilliaux/", "VeloNonLoueParClientException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: coilliaux.thibault.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnregistrerLocation }
     * 
     */
    public EnregistrerLocation createEnregistrerLocation() {
        return new EnregistrerLocation();
    }

    /**
     * Create an instance of {@link EnregistrerLocationResponse }
     * 
     */
    public EnregistrerLocationResponse createEnregistrerLocationResponse() {
        return new EnregistrerLocationResponse();
    }

    /**
     * Create an instance of {@link GetIdentifiantClient }
     * 
     */
    public GetIdentifiantClient createGetIdentifiantClient() {
        return new GetIdentifiantClient();
    }

    /**
     * Create an instance of {@link GetIdentifiantClientResponse }
     * 
     */
    public GetIdentifiantClientResponse createGetIdentifiantClientResponse() {
        return new GetIdentifiantClientResponse();
    }

    /**
     * Create an instance of {@link GetIdentifiantVelo }
     * 
     */
    public GetIdentifiantVelo createGetIdentifiantVelo() {
        return new GetIdentifiantVelo();
    }

    /**
     * Create an instance of {@link GetIdentifiantVeloResponse }
     * 
     */
    public GetIdentifiantVeloResponse createGetIdentifiantVeloResponse() {
        return new GetIdentifiantVeloResponse();
    }

    /**
     * Create an instance of {@link RemettreVelo }
     * 
     */
    public RemettreVelo createRemettreVelo() {
        return new RemettreVelo();
    }

    /**
     * Create an instance of {@link RemettreVeloResponse }
     * 
     */
    public RemettreVeloResponse createRemettreVeloResponse() {
        return new RemettreVeloResponse();
    }

    /**
     * Create an instance of {@link VeloNonLoueParClientException }
     * 
     */
    public VeloNonLoueParClientException createVeloNonLoueParClientException() {
        return new VeloNonLoueParClientException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnregistrerLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.thibault.coilliaux/", name = "enregistrerLocation")
    public JAXBElement<EnregistrerLocation> createEnregistrerLocation(EnregistrerLocation value) {
        return new JAXBElement<EnregistrerLocation>(_EnregistrerLocation_QNAME, EnregistrerLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnregistrerLocationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.thibault.coilliaux/", name = "enregistrerLocationResponse")
    public JAXBElement<EnregistrerLocationResponse> createEnregistrerLocationResponse(EnregistrerLocationResponse value) {
        return new JAXBElement<EnregistrerLocationResponse>(_EnregistrerLocationResponse_QNAME, EnregistrerLocationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdentifiantClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.thibault.coilliaux/", name = "getIdentifiantClient")
    public JAXBElement<GetIdentifiantClient> createGetIdentifiantClient(GetIdentifiantClient value) {
        return new JAXBElement<GetIdentifiantClient>(_GetIdentifiantClient_QNAME, GetIdentifiantClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdentifiantClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.thibault.coilliaux/", name = "getIdentifiantClientResponse")
    public JAXBElement<GetIdentifiantClientResponse> createGetIdentifiantClientResponse(GetIdentifiantClientResponse value) {
        return new JAXBElement<GetIdentifiantClientResponse>(_GetIdentifiantClientResponse_QNAME, GetIdentifiantClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdentifiantVelo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.thibault.coilliaux/", name = "getIdentifiantVelo")
    public JAXBElement<GetIdentifiantVelo> createGetIdentifiantVelo(GetIdentifiantVelo value) {
        return new JAXBElement<GetIdentifiantVelo>(_GetIdentifiantVelo_QNAME, GetIdentifiantVelo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdentifiantVeloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.thibault.coilliaux/", name = "getIdentifiantVeloResponse")
    public JAXBElement<GetIdentifiantVeloResponse> createGetIdentifiantVeloResponse(GetIdentifiantVeloResponse value) {
        return new JAXBElement<GetIdentifiantVeloResponse>(_GetIdentifiantVeloResponse_QNAME, GetIdentifiantVeloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemettreVelo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.thibault.coilliaux/", name = "remettreVelo")
    public JAXBElement<RemettreVelo> createRemettreVelo(RemettreVelo value) {
        return new JAXBElement<RemettreVelo>(_RemettreVelo_QNAME, RemettreVelo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemettreVeloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.thibault.coilliaux/", name = "remettreVeloResponse")
    public JAXBElement<RemettreVeloResponse> createRemettreVeloResponse(RemettreVeloResponse value) {
        return new JAXBElement<RemettreVeloResponse>(_RemettreVeloResponse_QNAME, RemettreVeloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VeloNonLoueParClientException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.thibault.coilliaux/", name = "VeloNonLoueParClientException")
    public JAXBElement<VeloNonLoueParClientException> createVeloNonLoueParClientException(VeloNonLoueParClientException value) {
        return new JAXBElement<VeloNonLoueParClientException>(_VeloNonLoueParClientException_QNAME, VeloNonLoueParClientException.class, null, value);
    }

}
