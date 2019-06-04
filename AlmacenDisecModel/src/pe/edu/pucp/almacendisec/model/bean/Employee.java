package pe.edu.pucp.almacendisec.model.bean;

public class Employee {
    private int id_employee;
    private String employee_name;
    private String last_name;
    private String second_last_name;
    private String dni;    
    private int employee_status;
    private String eployee_code;
    private String gender;
    private Privilege privilege;
    private String email_employee;
    private String password;
    private double salary;

    public Employee(int id_employee, String employee_name, String last_name, String second_last_name, String dni, int employee_status, String eployee_code, String gender, Privilege privilege, String email_employee, String password, double salary) {
        this.id_employee = id_employee;
        this.employee_name = employee_name;
        this.last_name = last_name;
        this.second_last_name = second_last_name;
        this.dni = dni;
        this.employee_status = employee_status;
        this.eployee_code = eployee_code;
        this.gender = gender;
        this.privilege = privilege;
        this.email_employee = email_employee;
        this.password = password;
        this.salary = salary;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getSecond_last_name() {
        return second_last_name;
    }

    public void setSecond_last_name(String second_last_name) {
        this.second_last_name = second_last_name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEmployee_status() {
        return employee_status;
    }

    public void setEmployee_status(int employee_status) {
        this.employee_status = employee_status;
    }

    public String getEployee_code() {
        return eployee_code;
    }

    public void setEployee_code(String eployee_code) {
        this.eployee_code = eployee_code;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Privilege getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Privilege privilege) {
        this.privilege = privilege;
    }

    public String getEmail_employee() {
        return email_employee;
    }

    public void setEmail_employee(String email_employee) {
        this.email_employee = email_employee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }  
}
