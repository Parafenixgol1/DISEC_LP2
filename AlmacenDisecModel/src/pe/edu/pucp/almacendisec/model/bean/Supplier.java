package pe.edu.pucp.almacendisec.model.bean;

import java.util.ArrayList;

public class Supplier {
    private int id_supplier;//
    private String supplier_code;
    private String supplier_name;//
    private int ruc;//este es le codigo del supplier
    private String country;//
    private String adress;//
    private int phone_number;//
    private String email;//
    private String district;//
    private int supplier_status;//
    private ArrayList<Item> items_supplier; 

    public Supplier(String supplier_name, int ruc, String country, String adress, int phone_number, String email, String district, int supplier_status, ArrayList<Item> items_supplier) {
        this.supplier_name = supplier_name;
        this.ruc = ruc;
        this.country = country;
        this.adress = adress;
        this.phone_number = phone_number;
        this.email = email;
        this.district = district;
        this.supplier_status = supplier_status;
        this.items_supplier = items_supplier;
    }

    public Supplier() {
       
    }

    public int getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(int id_supplier) {
        this.id_supplier = id_supplier;
    }

    public String getSupplier_code() {
        return supplier_code;
    }

    public void setSupplier_code(String supplier_code) {
        this.supplier_code = supplier_code;
    }
    
    
    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getSupplier_status() {
        return supplier_status;
    }

    public void setSupplier_status(int supplier_status) {
        this.supplier_status = supplier_status;
    }

    public ArrayList<Item> getItems_supplier() {
        return items_supplier;
    }

    public void setItems_supplier(ArrayList<Item> items_supplier) {
        this.items_supplier = items_supplier;
    }    
}
