
class Musteri {
	private String name;
	private String lastname;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

public interface DAO {
	
	public void insert(Musteri musteri);
	
	public void update(Musteri musteri);
	
	public void delete(Musteri musteri);
	
}

class jdbcDAO implements DAO {
	
	public void insert(Musteri musteri) {
		
	}
	
	public void update(Musteri musteri) {
		
	}
	
	public void delete(Musteri musteri) {
		
	}
	
}

class HibermateDAO implements DAO {
	
	public void insert(Musteri musteri) {
		
	}
	
	public void update(Musteri musteri) {
		
	}
	
	public void delete(Musteri musteri) {
		
	}
	
}

class DAOHelper {

	public DAO geteDAO() {
		return null;
	}
}
