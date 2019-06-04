
package pe.edu.pucp.almacendisec.MySQL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.almacendisec.DAO.DAOItem;
import pe.edu.pucp.almacendisec.model.bean.Item;
import pe.edu.pucp.almacendisec.model.bean.Material;
import pe.edu.pucp.almacendisec.model.bean.Tool;

public class MySQLItem implements DAOItem{

//    @Override
//    public ArrayList<Item> queryAll() {
////        ArrayList<Item> listItem = new ArrayList<Item>();
////        try{
////            Class.forName("com.mysql.cj.jdbc.Driver");
////            Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
//////            if(item instanceof Material)
//////            CallableStatement cs = con.prepareCall("{call LIST_MATERIAL()}");
//////            ResultSet rs = cs.executeQuery();
//////            while(rs.next()){
//////                Item brand = new Item();
//////                brand.setBrand_code(rs.getString("brand_code"));
//////                brand.setBrand_name(rs.getString("brand_name"));
//////                brand.setBrand_status(rs.getInt("brand_status"));
////                listItem.add(brand);
////                con.close();
////        }
////        }catch(Exception ex){
////            System.out.println(ex.getMessage());
////        } 
////    return listItem;
////        
//    }

    @Override
    public int insert(Item item) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            CallableStatement cs = con.prepareCall("{call INSERT_ITEM(?,?,?)}");
            cs.setString(1,item.getItem_name());
            cs.setDouble(2,item.getPrice());
            cs.setInt(3,item.getStock());
            cs.setString(4,item.getSerie());
            cs.setInt(5,item.getItem_type());
            cs.setString(6,item.getBrand().getBrand_code());
            cs.setString(7,item.getCategory().getCategory_code());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        if(item instanceof Material){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
                CallableStatement c1 = con.prepareCall("{call INSERT_MATERIAL(?,?,?)}");    
                c1.setString(1,item.getItem_code());
                c1.setInt(2, ((Material) item).getMin_quantity());
                c1.setInt(3,1);//en el status se pone activo
                result = c1.executeUpdate();
            }
            catch(Exception ex){
            System.out.println(ex.getMessage());
            }
            if(item instanceof Tool){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");

                CallableStatement c2 = con.prepareCall("{call INSERT_TOOL(?,?)}");    
                c2.setString(1,item.getItem_code());
                c2.setInt(2,1);//en el status se pone activo
                result = c2.executeUpdate();
            }
            catch(Exception ex){
            System.out.println(ex.getMessage());
            }
        }
                   
    }
        return result;
    }

    @Override
    public int update(Item item) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            CallableStatement cs = con.prepareCall("{call UPDATE_ITEM(?,?,?)}");
            cs.setString(1,item.getItem_name());
            cs.setDouble(2,item.getPrice());
            cs.setInt(3,item.getStock());
            cs.setString(4,item.getSerie());
            cs.setInt(5,item.getItem_type());
            cs.setString(6,item.getBrand().getBrand_code());
            cs.setString(7,item.getCategory().getCategory_code());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        if(item instanceof Material){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
                CallableStatement c1 = con.prepareCall("{call UPDATE_MATERIAL(?,?,?)}");    
                c1.setString(1,item.getItem_code());
                c1.setInt(2, ((Material) item).getMin_quantity());
                c1.setInt(3, ((Material) item).getMaterial_state());
                result = c1.executeUpdate();
            }
            catch(Exception ex){
            System.out.println(ex.getMessage());
            }
        }
            if(item instanceof Tool){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");

                CallableStatement c2 = con.prepareCall("{call UPDATE_TOOL(?,?)}");    
                c2.setString(1, item.getItem_code());
                c2.setInt(2, ((Tool) item).getTool_state());
                result = c2.executeUpdate();
            }
            catch(Exception ex){
            System.out.println(ex.getMessage());
            }
        }
        return result;
        
    }

    @Override
    public int delete(int id_item) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            CallableStatement cs = con.prepareCall("{call DELETE_CATEGORY(?)}");
            cs.setInt(1, id_category);
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result; 
    }
}
  
