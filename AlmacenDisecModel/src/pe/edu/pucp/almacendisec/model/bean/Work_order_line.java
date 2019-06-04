
package pe.edu.pucp.almacendisec.model.bean;

public class Work_order_line {
    private int id_work_order_line;
    private int quantity;
    private Item item;

    public Work_order_line(int id_work_order_detail, int quantity, Item item) {
        this.id_work_order_line = id_work_order_detail;
        this.quantity = quantity;
        this.item = item;
    }

    public int getId_work_order_detail() {
        return id_work_order_line;
    }

    public void setId_work_order_detail(int id_work_order_detail) {
        this.id_work_order_line = id_work_order_detail;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }
    
}
