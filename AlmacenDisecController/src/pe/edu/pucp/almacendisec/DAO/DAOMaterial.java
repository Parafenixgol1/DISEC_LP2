package pe.edu.pucp.almacendisec.DAO;

import pe.edu.pucp.almacendisec.model.bean.Material;

public interface DAOMaterial {
    int insert(Material material);
    int delete(Material material);
}
