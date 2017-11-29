package coilliaux.thibault.server.database;

import java.util.ArrayList;
import java.util.HashMap;

import coilliaux.thibault.server.domain.Client;
import coilliaux.thibault.server.domain.Velo;


public final class Database {
	
	private long lastIdClient;
	private long lastIdVelo;
	
	private ArrayList<Client> clients;
	private ArrayList<Velo> velos;
	private HashMap<Velo,Client> locations;
	
	private static Database INSTANCE;
	private Database() {
		this.lastIdClient = 0;
		this.clients = new ArrayList<Client>();
		this.velos = new ArrayList<>();
		this.locations = new HashMap<>();
	}
	
	public static Database getInstance() {
		if(INSTANCE == null )
			INSTANCE = new Database();
		return INSTANCE;
	}
	
	public long incrementeIdClient() {
		return ++this.lastIdClient;
	}
	
	public long incrementeIdVelo() {
		return ++this.lastIdVelo;
	}
	
	
	public void clearData() {
		this.velos.clear();
		this.clients.clear();
		this.locations.clear();
	}
	
	
	public void addClient(Client customer) {
		if(customer.getId() == -1) {
			System.out.println("Tentative ajout client sans id ! (Database:addClient)");
			return;
		}
		this.clients.add(customer);
	}
	
	public void removeClient(Client customer) {
		if( ! this.clients.remove(customer) )
			System.out.println("Tentative suppression client qui n'existe pas ! (Database:removeClient)");
	}
	
	public Client getClientById(long id) {
		Client c = new Client();
		c.setId(id);
		return this.clients.get( this.clients.indexOf( c ) );
	}
	
	public Client getClientByPrenomNom(String firstname, String lastname) { // tricky
		for(Client c : this.clients) {
			if(c.getPrenom().equals(firstname) && c.getNom().equals(lastname))
				return c;
		}
		System.out.println("Client non trouvé (Database:getClientByPrenomNom)");
		return null;
	}
	
	public void addVelo(Velo velo) {
		if(velo.getId() == -1) {
			System.out.println("Tentative ajout velo sans id ! (Database:addVelo)");
			return;
		}
		this.velos.add(velo);
	}
	
	public void removeVelo(Velo velo) {
		if( ! this.velos.remove(velo) )
			System.out.println("Tentative suppression velo qui n'existe pas ! (Database:removeVelo)");
	}
	
	public Velo getVeloById(long id) {
		Velo v = new Velo();
		v.setId(id);
		return this.velos.get( this.velos.indexOf( v ) );
	}
	
	public Velo getVeloByMatricule(String matricule) {
		for(Velo v : this.velos) {
			if(v.getMatricule().equals(matricule))
				return v;
		}
		System.out.println("Velo non trouvé (Database:getVeloByMatricule)");
		return null;
	}
	
	public boolean findVeloInLocation(long idVelo) {
		Velo v = new Velo();
		v.setId(idVelo);
		return this.locations.containsKey(v);
	}
	
	public boolean findVeloInLocationClient(long idVelo, long idClient) {
		Velo v = new Velo();
		v.setId(idVelo);
		return this.locations.get(v).getId() == idClient;
	}
	
	public void addLocation(Velo velo, Client client) {
		this.locations.put(velo, client);
	}
	
	public void removeLocation(long idVelo) {
		Velo v = new Velo();
		v.setId(idVelo);
		this.locations.remove(v);
	}
	
}

