package pe.edu.pucp.almacendisec.DAO;

import pe.edu.pucp.almacendisec.model.bean.Stock;
import pe.edu.pucp.almacendisec.model.bean.Tool;

public interface DAOTool {
    int insert(Tool tool,int id_storehouse,Stock stock);
    int delete(int id_tool);
}
