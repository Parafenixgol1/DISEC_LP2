package pe.edu.pucp.almacendisec.DAO;

import pe.edu.pucp.almacendisec.model.bean.Measure_unit;

public interface DAOMeasure_Unit {
    int insert(Measure_unit measure);
    int delete(int id_measure_unit);    
}
