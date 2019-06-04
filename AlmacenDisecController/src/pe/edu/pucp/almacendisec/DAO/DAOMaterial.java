package pe.edu.pucp.almacendisec.DAO;

import pe.edu.pucp.almacendisec.model.bean.Material;
import pe.edu.pucp.almacendisec.model.bean.Stock;

public interface DAOMaterial {
    int insert(Material material,int id_storehouse,Stock stock);
    int delete(int id_material);
}
