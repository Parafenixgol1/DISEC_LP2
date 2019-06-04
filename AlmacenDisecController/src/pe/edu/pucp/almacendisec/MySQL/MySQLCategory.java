package pe.edu.pucp.almacendisec.MySQL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.almacendisec.DAO.DAOCategory;
import pe.edu.pucp.almacendisec.model.bean.Category;

public class MySQLCategory implements DAOCategory{

//    @Override
//    public ArrayList<Category> queryAll() {
//        ArrayList<Category> listCategorys = new ArrayList<Category>();
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
//            CallableStatement cs = con.prepareCall("{call LIST_CATEGORY()}");
//            ResultSet rs = cs.executeQuery();
//            while(rs.next()){
//                Category category = new Category();
//                category.setCategory_name(rs.getString("category_name"));
//                category.setCategory_status(rs.getInt("category_status"));
//                listCategorys.add(category);
//                con.close();
//                }
//        }catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }
//    return listCategorys;
//    }

    @Override
    public int insert(Category cate) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            CallableStatement cs = con.prepareCall("{call INSERT_CATEGORY(?,?,?,?)}");
            cs.setString(2,cate.getCategory_code());
            cs.setString(3,cate.getCategory_name());
            cs.setInt(4,1);//en el status se pone activo
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int update(Category cate) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            CallableStatement cs = con.prepareCall("{call UPDATE_CATEGORY(?,?)}");
            cs.setString(1, cate.getCategory_code());
            cs.setString(2, cate.getCategory_name());
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;  
    }

    @Override
    public int delete(int id_category) {
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
