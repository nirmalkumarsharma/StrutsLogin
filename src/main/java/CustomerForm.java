import org.apache.struts.action.ActionForm;

public class CustomerForm extends ActionForm {
	
	private String firstName;
	private String lastName;
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
	public CustomerForm() {
		this.firstName="";
		this.lastName="";
	}
}
