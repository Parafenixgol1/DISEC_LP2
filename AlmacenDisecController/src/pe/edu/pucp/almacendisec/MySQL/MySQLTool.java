package pe.edu.pucp.almacendisec.MySQL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import pe.edu.pucp.almacendisec.DAO.DAOTool;
import pe.edu.pucp.almacendisec.model.bean.Stock;
import pe.edu.pucp.almacendisec.model.bean.Tool;

public class MySQLTool implements DAOTool{

    @Override
    public int insert(Tool tool,int id_storehouse,Stock stock) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            CallableStatement cs = con.prepareCall("{call INSERT_TOOL(?,?,?,?)}");
            cs.setString(2,tool.getCode_item());
            cs.setInt(3,1);
            cs.setString(4,tool.getName_item());         
            cs.setString(5,tool.getCurrency().name());
            cs.setString(6,tool.getSerie());
            cs.setInt(7,tool.getBrand().getId_brand());
            cs.setInt(8,tool.getCategory().getId_category());
            cs.setInt(9,tool.getSuppliers().getId_supplier());
            cs.setDate(10,new java.sql.Date(new Date().getTime()));
            cs.setInt(11,id_storehouse);
            cs.setInt(11,stock.getActual_quantity());
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int delete(Tool tool) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
