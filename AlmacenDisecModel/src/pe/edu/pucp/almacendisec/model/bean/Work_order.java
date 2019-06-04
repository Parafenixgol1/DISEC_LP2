
package pe.edu.pucp.almacendisec.model.bean;

import java.util.ArrayList;
import java.util.Date;

public class Work_order {
    private int id_work_order;
    private String code_work_order;
    private int status_work_order;
    private Date start_date;
    private Date expected_start_date;
    private Date expected_final_date;
    private Date final_date;
    private String description_work_order;
    private Customer customer;
    private Technician technician;
    private ArrayList<Work_order_line> work_details;

    public Work_order(int id_work_order, String code_work_order, int status_work_order, Date start_date, Date expected_start_date, Date expected_final_date, Date final_date, String description_work_order, Customer customer,Technician technician) {
        this.id_work_order = id_work_order;
        this.code_work_order = code_work_order;
        this.status_work_order = status_work_order;
        this.start_date = start_date;
        this.expected_start_date = expected_start_date;
        this.expected_final_date = expected_final_date;
        this.final_date = final_date;
        this.description_work_order = description_work_order;
        this.customer = customer;
        this.work_details =  new ArrayList<Work_order_line>();
        this.technician=technician;
    }
    
    public Work_order() {
        this.work_details =  new ArrayList<Work_order_line>();
    }

    public int getId_work_order() {
        return id_work_order;
    }

    public void setId_work_order(int id_work_order) {
        this.id_work_order = id_work_order;
    }

    public String getCode_work_order() {
        return code_work_order;
    }

    public void setCode_work_order(String code_work_order) {
        this.code_work_order = code_work_order;
    }

    public int getStatus_work_order() {
        return status_work_order;
    }

    public void setStatus_work_order(int status_work_order) {
        this.status_work_order = status_work_order;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getExpected_start_date() {
        return expected_start_date;
    }

    public void setExpected_start_date(Date expected_start_date) {
        this.expected_start_date = expected_start_date;
    }

    public Date getExpected_final_date() {
        return expected_final_date;
    }

    public void setExpected_final_date(Date expected_final_date) {
        this.expected_final_date = expected_final_date;
    }

    public Date getFinal_date() {
        return final_date;
    }

    public void setFinal_date(Date final_date) {
        this.final_date = final_date;
    }

    public String getDescription_work_order() {
        return description_work_order;
    }

    public void setDescription_work_order(String description_work_order) {
        this.description_work_order = description_work_order;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Work_order_line> getWork_details() {
        return work_details;
    }

    public void setWork_details(ArrayList<Work_order_line> work_details) {
        this.work_details = work_details;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }
}
