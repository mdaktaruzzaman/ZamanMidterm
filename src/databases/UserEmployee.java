package databases;

public class UserEmployee {
    String Name;
    String employeeID;
    String nationality;

    public UserEmployee(){}
    public UserEmployee(String employeeName, String employeeID){
        this.Name = employeeName;
        this.employeeID = employeeID;
    }
    public UserEmployee(String Name, String employeeID, String nationality){
        this.Name = Name;
        this.employeeID = employeeID;
        this.nationality = nationality;

    }
    public String getEmplName() {
        return Name;
    }

    public void setEmplName(String emplName) {
        this.Name = Name;
    }

    public String getEmplID() {
        return employeeID;
    }

    public void setEmplID(String emplID) {
        this.employeeID = employeeID;
    }

    public String getEmplDOB() {
        return nationality;
    }

    public void setEmplDOB(String emplDOB) {
        this.nationality = nationality;
    }
}
