
package pe.edu.pucp.almacendisec.DAO;

import java.util.ArrayList;
import pe.edu.pucp.almacendisec.model.bean.Work_order;

public interface DAOWork_order {
//    public ArrayList<Work_order > queryAll();
    public int insert(Work_order  work_order);
    public int update(Work_order  work_order);
    public int delete(Work_order  work_order);
}
