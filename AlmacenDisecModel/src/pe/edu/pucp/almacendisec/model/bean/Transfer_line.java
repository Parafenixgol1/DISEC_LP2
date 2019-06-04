package pe.edu.pucp.almacendisec.model.bean;

public class Transfer_line {
    private int id_transfer_line;
    private int quantity;
    private Material material;

    public Transfer_line(int id_transfer_line, int quantity, Material material) {
        this.id_transfer_line = id_transfer_line;
        this.quantity = quantity;
        this.material = material;
    }

    public int getId_transfer_line() {
        return id_transfer_line;
    }

    public void setId_transfer_line(int id_transfer_line) {
        this.id_transfer_line = id_transfer_line;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
    
    
}
