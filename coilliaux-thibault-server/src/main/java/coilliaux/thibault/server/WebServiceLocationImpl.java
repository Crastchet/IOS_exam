package coilliaux.thibault.server;

import javax.jws.WebService;

import coilliaux.thibault.server.database.Database;
import coilliaux.thibault.server.domain.Client;
import coilliaux.thibault.server.domain.Velo;
import coilliaux.thibault.server.exceptions.VeloNonLoueParClientException;

@WebService(endpointInterface = "coilliaux.thibault.server.WebServiceLocation")
public class WebServiceLocationImpl implements WebServiceLocation {
	
	private final Database BDD = Database.getInstance();

	@Override
	public long getIdentifiantClient(String prenom, String nom) {
		// TODO Auto-generated method stub
		Client client = BDD.getClientByPrenomNom(prenom, nom);
		if(client == null) {
			client = new Client(prenom,nom);			//creation client
			client.setId(BDD.incrementeIdClient());		//definition Id client
			BDD.addClient(client);						//ajout client en BDD
			System.out.println("->- Client créé");
		}
		return client.getId();
	}

	@Override
	public long getIdentifiantVelo(String matricule) {
		// TODO Auto-generated method stub
		Velo velo = BDD.getVeloByMatricule(matricule);
		if(velo == null) {
			velo = new Velo(matricule);					//creation client
			velo.setId(BDD.incrementeIdVelo());			//definition Id client
			BDD.addVelo(velo);							//ajout client en BDD
			System.out.println("->- Velo créé");
		}
		return velo.getId();
	}

	@Override
	public boolean enregistrerLocation(long idClientLoueur, long idVeloLoue) { //pas de verif client pour l'instant
		// TODO Auto-generated method stub
		if(BDD.findVeloInLocation(idVeloLoue))
			return false;
		Client c = BDD.getClientById(idClientLoueur);
		Velo v = BDD.getVeloById(idVeloLoue);
		BDD.addLocation(v, c);
		return true;
	}

	@Override
	public void remettreVelo(long idClientLoueur, long idVeloLoue) throws VeloNonLoueParClientException {
		// TODO Auto-generated method stub
		if( BDD.findVeloInLocationClient(idVeloLoue, idClientLoueur))
			throw new VeloNonLoueParClientException();
		BDD.removeLocation(idVeloLoue);	
	}

}
