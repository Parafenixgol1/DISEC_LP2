
package pe.edu.pucp.almacendisec.DAO;

import java.util.ArrayList;
import pe.edu.pucp.almacendisec.model.bean.Item;

public interface DAOItem {
//    public ArrayList<Item> queryAll();
    public int insert(Item item);
    public int update(Item item);
    public int delete(int id_item);
}
