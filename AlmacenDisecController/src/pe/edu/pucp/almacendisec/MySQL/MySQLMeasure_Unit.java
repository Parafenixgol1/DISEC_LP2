package pe.edu.pucp.almacendisec.MySQL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import pe.edu.pucp.almacendisec.DAO.DAOMeasure_Unit;
import pe.edu.pucp.almacendisec.model.bean.Measure_unit;

public class MySQLMeasure_Unit implements DAOMeasure_Unit{

    @Override
    public int insert(Measure_unit measure) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            CallableStatement cs = con.prepareCall("{call INSERT_MEASUREMENT_UNIT(?,?,?)}");
            cs.setString(2,measure.getDescription());
            cs.setInt(3,1);
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int delete(int id_measure_unit) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            PreparedStatement ps = con.prepareStatement("{call DELETE_MEASUREMENT_UNIT(?)}");
            ps.setInt(1,id_measure_unit);
            result = ps.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result; 
    }
    
}
