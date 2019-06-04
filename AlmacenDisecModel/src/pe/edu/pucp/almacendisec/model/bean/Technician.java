package pe.edu.pucp.almacendisec.model.bean;


public class Technician extends Employee{

    public Technician(int id_employee, String employee_name, String last_name, String second_last_name, String dni, int employee_status, String eployee_code, String gender, Privilege privilege, String email_employee, String password, double salary) {
        super(id_employee, employee_name, last_name, second_last_name, dni, employee_status, eployee_code, gender, privilege, email_employee, password, salary);
    }     
}
