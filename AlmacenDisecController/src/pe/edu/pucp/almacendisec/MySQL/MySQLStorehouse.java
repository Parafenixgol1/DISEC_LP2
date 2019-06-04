
package pe.edu.pucp.almacendisec.MySQL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.almacendisec.DAO.DAOStorehouse;
import pe.edu.pucp.almacendisec.model.bean.Storehouse;

public class MySQLStorehouse implements DAOStorehouse{

//    @Override
//    public ArrayList<Storehouse> queryAll() {
//         ArrayList<Storehouse> listStorehouse = new ArrayList<Storehouse>();
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
//            CallableStatement cs = con.prepareCall("{call LIST_STOREHOUSES()}");
//            ResultSet rs = cs.executeQuery();
//            while(rs.next()){
//                Storehouse storehouse = new Storehouse();
//                storehouse.setStorehouse_code(rs.getString("storehouse_code"));
//                storehouse.setStorehouse_name(rs.getString("storehouse_name"));
//                storehouse.setDistrict(rs.getString("address"));
//                storehouse.setDistrict(rs.getString("distict"));
//                storehouse.setCountry(rs.getString("country"));
//                storehouse.setPhone_number(rs.getInt("phone_number"));
//                storehouse.setStorehouse_status(rs.getInt("storehouse_status"));
//                listStorehouse.add(storehouse);
//                con.close();
//            }
//        }catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }
//    return listStorehouse;
//    }

    @Override
    public int insert(Storehouse stor) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            CallableStatement cs = con.prepareCall("{call INSERT_STOREHOUSE(?,?,?,?,?,?,?,?)}");
            cs.setString(2,stor.getCode_storehouse());
            cs.setString(3,stor.getStorehouse_name());
            cs.setString(4,stor.getAddress());
            cs.setString(5,stor.getDistrict());
            cs.setString(6,stor.getCountry());
            cs.setInt(7,stor.getPhone_number());
            cs.setInt(8,1);//en el status se pone activo
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int update(Storehouse stor) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            CallableStatement cs = con.prepareCall("{call UPDATE_STOREHOUSE(?,?,?,?,?)}");
            cs.setString(1,stor.getStorehouse_name());
            cs.setString(2,stor.getAddress());
            cs.setString(3,stor.getDistrict());
            cs.setString(4,stor.getCountry());
            cs.setInt(5,stor.getPhone_number());
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;          
    }

    @Override
    public int delete(int id_storehouse) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            CallableStatement cs = con.prepareCall("{call DELETE_STOREHOUSE(?)}");
            cs.setInt(1, id_storehouse);
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
}
