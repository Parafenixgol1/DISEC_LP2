package pe.edu.pucp.almacendisec.MySQL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import pe.edu.pucp.almacendisec.DAO.DAOMaterial;
import pe.edu.pucp.almacendisec.model.bean.Material;
import pe.edu.pucp.almacendisec.model.bean.Stock;

public class MySQLMaterial implements DAOMaterial{

    @Override
    public int insert(Material material,int id_storehouse,Stock stock) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            CallableStatement cs = con.prepareCall("{call INSERT_MATERIAL(?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(2,material.getCode_item());
            cs.setString(3,material.getName_item());
            cs.setDouble(4,material.getPrice());         
            cs.setInt(5,material.getCurrency().ordinal());
            cs.setString(6,material.getSerie());
            cs.setInt(7,material.getBrand().getId_brand());
            cs.setInt(8,material.getCategory().getId_category());
            cs.setInt(9,material.getId_item());
            cs.setInt(10,material.getMin_quantity());
            cs.setInt(11,material.getMeasure().getId_measure_unit());
            cs.setInt(12,1);
            cs.setInt(13,material.getSuppliers().getId_supplier());
            cs.setDate(14,new java.sql.Date(new Date().getTime()));            
            cs.setInt(11,stock.getActual_quantity());
            cs.setInt(12,id_storehouse);
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int delete(int id_material) {
       int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");            
            CallableStatement cs = con.prepareCall("{call DELETE_MATERIAL(?)}");
            cs.setInt(1,id_material);
            result = cs.executeUpdate();            
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result; 
    }
    
}
