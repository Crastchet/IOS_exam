package coilliaux.thibault.server;

import javax.jws.WebService;

import coilliaux.thibault.server.exceptions.VeloNonLoueParClientException;

@WebService
public interface WebServiceLocation {
	
	public long getIdentifiantClient(String prenom, String nom);
	public long getIdentifiantVelo(String matricule);
	public boolean enregistrerLocation(long idClientLoueur, long idVeloLoue);
	public void remettreVelo(long idClientLoueur, long idVeloLoue)
		throws VeloNonLoueParClientException;
}
