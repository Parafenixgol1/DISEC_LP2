
package pe.edu.pucp.almacendisec.model.bean;

import java.util.ArrayList;

public class Customer {
    private int id_customer;
    private String customer_name;
    private String customer_code;

    public Customer(int id_customer, String customer_name, String customer_code, ArrayList<Work_order> workorders) {
        this.id_customer = id_customer;
        this.customer_name = customer_name;
        this.customer_code = customer_code;
    }
    
    public Customer() {
        
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_code() {
        return customer_code;
    }

    public void setCustomer_code(String customer_code) {
        this.customer_code = customer_code;
    }

}
