package pe.edu.pucp.almacendisec.model.bean;

import java.util.ArrayList;

public class Storehouse {
    private int id_storehouse;
    private String code_storehouse;
    private String storehouse_name;
    private String country;
    private String district;
    private String address;
    private int phone_number;
    private int storehouse_status;

    public Storehouse() {        
    }

    public int getId_storehouse() {
        return id_storehouse;
    }

    public void setId_storehouse(int id_storehouse) {
        this.id_storehouse = id_storehouse;
    }

    public String getCode_storehouse() {
        return code_storehouse;
    }

    public void setCode_storehouse(String code_storehouse) {
        this.code_storehouse = code_storehouse;
    }

    public String getStorehouse_name() {
        return storehouse_name;
    }

    public void setStorehouse_name(String storehouse_name) {
        this.storehouse_name = storehouse_name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public int getStorehouse_status() {
        return storehouse_status;
    }

    public void setStorehouse_status(int storehouse_status) {
        this.storehouse_status = storehouse_status;
    }   
    
}
    
