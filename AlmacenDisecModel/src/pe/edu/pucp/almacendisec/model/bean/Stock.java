package pe.edu.pucp.almacendisec.model.bean;

public class Stock {
    private int id_stock;
    private int actual_quantity;
    private Item item;
    private Storehouse storehouse;

    public Stock(int id_stock, int actual_quantity, Item item,Storehouse storehouse) {
        this.id_stock = id_stock;
        this.actual_quantity = actual_quantity;
        this.item = item;
        this.storehouse=storehouse;
    }

    public int getId_stock() {
        return id_stock;
    }

    public void setId_stock(int id_stock) {
        this.id_stock = id_stock;
    }

    public int getActual_quantity() {
        return actual_quantity;
    }

    public void setActual_quantity(int actual_quantity) {
        this.actual_quantity = actual_quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Storehouse getStorehouse() {
        return storehouse;
    }

    public void setStorehouse(Storehouse storehouse) {
        this.storehouse = storehouse;
    }        
}
