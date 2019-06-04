package pe.edu.pucp.almacendisec.model.bean;

public class Category {
    private int id_category;
    private String category_code;
    private String category_name;
    private int category_status;

    public Category(String category_code, String category_name, int category_status,int category_id) {
        this.category_code = category_code;
        this.category_name = category_name;
        this.category_status = category_status;
        this.id_category=category_id;
    }

    public int getId_category() {
        return id_category;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }

    
    public String getCategory_code() {
        return category_code;
    }

    public void setCategory_code(String category_code) {
        this.category_code = category_code;
    }

    public Category() {
        
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public int getCategory_status() {
        return category_status;
    }

    public void setCategory_status(int category_status) {
        this.category_status = category_status;
    }
    
}
