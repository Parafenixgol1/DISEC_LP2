
package pe.edu.pucp.almacendisec.DAO;

import java.util.ArrayList;
import pe.edu.pucp.almacendisec.model.bean.Employee;


public interface DAOEmployee {
//    public ArrayList<Employee> queryAll();
    public int insert(Employee emp);
    public int update(Employee emp);
    public int Delete(int id_employee);
}
