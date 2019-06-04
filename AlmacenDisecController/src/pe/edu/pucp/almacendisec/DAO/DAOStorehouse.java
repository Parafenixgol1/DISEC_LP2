
package pe.edu.pucp.almacendisec.DAO;

import java.util.ArrayList;
import pe.edu.pucp.almacendisec.model.bean.Storehouse;

public interface DAOStorehouse {
//    public ArrayList<Storehouse> queryAll();
    public int insert(Storehouse stor);
    public int update(Storehouse stor);
    public int delete(int id_storehouse);
}
