
package pe.edu.pucp.almacendisec.DAO;

import java.util.ArrayList;
import pe.edu.pucp.almacendisec.model.bean.Supplier;

public interface DAOSupplier {
//    public ArrayList<Supplier> queryAll();
    public int insert(Supplier sup);
    public int update(Supplier sup);
    public int delete(int id_supplier);
}
