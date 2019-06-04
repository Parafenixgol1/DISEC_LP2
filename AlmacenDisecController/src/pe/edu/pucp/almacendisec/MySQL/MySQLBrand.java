
package pe.edu.pucp.almacendisec.MySQL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.almacendisec.DAO.DAOBrand;
import pe.edu.pucp.almacendisec.model.bean.Brand;

public class MySQLBrand implements DAOBrand {

//    @Override
//    public ArrayList<Brand> queryAll() {
//        ArrayList<Brand> listBrands = new ArrayList<Brand>();
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
//            CallableStatement cs = con.prepareCall("{call LIST_BRANDS()}");
//            ResultSet rs = cs.executeQuery();
//            while(rs.next()){
//                Brand brand = new Brand();
//                brand.setBrand_code(rs.getString("brand_code"));
//                brand.setBrand_name(rs.getString("brand_name"));
//                brand.setBrand_status(rs.getInt("brand_status"));
//                listBrands.add(brand);
//                con.close();
//                }
//        }catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }
//    return listBrands;
//    }

    @Override
    public int insert(Brand brand) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            CallableStatement cs = con.prepareCall("{call INSERT_BRAND(?,?,?,?)}");
            cs.setString(2,brand.getBrand_code());
            cs.setString(3, brand.getBrand_name());
            cs.setInt(4,1);//en el status se pone activo
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int update(Brand brand) { //corregir
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            CallableStatement cs = con.prepareCall("{call UPDATE_BRAND(?,?)}");
            cs.setString(1, brand.getBrand_code());
            cs.setString(2, brand.getBrand_name());
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;              
    }

    @Override
    public int delete(int id_brand) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            
            CallableStatement cs = con.prepareCall("{call DELETE_BRAND(?)}");
            cs.setInt(1,id_brand);
            result = cs.executeUpdate();            
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result; 
    }    
}
