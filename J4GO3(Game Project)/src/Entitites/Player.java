package Entitites;

public class Player{

	int id;
	String firstName;
	String lastName;
	String nationatilyId;
	int dateOfBirth;
	String playerName;
	
	public Player(int id, String firstName, String lastName, String nationatilyId, int dateOfBirth, String playerName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationatilyId = nationatilyId;
		this.dateOfBirth = dateOfBirth;
		this.playerName = playerName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationatilyId() {
		return nationatilyId;
	}

	public void setNationatilyId(String nationatilyId) {
		this.nationatilyId = nationatilyId;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	
}
