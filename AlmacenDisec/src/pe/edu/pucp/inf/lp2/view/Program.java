/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.lp2.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Victor Alonso Vergara 20141826
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://sallka.lab.inf.pucp.edu.pe:3306/inf282g5","inf282g5", "Cs0omP");
            
        JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile(Program.class.getResource("/pe/edu/pucp/inf/lp2/reports/OITCustomerReport.jasper").getFile());
        
        HashMap hm = new HashMap();
        String codigo =  JOptionPane.showInputDialog(null,"Ingrese un código de cliente:");
        hm.put("CODIGOCLIENTE",codigo);
        
        JasperPrint impresion = JasperFillManager.fillReport(reporte, hm, con);
        
        JasperViewer visor = new JasperViewer(impresion);
        
        visor.setVisible(true);
      
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    
    }
    
}
