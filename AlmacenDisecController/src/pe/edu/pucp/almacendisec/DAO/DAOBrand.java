package pe.edu.pucp.almacendisec.DAO;

import java.util.ArrayList;
import pe.edu.pucp.almacendisec.model.bean.Brand;

public interface DAOBrand {
//    public ArrayList<Brand > queryAll();
    public int insert(Brand brand);
    public int update(Brand brand);
    public int delete(int id_brand);
}
