
package pe.edu.pucp.almacendisec.MySQL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.almacendisec.DAO.DAOSupplier;
import pe.edu.pucp.almacendisec.model.bean.Supplier;

public class MySQLSupplier implements DAOSupplier{

//    @Override
//    public ArrayList<Supplier> queryAll() {
//        ArrayList<Supplier> listSupplier = new ArrayList<Supplier>();
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
//            CallableStatement cs = con.prepareCall("{call LIST_SUPPLIERS()}");
//            ResultSet rs = cs.executeQuery();
//            while(rs.next()){
//                Supplier supplier = new Supplier();
//                supplier.setSupplier_name(rs.getString("supplier_name"));
//                supplier.setRuc(rs.getString("ruc"));
//                supplier.setCountry(rs.getString("country"));
//                supplier.setAdress(rs.getString("address"));
//                supplier.setPhone_number(rs.getInt("phone_number"));
//                supplier.setEmail(rs.getString("email"));
//                supplier.setSupplier_status(rs.getInt("supplier_status"));
//                listSupplier.add(supplier);
//                con.close();
//                }
//        }catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }
//    return listSupplier;
//    }

    @Override
    public int insert(Supplier sup) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            CallableStatement cs = con.prepareCall("{call INSERT_SUPPLIER(?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(2,sup.getSupplier_code());
            cs.setString(3, sup.getSupplier_name());
            cs.setInt(4,sup.getRuc());
            cs.setString(5, sup.getCountry());
            cs.setString(6, sup.getAdress());
            cs.setInt(7, sup.getPhone_number());
            cs.setString(8,sup.getDistrict());
            cs.setString(9, sup.getEmail());
            cs.setInt(10,1);//en el status se pone activo
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int update(Supplier sup) {
         int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            CallableStatement cs = con.prepareCall("{call UPDATE_SUPPLIER(?,?,?,?,?,?,?)}");
            cs.setString(1,sup.getSupplier_name());
            cs.setInt(2,sup.getRuc());
            cs.setString(3,sup.getCountry());
            cs.setString(4,sup.getAdress());
            cs.setInt(5,sup.getPhone_number());
            cs.setString(6,sup.getEmail());
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result; 
    }

    @Override
    public int delete(int id_supplier) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            PreparedStatement ps = con.prepareStatement("{call DELETE_SUPPLIER(?)}");
            ps.setInt(1,id_supplier);
            result = ps.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result; 
    }
    
}
