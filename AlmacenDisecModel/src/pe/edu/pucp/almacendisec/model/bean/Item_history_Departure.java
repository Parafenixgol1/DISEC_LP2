package pe.edu.pucp.almacendisec.model.bean;

import java.util.Date;

public class Item_history_Departure {
    private int id_item_history_departure;
    private Date departure_item;
    private int quantity;
    private Item item;
    private Work_order work_order;
    
    
    public Item_history_Departure(int id_item_history_departure, Date departure_item, int quantity) {
        this.id_item_history_departure = id_item_history_departure;
        this.departure_item = departure_item;
        this.quantity = quantity;
    }

    public int getId_item_history_departure() {
        return id_item_history_departure;
    }

    public void setId_item_history_departure(int id_item_history_departure) {
        this.id_item_history_departure = id_item_history_departure;
    }

    public Date getDeparture_item() {
        return departure_item;
    }

    public void setDeparture_item(Date departure_item) {
        this.departure_item = departure_item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }        
}
