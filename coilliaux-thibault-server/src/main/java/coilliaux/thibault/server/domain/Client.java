package coilliaux.thibault.server.domain;

public class Client {

	private long id;
	private String prenom;
	private String nom;
	
	public Client() { this.id = -1; }

	 //attention avec le super, fait-il vraiment "id=-1" ?
	public Client(String prenom, String nom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
    
	@Override
	public boolean equals(Object o) {
		return this.getId() == ((Client) o).getId();
	}
}
