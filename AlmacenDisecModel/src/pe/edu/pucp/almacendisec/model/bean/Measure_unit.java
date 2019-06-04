package pe.edu.pucp.almacendisec.model.bean;

public class Measure_unit {
    private int id_measure_unit;
    private String description;
    private int status_measure_unit;

    public Measure_unit(int id_measure_unit, String description,int status_measure_unit) {
        this.id_measure_unit = id_measure_unit;
        this.description = description;
        this.status_measure_unit=status_measure_unit;
    }

    public int getId_measure_unit() {
        return id_measure_unit;
    }

    public void setId_measure_unit(int id_measure_unit) {
        this.id_measure_unit = id_measure_unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus_measure_unit() {
        return status_measure_unit;
    }

    public void setStatus_measure_unit(int status_measure_unit) {
        this.status_measure_unit = status_measure_unit;
    }
    
}
