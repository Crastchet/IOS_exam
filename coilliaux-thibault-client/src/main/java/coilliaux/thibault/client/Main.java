package coilliaux.thibault.client;

import coilliaux.thibault.generated.WebServiceLocation;

public class Main {

	
	public static void main(String[] args) {
		LocationServiceClient client = new LocationServiceClient();
		WebServiceLocation port = client.getService();
		
		System.out.println(port.getIdentifiantClient("Thibault", "Coilliaux"));
		System.out.println(port.getIdentifiantClient("Antoine", "Coilliaux"));
	}
}
