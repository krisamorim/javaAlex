import java.util.Objects;

public class User {
	private String firstName;
	private String lastName;
	
	//getter and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		//foi modificado para mudar o nome para maiúsculas
		this.firstName = firstName.toUpperCase();
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName.toUpperCase();
	}
	
	//------------------------------toString
	@Override
	public String toString() {
		return "[firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	//-------------------------hashCode and equals
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	}
	
	
}
