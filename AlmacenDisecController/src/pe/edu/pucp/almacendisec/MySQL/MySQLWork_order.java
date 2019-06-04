
package pe.edu.pucp.almacendisec.MySQL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import pe.edu.pucp.almacendisec.DAO.DAOWork_order;
import pe.edu.pucp.almacendisec.model.bean.Item;
import pe.edu.pucp.almacendisec.model.bean.Material;
import pe.edu.pucp.almacendisec.model.bean.Tool;
import pe.edu.pucp.almacendisec.model.bean.Work_order;
import pe.edu.pucp.almacendisec.model.bean.Work_order_line;

public class MySQLWork_order implements DAOWork_order{

//    @Override
//    public ArrayList<Work_order> queryAll() {
//        ArrayList<Work_order> listCategorys = new ArrayList<Work_order>();
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
//            CallableStatement cs = con.prepareCall("{call LIST_WORK_DETAILS()}");
//            ResultSet rs = cs.executeQuery();
//            while(rs.next()){
//                Work_order work_order = new Work_order();
//                work_order.setWork_order_code(rs.getString("work_order_code"));
//                work_order.setStart_date(rs.getDate("start_date"));
//                work_order.setFinal_date(rs.getDate("final_date"));
//                work_order.setWork_order_description(rs.getString("work_order_description"));
//                work_order.setWork_order_status(rs.getInt("work_order_status"));
//                for(Work_order_detail detail : work_order.getWork_details()){
//                    Item i=new Item();
////                    PreparedStatement ps = con.prepareStatement("SELECT ")
//                    detail.setQuantity(rs.getInt("quantity"));
//                }
//                listCategorys.add(work_order);
//                con.close();
//                }
//        }catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }
//    return listCategorys;
//    }
//
    @Override
    public int insert(Work_order work_order) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            CallableStatement cs = con.prepareCall("{call INSERT_WORK_ORDER(?,?,?,?,?,?,?,?,?,?)}");
            cs.registerOutParameter(1, Types.INTEGER);
            cs.setString(2,work_order.getCode_work_order());
            cs.setString(3,work_order.getDescription_work_order());
            cs.setDate(4,new java.sql.Date(work_order.getStart_date().getTime()));
            cs.setDate(5,new java.sql.Date(work_order.getFinal_date().getTime()));
            cs.setDate(6,new java.sql.Date(work_order.getExpected_start_date().getTime()));
            cs.setDate(7,new java.sql.Date(work_order.getExpected_final_date().getTime()));
            cs.setInt(8,1);//en el status se pone activo
            cs.setInt(9,work_order.getCustomer().getId_customer());
            cs.setInt(10,work_order.getTechnician().getId_employee());
            result = cs.executeUpdate();
            int id=cs.getInt(1);
            //se inserta el detalle de orden de trabajo
            for(Work_order_line d : work_order.getWork_details()){
                CallableStatement c2=con.prepareCall("{call INSERT_WORK_ORDER_LINE(?,?,?,?)}");
                c2.setInt(2,d.getQuantity());
                c2.setInt(3, id);
                c2.setInt(4,d.getItem().getId_item());
                c2.executeUpdate();
                result = c2.executeUpdate();
            }            
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int update(Work_order work_order) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            CallableStatement cs = con.prepareCall("{call INSERT_WORK_ORDER(?,?,?,?,?,?,?,?,?,?)}");
            cs.registerOutParameter(1, Types.INTEGER);
            cs.setString(2,work_order.getCode_work_order());
            cs.setString(3,work_order.getDescription_work_order());
            cs.setDate(4,new java.sql.Date(work_order.getStart_date().getTime()));
            cs.setDate(5,new java.sql.Date(work_order.getFinal_date().getTime()));
            cs.setDate(6,new java.sql.Date(work_order.getExpected_start_date().getTime()));
            cs.setDate(7,new java.sql.Date(work_order.getExpected_final_date().getTime()));
            cs.setInt(8,1);//en el status se pone activo
            cs.setInt(9,work_order.getCustomer().getId_customer());
            cs.setInt(10,work_order.getTechnician().getId_employee());
            result = cs.executeUpdate();
            int id=cs.getInt(1);
            //se inserta el detalle de orden de trabajo
            for(Work_order_line d : work_order.getWork_details()){
                CallableStatement c2=con.prepareCall("{call INSERT_WORK_ORDER_LINE(?,?,?,?)}");
                c2.setInt(2,d.getQuantity());
                c2.setInt(3, id);
                c2.setInt(4,d.getItem().getId_item());
                c2.executeUpdate();
                result = c2.executeUpdate();
            }            
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int delete(Work_order  work_order) {
        int result=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            CallableStatement cs = con.prepareCall("{call DELETE_WORK_ORDER(?)}");
            cs.setInt(1,work_order.getId_work_order());
            result = cs.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result; 
    }
    }
    
