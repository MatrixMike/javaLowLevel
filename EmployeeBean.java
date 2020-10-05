import java.io.Serializable;
import java.time.LocalDate;
// look up POJO   Plain Old java Object

public class EmployeeBean implements Serializable {
	 
	    private static final long serialVersionUID = -3760445487636086034L;
	    private String firstName;
	    private String lastName;
	    private LocalDate startDate;
	 
	    public EmployeeBean() {
	    }
	 
	    public EmployeeBean(String firstName, String lastName, LocalDate startDate) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.startDate = startDate;
	    }
	 
	    public String getFirstName() {
	        return firstName;
	    }
	 
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	 
	    //  additional getters/setters
	 
	}
