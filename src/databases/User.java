package databases;

public class User {
    String Name;
    String employeeID;
    String nationality;

    public User(){}
    public User(String Name, String employeeID){
        this.Name = Name;
        this.employeeID = employeeID;
    }
    public User(String Name, String employeeID, String nationality){
        this.Name = Name;
        this.employeeID = employeeID;
        this.nationality = nationality;

    }
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) { this.nationality = nationality; }
}
