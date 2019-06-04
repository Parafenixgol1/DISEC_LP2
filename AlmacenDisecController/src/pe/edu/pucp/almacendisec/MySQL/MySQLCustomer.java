
package pe.edu.pucp.almacendisec.MySQL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.almacendisec.DAO.DAOCustomer;
import pe.edu.pucp.almacendisec.model.bean.Customer;

public class MySQLCustomer implements DAOCustomer{

//    @Override
//    public ArrayList<Customer> queryAll() {
//        ArrayList<Customer> listCustomer = new ArrayList<Customer>();
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
//            CallableStatement cs = con.prepareCall("{call LIST_CUSTOMERS()}");
//            ResultSet rs = cs.executeQuery();
//            while(rs.next()){
//                Customer customer = new Customer();
//                customer.setCustomer_code(rs.getString("customer_code"));
//                customer.setCustomer_name(rs.getString("customer_name"));
//                listCustomer.add(customer);
//                con.close();
//                }
//        }catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }
//        return listCustomer;
//    }

    
}
