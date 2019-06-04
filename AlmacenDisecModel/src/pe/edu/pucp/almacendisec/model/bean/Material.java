
package pe.edu.pucp.almacendisec.model.bean;

import java.util.ArrayList;

public class Material extends Item{
    private int id_material;
    private int material_state;
    private int min_quantity;
    private Measure_unit measure;
    private int status_material;

    public Material(int id_item_material, int material_state, int min_quantity, Measure_unit measure, int id_item, String code_item, String name_item, double price, String serie, Category category, Brand brand, Currency currency) {
        super(id_item, code_item, name_item, price, serie, category, brand, currency);
        this.id_material = id_item_material;
        this.material_state = material_state;
        this.min_quantity = min_quantity;
        this.measure = measure;
    }
    
    public Material(){
    
    }

    public int getId_item_material() {
        return id_material;
    }

    public void setId_item_material(int id_item_material) {
        this.id_material = id_item_material;
    }

    public int getMaterial_state() {
        return material_state;
    }

    public void setMaterial_state(int material_state) {
        this.material_state = material_state;
    }

    public int getMin_quantity() {
        return min_quantity;
    }

    public void setMin_quantity(int min_quantity) {
        this.min_quantity = min_quantity;
    }

    public Measure_unit getMeasure() {
        return measure;
    }

    public void setMeasure(Measure_unit measure) {
        this.measure = measure;
    }    
}
