package pe.edu.pucp.almacendisec.MySQL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.almacendisec.DAO.DAOEmployee;
import pe.edu.pucp.almacendisec.model.bean.Employee;

public class MySQLEmployee implements DAOEmployee{

//    @Override
//    public ArrayList<Employee> queryAll() {
//        ArrayList<Employee> listEmployees = new ArrayList<Employee>();
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
//            CallableStatement cs = con.prepareCall("{call LIST_EMPLOYEES()}");
//            ResultSet rs = cs.executeQuery();
//            while(rs.next()){
//                Employee employee = new Employee();
//                employee.setEployee_code(rs.getString("employee_code"));
//                employee.setEmployee_name(rs.getString("employee_name"));
//                employee.setLast_name(rs.getString("last_name"));
//                employee.setSecond_last_name(rs.getString("second_last_name"));
//                employee.setDni(rs.getString("dni"));
//                employee.setGender(rs.getString("gender"));
//                employee.setSalary(rs.getDouble("salary"));
//                employee.setEmployee_status(rs.getInt("employee_status"));
//                employee.setPrivilege(rs.getInt("privilege"));
//                listEmployees.add(employee);
//                con.close();
//                }
//        }catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }
//    return listEmployees;
//    }

    @Override
    public int insert(Employee emp) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            CallableStatement cs = con.prepareCall("{call INSERT_EMPLOYEE(?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(2,emp.getEployee_code());
            cs.setString(3,emp.getEmployee_name());
            cs.setString(4,emp.getLast_name());
            cs.setString(5,emp.getSecond_last_name());
            cs.setInt(6,1);
            cs.setString(7,emp.getEmail_employee());
            cs.setString(8,emp.getDni());
            cs.setString(9,emp.getGender());
            cs.setDouble(10,emp.getSalary());
            cs.setString(11,emp.getPassword());
            cs.setString(12,emp.getPrivilege().name());//esto es raro
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int update(Employee emp) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            CallableStatement cs = con.prepareCall("{call UPDATE_EMPLOYEE(?,?,?,?,?,?)}");
            cs.setString(1,emp.getEmployee_name());
            cs.setString(2,emp.getLast_name());
            cs.setString(3,emp.getSecond_last_name());
            cs.setString(4,emp.getDni());
            cs.setString(5,emp.getGender());
            cs.setDouble(6,emp.getSalary());
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result; 
    }

    @Override
    public int Delete(int id_employee) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");            
            CallableStatement cs = con.prepareCall("{call DELETE_EMPLOYEE(?)}");
            cs.setInt(1, id_employee);
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result; 
    }

    
    
}
