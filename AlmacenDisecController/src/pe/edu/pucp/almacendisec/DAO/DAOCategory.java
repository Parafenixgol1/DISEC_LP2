package pe.edu.pucp.almacendisec.DAO;

import java.util.ArrayList;
import pe.edu.pucp.almacendisec.model.bean.Category;

public interface DAOCategory {
//    public ArrayList<Category > queryAll();
    public int insert(Category  cate);
    public int update(Category  cate);
    public int delete(int id_category);
}
