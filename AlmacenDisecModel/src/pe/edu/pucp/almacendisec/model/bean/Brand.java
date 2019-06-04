
package pe.edu.pucp.almacendisec.model.bean;

public class Brand {
    private int id_brand;
    private String brand_code;
    private String brand_name;
    private int brand_status;

    public Brand(String brand_code, String brand_name, int brand_status,int id_brand) {
        this.brand_code = brand_code;
        this.brand_name = brand_name;
        this.brand_status = brand_status;
        this.id_brand=id_brand;
    }

    public Brand() {
    }

    public int getId_brand() {
        return id_brand;
    }

    public void setId_brand(int id_brand) {
        this.id_brand = id_brand;
    }

    
    public String getBrand_code() {
        return brand_code;
    }

    public void setBrand_code(String brand_code) {
        this.brand_code = brand_code;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public int getBrand_status() {
        return brand_status;
    }

    public void setBrand_status(int brand_status) {
        this.brand_status = brand_status;
    }
    
}
