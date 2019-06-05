/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.almacendisec.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.engine.util.JRLoader;
//import net.sf.jasperreports.view.JasperViewer;
import pe.edu.pucp.almacendisec.config.*;
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        /*try{
        DBManager dbManager = DBManager.getdbManager();
        Connection con = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(),dbManager.getPassword());
        
       JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile(Program.class.getResource("/pe/edu/pucp/almacendisec/reports/reporte1.jasper").getFile());
        
        HashMap hm = new HashMap();
        hm.put("FECHAI", "01-03-219");
        hm.put("FECHAF", "27-03-219");
        
        JasperPrint impresion = JasperFillManager.fillReport(reporte, hm, con);
        
        JasperViewer visor = new JasperViewer(impresion);
        
        visor.setVisible(true);
      
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }*/
    }
    
}
