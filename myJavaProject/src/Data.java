import java.io.Serializable;

public class Data implements Serializable {
    // private static final long serialVersionUID = 1L;
    private String firstName;
    private  String lastName;
    private String  age;
    
    public Data(String firstName, String lastname, String age){
        this.firstName =  firstName ;
        this.lastName =  lastname ;
        this.age =  age ;
    }

    /**
     * @return String return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return String return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return String return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    
    @Override
    public String toString() {
        return "info: firstName=" + firstName + ", lastName=" + lastName + ", Age=" + age  ;
    }

}


