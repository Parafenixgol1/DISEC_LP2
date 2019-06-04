package pe.edu.pucp.almacendisec.model.bean;

import java.util.ArrayList;

public class Tool extends Item{
    private int id_tool;
    private int tool_state;

    public Tool(int id_tool, int tool_state, int id_item, String code_item, String name_item, double price, String serie, Category category, Brand brand, Currency currency) {
        super(id_item, code_item, name_item, price, serie, category, brand, currency);
        this.id_tool = id_tool;
        this.tool_state = tool_state;
    }

    public Tool() {
    }

    public int getId_tool() {
        return id_tool;
    }

    public void setId_tool(int id_tool) {
        this.id_tool = id_tool;
    }
    
    public int getTool_state() {
        return tool_state;
    }

    public void setTool_state(int tool_state) {
        this.tool_state = tool_state;
    }
}
