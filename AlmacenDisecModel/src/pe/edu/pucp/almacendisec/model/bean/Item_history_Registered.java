package pe.edu.pucp.almacendisec.model.bean;

import java.util.Date;

public class Item_history_Registered {
    private int id_item_history_registered;
    private Date registered_item;
    private Item item;
    private Supplier supplier;
    private int quantity;

    public Item_history_Registered(int id_item_history_registered, Date registered_item, Item item, Supplier supplier, int quantity) {
        this.id_item_history_registered = id_item_history_registered;
        this.registered_item = registered_item;
        this.item = item;
        this.supplier = supplier;
        this.quantity = quantity;
    }

    public int getId_item_history_registered() {
        return id_item_history_registered;
    }

    public void setId_item_history_registered(int id_item_history_registered) {
        this.id_item_history_registered = id_item_history_registered;
    }

    public Date getRegistered_item() {
        return registered_item;
    }

    public void setRegistered_item(Date registered_item) {
        this.registered_item = registered_item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    
    
    
}
