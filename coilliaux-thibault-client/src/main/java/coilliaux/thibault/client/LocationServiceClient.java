package coilliaux.thibault.client;

import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.apache.cxf.jaxws.JaxWsClientFactoryBean;

import coilliaux.thibault.generated.WebServiceLocation;

public class LocationServiceClient {

private WebServiceLocation service;
	
	public LocationServiceClient() {
		ClientProxyFactoryBean factory = new ClientProxyFactoryBean(new JaxWsClientFactoryBean());
		factory.setServiceClass(WebServiceLocation.class);
		factory.setAddress("http://localhost:8080/coilliaux-thibault-server/Location");
		this.service = (WebServiceLocation) factory.create();
	}
	
	public WebServiceLocation getService() {
		return this.service;
	}
	
}
