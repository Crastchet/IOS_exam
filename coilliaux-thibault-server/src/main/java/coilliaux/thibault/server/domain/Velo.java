package coilliaux.thibault.server.domain;

public class Velo {
	
	private long id;
	private String matricule;
	
	
	public Velo() { this.id = -1; }
	
	 //attention avec le super, fait-il vraiment "id=-1" ?
	public Velo(String matricule) {
		super();
		this.matricule = matricule;
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	
	@Override
	public boolean equals(Object o) {
		return this.getId() == ((Velo) o).getId();
	}
}
