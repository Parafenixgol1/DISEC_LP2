package pe.edu.pucp.almacendisec.model.bean;

import java.util.ArrayList;

public class Item {
    private int id_item;
    private String code_item;
    private String name_item;
    private double price;
    private String serie;   
    private Supplier suppliers; 
    private Category category;
    private Brand brand;
    private Currency currency;

    public Item(int id_item, String code_item, String name_item, double price, String serie, Category category, Brand brand, Currency currency) {
        this.id_item = id_item;
        this.code_item = code_item;
        this.name_item = name_item;
        this.price = price;
        this.serie = serie;
        //this.suppliers = new ArrayList<Supplier>();
        this.category = category;
        this.brand = brand;
        this.currency=currency;        
    }
    
    public Item(){
        //this.suppliers = new ArrayList<Supplier>();
    }

    public int getId_item() {
        return id_item;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    public String getCode_item() {
        return code_item;
    }

    public void setCode_item(String code_item) {
        this.code_item = code_item;
    }

    public String getName_item() {
        return name_item;
    }

    public void setName_item(String name_item) {
        this.name_item = name_item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Supplier getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Supplier suppliers) {
        this.suppliers = suppliers;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }    

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
    
}
