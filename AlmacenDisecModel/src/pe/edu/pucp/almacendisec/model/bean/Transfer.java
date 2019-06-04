package pe.edu.pucp.almacendisec.model.bean;

import java.util.ArrayList;
import java.util.Date;

public class Transfer {
    private int id_transfer;
    private Date departure_date;
    private Date entry_date;
    private int status_tranfer;
    private Storehouse storehouse_origin;
    private Storehouse storehouse_destiny;
    private ArrayList<Transfer_line> tranfer_lines;

    public Transfer(int id_transfer, Date departure_date, Date entry_date, int status_tranfer, Storehouse storehouse_origin, Storehouse storehouse_destiny) {
        this.id_transfer = id_transfer;
        this.departure_date = departure_date;
        this.entry_date = entry_date;
        this.status_tranfer = status_tranfer;
        this.storehouse_origin = storehouse_origin;
        this.storehouse_destiny = storehouse_destiny;
        this.tranfer_lines=new ArrayList<Transfer_line>();
    }

    public int getId_transfer() {
        return id_transfer;
    }

    public void setId_transfer(int id_transfer) {
        this.id_transfer = id_transfer;
    }

    public int getStatus_tranfer() {
        return status_tranfer;
    }

    public void setStatus_tranfer(int status_tranfer) {
        this.status_tranfer = status_tranfer;
    }

    public Date getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(Date departure_date) {
        this.departure_date = departure_date;
    }

    public Date getEntry_date() {
        return entry_date;
    }

    public void setEntry_date(Date entry_date) {
        this.entry_date = entry_date;
    }

    public Storehouse getStorehouse_origin() {
        return storehouse_origin;
    }

    public void setStorehouse_origin(Storehouse storehouse_origin) {
        this.storehouse_origin = storehouse_origin;
    }

    public Storehouse getStorehouse_destiny() {
        return storehouse_destiny;
    }

    public void setStorehouse_destiny(Storehouse storehouse_destiny) {
        this.storehouse_destiny = storehouse_destiny;
    }

    public ArrayList<Transfer_line> getTranfer_lines() {
        return tranfer_lines;
    }

    public void setTranfer_lines(ArrayList<Transfer_line> tranfer_lines) {
        this.tranfer_lines = tranfer_lines;
    }
    
    
    
    
}
